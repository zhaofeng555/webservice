package com.hjg.cxf;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.EndpointImpl;

import com.hjg.cxf.interceptor.AuthInerceptor;
import com.hjg.cxf.ws.impl.HelloWorldWs;

public class ServerMain {

	public static void main(String[] args) {
		EndpointImpl ep = (EndpointImpl)Endpoint.publish("http://localhost:8888/cxf", new HelloWorldWs());
		
		//添加In拦截器，该AuthInterceptor就会负责检查用户名、密码
		ep.getInInterceptors().add(new AuthInerceptor());
		
		System.out.println("web server 启动……");
	}

}
