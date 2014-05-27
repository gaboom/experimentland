package experiment.domain.model.xml;

import experiment.domain.AbstractDomainObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
@XmlSeeAlso({Exception.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapBodyResponse extends AbstractDomainObject {
	@XmlElement(name = "GetCurrentExchangeRatesResponse")
	private GetCurrentExchangeRatesResponse getCurrentExchangeRatesResponse;

	public GetCurrentExchangeRatesResponse getGetCurrentExchangeRatesResponse() {
		return getCurrentExchangeRatesResponse;
	}

	public void setGetCurrentExchangeRatesResponse(GetCurrentExchangeRatesResponse getCurrentExchangeRatesResponse) {
		this.getCurrentExchangeRatesResponse = getCurrentExchangeRatesResponse;
	}
}
