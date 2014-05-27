package experiment.domain.model.xml;

import experiment.domain.AbstractDomainObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "Envelope", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
@XmlSeeAlso({Exception.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapEnvelopeRequest extends AbstractDomainObject {
	public SoapEnvelopeRequest() {
		this.soapBodyRequest = new SoapBodyRequest();
	}
	
	@XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
	private SoapBodyRequest soapBodyRequest;	

	public SoapBodyRequest getSoapBodyRequest() {
		return soapBodyRequest;
	}

	public void setSoapBodyRequest(SoapBodyRequest soapBodyRequest) {
		this.soapBodyRequest = soapBodyRequest;
	}
}
