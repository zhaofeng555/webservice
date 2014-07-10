package hjg.ws.client;

import hjg.ws.HelloWorld;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://ws.hjg/", "HelloWorldImplService");
        Service service =Service.create(url, qname);
        HelloWorld hw = service.getPort(HelloWorld.class);
        String rs = hw.getHelloWorldAsString("haojg");
        System.out.println(rs);
	}

}
