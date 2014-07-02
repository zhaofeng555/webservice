package com.hjg.cxf;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.hjg.cxf.interceptor.AddHeaderInterceptor;
import com.hjg.cxf.ws.Cat;
import com.hjg.cxf.ws.Entry;
import com.hjg.cxf.ws.HelloWorld;
import com.hjg.cxf.ws.StringCat;
import com.hjg.cxf.ws.User;
import com.hjg.cxf.ws.impl.HelloWorldWs;

public class ClientMain {

	public static void main(String[] args) {
		HelloWorldWs factory = new HelloWorldWs();
		HelloWorld hw = factory.getHelloWorldWsPort();
		
		Client client = ClientProxy.getClient(hw);
		client.getOutInterceptors().add(new AddHeaderInterceptor("haojg", "haojg"));
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		
		System.out.println(hw.sayHi("风哥"));
		
		User u = new User();
		u.setId(1);
		u.setUsername("sun");
		u.setPassword("1122");
		u.setAddress("家");
		List<Cat> cats = hw.getCatByUser(u);
		for (Cat c : cats) {
			System.out.println(c.getName()+",  "+c.getColor());
		}
		
		StringCat sc = hw.getCats();
		List<Entry> ens = sc.getEntries();
		for (Entry en : ens) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
