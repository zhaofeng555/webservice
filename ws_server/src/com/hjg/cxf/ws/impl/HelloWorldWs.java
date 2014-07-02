package com.hjg.cxf.ws.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.hjg.cxf.model.Cat;
import com.hjg.cxf.model.User;
import com.hjg.cxf.ws.HelloWorld;
import com.hjg.cxf.ws.UserService;

@WebService(endpointInterface="com.hjg.cxf.ws.HelloWorld",serviceName="HelloWorldWs")
public class HelloWorldWs implements HelloWorld {

	@Override
	public String sayHi(String username) {
		return username+"。 你好，现在时间："+new Date();
	}

	@Override
	public List<Cat> getCatByUser(User user) {
		UserService us = new UserServiceImpl();
		return us.getCatsByUser(user);
	}

	@Override
	public Map<String, Cat> getCats() {
		UserService us = new UserServiceImpl();
		return us.getCats();
	}

}
