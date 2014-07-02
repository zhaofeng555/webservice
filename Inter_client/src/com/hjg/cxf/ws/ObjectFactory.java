
package com.hjg.cxf.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hjg.cxf.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCatsResponse_QNAME = new QName("http://ws.cxf.hjg.com/", "getCatsResponse");
    private final static QName _SayHi_QNAME = new QName("http://ws.cxf.hjg.com/", "sayHi");
    private final static QName _SayHiResponse_QNAME = new QName("http://ws.cxf.hjg.com/", "sayHiResponse");
    private final static QName _GetCatByUserResponse_QNAME = new QName("http://ws.cxf.hjg.com/", "getCatByUserResponse");
    private final static QName _GetCatByUser_QNAME = new QName("http://ws.cxf.hjg.com/", "getCatByUser");
    private final static QName _GetCats_QNAME = new QName("http://ws.cxf.hjg.com/", "getCats");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hjg.cxf.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link GetCatByUserResponse }
     * 
     */
    public GetCatByUserResponse createGetCatByUserResponse() {
        return new GetCatByUserResponse();
    }

    /**
     * Create an instance of {@link GetCats }
     * 
     */
    public GetCats createGetCats() {
        return new GetCats();
    }

    /**
     * Create an instance of {@link GetCatByUser }
     * 
     */
    public GetCatByUser createGetCatByUser() {
        return new GetCatByUser();
    }

    /**
     * Create an instance of {@link GetCatsResponse }
     * 
     */
    public GetCatsResponse createGetCatsResponse() {
        return new GetCatsResponse();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link Cat }
     * 
     */
    public Cat createCat() {
        return new Cat();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link StringCat }
     * 
     */
    public StringCat createStringCat() {
        return new StringCat();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cxf.hjg.com/", name = "getCatsResponse")
    public JAXBElement<GetCatsResponse> createGetCatsResponse(GetCatsResponse value) {
        return new JAXBElement<GetCatsResponse>(_GetCatsResponse_QNAME, GetCatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cxf.hjg.com/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cxf.hjg.com/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cxf.hjg.com/", name = "getCatByUserResponse")
    public JAXBElement<GetCatByUserResponse> createGetCatByUserResponse(GetCatByUserResponse value) {
        return new JAXBElement<GetCatByUserResponse>(_GetCatByUserResponse_QNAME, GetCatByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cxf.hjg.com/", name = "getCatByUser")
    public JAXBElement<GetCatByUser> createGetCatByUser(GetCatByUser value) {
        return new JAXBElement<GetCatByUser>(_GetCatByUser_QNAME, GetCatByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cxf.hjg.com/", name = "getCats")
    public JAXBElement<GetCats> createGetCats(GetCats value) {
        return new JAXBElement<GetCats>(_GetCats_QNAME, GetCats.class, null, value);
    }

}
