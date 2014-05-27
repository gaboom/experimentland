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
public class SoapEnvelopeResponse extends AbstractDomainObject {
	@XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
	private SoapBodyResponse soapBodyResponse;	

	public SoapBodyResponse getSoapBodyResponse() {
		return soapBodyResponse;
	}

	public void setSoapBodyResponse(SoapBodyResponse soapBodyResponse) {
		this.soapBodyResponse = soapBodyResponse;
	}
}
