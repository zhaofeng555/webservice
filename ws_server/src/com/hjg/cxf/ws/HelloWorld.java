package com.hjg.cxf.ws;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.hjg.cxf.adapter.FkXmlAdapter;
import com.hjg.cxf.model.Cat;
import com.hjg.cxf.model.User;

@WebService
public interface HelloWorld {

	public String sayHi(String username);
	List<Cat> getCatByUser(User user);
	
	//cxf不能处理Map<String, Cat类型
	//我们采用fkxmladapter来处理
	@XmlJavaTypeAdapter(FkXmlAdapter.class)
	Map<String, Cat> getCats();
	
}
