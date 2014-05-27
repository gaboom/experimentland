
package hu.mnb.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * MNB curreny exchange rate webservice.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MNBArfolyamService", targetNamespace = "http://www.mnb.hu/webservices/", wsdlLocation = "http://www.mnb.hu/arfolyamok.asmx?WSDL")
public class MNBArfolyamService
    extends Service
{

    private final static URL MNBARFOLYAMSERVICE_WSDL_LOCATION;
    private final static WebServiceException MNBARFOLYAMSERVICE_EXCEPTION;
    private final static QName MNBARFOLYAMSERVICE_QNAME = new QName("http://www.mnb.hu/webservices/", "MNBArfolyamService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.mnb.hu/arfolyamok.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MNBARFOLYAMSERVICE_WSDL_LOCATION = url;
        MNBARFOLYAMSERVICE_EXCEPTION = e;
    }

    public MNBArfolyamService() {
        super(__getWsdlLocation(), MNBARFOLYAMSERVICE_QNAME);
    }

    public MNBArfolyamService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MNBARFOLYAMSERVICE_QNAME, features);
    }

    public MNBArfolyamService(URL wsdlLocation) {
        super(wsdlLocation, MNBARFOLYAMSERVICE_QNAME);
    }

    public MNBArfolyamService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MNBARFOLYAMSERVICE_QNAME, features);
    }

    public MNBArfolyamService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MNBArfolyamService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MNBArfolyamServiceSoap
     */
    @WebEndpoint(name = "MNBArfolyamServiceSoap")
    public MNBArfolyamServiceSoap getMNBArfolyamServiceSoap() {
        return super.getPort(new QName("http://www.mnb.hu/webservices/", "MNBArfolyamServiceSoap"), MNBArfolyamServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MNBArfolyamServiceSoap
     */
    @WebEndpoint(name = "MNBArfolyamServiceSoap")
    public MNBArfolyamServiceSoap getMNBArfolyamServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.mnb.hu/webservices/", "MNBArfolyamServiceSoap"), MNBArfolyamServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MNBARFOLYAMSERVICE_EXCEPTION!= null) {
            throw MNBARFOLYAMSERVICE_EXCEPTION;
        }
        return MNBARFOLYAMSERVICE_WSDL_LOCATION;
    }

}
