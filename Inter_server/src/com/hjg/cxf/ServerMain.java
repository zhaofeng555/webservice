package com.hjg.cxf;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;

import com.hjg.cxf.ws.impl.HelloWorldWs;

public class ServerMain {

	public static void main(String[] args) {
		EndpointImpl ep = (EndpointImpl)Endpoint.publish("http://localhost:8888/cxf", new HelloWorldWs());
		ep.getInInterceptors().add(new LoggingInInterceptor());
		ep.getOutInterceptors().add(new LoggingOutInterceptor());
		System.out.println("web server 启动……");
	}

}
