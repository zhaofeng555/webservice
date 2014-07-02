package com.hjg.cxf.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AddHeaderInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	private String userId;
	private String userPass;
	
	public AddHeaderInterceptor(String userId, String userPass) {
		super(Phase.PREPARE_SEND);
		this.userId=userId;
		this.userPass=userPass;
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		List<Header> headers = message.getHeaders();
		
		Document doc = DOMUtils.createDocument();
		Element ele = doc.createElement("authHeader");
		Element idEle = doc.createElement("userId");
		idEle.setTextContent(userId);
		Element passEle = doc.createElement("userPass");
		passEle.setTextContent(userPass);
		ele.appendChild(idEle);
		ele.appendChild(passEle);
		
		/*生成XML文档片段
		<authHeader>
			<userId>aaa</userId>
			<userPass>aaa</userPass>
		</authHeader>
		*/
		
		//qname随便起的名字
		QName qn = new QName("haojg");
		Header h = new Header(qn, ele);
		headers.add(h);
		
	}

}
