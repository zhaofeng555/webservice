package hjg.ws;

import javax.jws.WebService;

@WebService(endpointInterface="hjg.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "hello world jax-ws "+name;
	}

}
