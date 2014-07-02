package com.hjg.cxf.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

//通过PhaseInterceptor指定拦截器在哪个阶段起作用
public class AuthInerceptor extends AbstractPhaseInterceptor<SoapMessage> {

	public AuthInerceptor() {
		// super调用父类，显式调用父类构造函数，
		// 拦截器将会“调用之前”拦截SOAP消息
		super(Phase.PRE_INVOKE);
	}

	// 实现自己的拦截器，需要实现handleMessage方法
	// handleMessage方法中的形参就是被拦截到Soap消息
	// 一旦程序获取了SOAP消息，剩下的事情可以解析SOAP消息或修改SOAP消息
	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		System.out.println("---------------" + msg);

		// 从这里，我们已经拦截了soap消息
		// 得到soap的消息所有的Header
		List<Header> headers = msg.getHeaders();

		// 如果根本没有Header
		if (headers == null || headers.size() < 1) {
			throw new Fault(new IllegalArgumentException("没有Headers可供调用！"));
		}

		Header firstHeader = headers.get(0);
		Element ele = (Element)firstHeader.getObject();
		NodeList userIds = ele.getElementsByTagName("userId");
		NodeList userPasses = ele.getElementsByTagName("userPass");
		
		if(userIds.getLength()!=1){
			throw new Fault(new IllegalArgumentException("用户名格式不对！"));
		}
		if(userPasses.getLength()!=1){
			throw new Fault(new IllegalArgumentException("密码格式不对！"));
		}

		String userId = userIds.item(0).getTextContent();
		String userPass = userPasses.item(0).getTextContent();
		
		//查询数据库，比对用户名、密码
		if(!userId.equals("haojg") || !userPass.equals("haojg")){
			throw new Fault(new IllegalArgumentException("用户名或密码不正确"));
		}
	}

}
