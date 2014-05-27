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
public class SoapBodyRequest extends AbstractDomainObject {
	public SoapBodyRequest() {
		this.getCurrentExchangeRates = new GetCurrentExchangeRates();
	}

	@XmlElement(name = "GetCurrentExchangeRates")
	private GetCurrentExchangeRates getCurrentExchangeRates;

	public GetCurrentExchangeRates getGetCurrentExchangeRates() {
		return getCurrentExchangeRates;
	}

	public void setGetCurrentExchangeRates(GetCurrentExchangeRates getCurrentExchangeRates) {
		this.getCurrentExchangeRates = getCurrentExchangeRates;
	}

}
