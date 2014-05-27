package experiment.domain.model.xml;

import experiment.domain.AbstractDomainObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "GetCurrentExchangeRatesResult")
@XmlSeeAlso({Exception.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCurrentExchangeRatesResult extends AbstractDomainObject {
	@XmlValue
	private String rates;

	public String getRates() {
		return rates;
	}

	public void setRates(String rates) {
		this.rates = rates;
	}
}
