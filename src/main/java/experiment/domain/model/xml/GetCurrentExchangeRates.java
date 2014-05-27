package experiment.domain.model.xml;

import experiment.domain.AbstractDomainObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "GetCurrentExchangeRates")
@XmlSeeAlso({Exception.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCurrentExchangeRates extends AbstractDomainObject {
	
}
