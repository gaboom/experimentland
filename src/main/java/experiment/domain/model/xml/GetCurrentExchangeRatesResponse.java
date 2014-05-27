package experiment.domain.model.xml;

import experiment.domain.AbstractDomainObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "GetCurrentExchangeRatesResponse")
@XmlSeeAlso({Exception.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCurrentExchangeRatesResponse extends AbstractDomainObject {
	@XmlElement(name= "GetCurrentExchangeRatesResult")
	private GetCurrentExchangeRatesResult getCurrentExchangeRatesResult;

	public GetCurrentExchangeRatesResult getGetCurrentExchangeRatesResult() {
		return getCurrentExchangeRatesResult;
	}

	public void setGetCurrentExchangeRatesResult(GetCurrentExchangeRatesResult getCurrentExchangeRatesResult) {
		this.getCurrentExchangeRatesResult = getCurrentExchangeRatesResult;
	}
}
