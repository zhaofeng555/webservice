package com.hjg.cxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2014-06-05T22:25:17.042+08:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://ws.cxf.hjg.com/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCats", targetNamespace = "http://ws.cxf.hjg.com/", className = "com.hjg.cxf.ws.GetCats")
    @WebMethod
    @ResponseWrapper(localName = "getCatsResponse", targetNamespace = "http://ws.cxf.hjg.com/", className = "com.hjg.cxf.ws.GetCatsResponse")
    public com.hjg.cxf.ws.StringCat getCats();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCatByUser", targetNamespace = "http://ws.cxf.hjg.com/", className = "com.hjg.cxf.ws.GetCatByUser")
    @WebMethod
    @ResponseWrapper(localName = "getCatByUserResponse", targetNamespace = "http://ws.cxf.hjg.com/", className = "com.hjg.cxf.ws.GetCatByUserResponse")
    public java.util.List<com.hjg.cxf.ws.Cat> getCatByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.hjg.cxf.ws.User arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://ws.cxf.hjg.com/", className = "com.hjg.cxf.ws.SayHi")
    @WebMethod
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://ws.cxf.hjg.com/", className = "com.hjg.cxf.ws.SayHiResponse")
    public java.lang.String sayHi(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
