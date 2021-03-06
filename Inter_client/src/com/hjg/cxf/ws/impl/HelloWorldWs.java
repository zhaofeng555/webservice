package com.hjg.cxf.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.hjg.cxf.ws.HelloWorld;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2014-06-05T22:25:17.299+08:00
 * Generated source version: 2.7.7
 * 
 */
@WebServiceClient(name = "HelloWorldWs", 
                  wsdlLocation = "http://localhost:8888/cxf?wsdl",
                  targetNamespace = "http://impl.ws.cxf.hjg.com/") 
public class HelloWorldWs extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.ws.cxf.hjg.com/", "HelloWorldWs");
    public final static QName HelloWorldWsPort = new QName("http://impl.ws.cxf.hjg.com/", "HelloWorldWsPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8888/cxf?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorldWs.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8888/cxf?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldWs(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldWs(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldWs() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldWs(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldWs(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldWs(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldWsPort")
    public HelloWorld getHelloWorldWsPort() {
        return super.getPort(HelloWorldWsPort, HelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldWsPort")
    public HelloWorld getHelloWorldWsPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldWsPort, HelloWorld.class, features);
    }

}
