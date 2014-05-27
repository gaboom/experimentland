
package hu.mnb.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCurrentExchangeRatesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCurrentExchangeRatesResult"
})
@XmlRootElement(name = "GetCurrentExchangeRatesResponse")
public class GetCurrentExchangeRatesResponse {

    @XmlElement(name = "GetCurrentExchangeRatesResult")
    protected String getCurrentExchangeRatesResult;

    /**
     * Gets the value of the getCurrentExchangeRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCurrentExchangeRatesResult() {
        return getCurrentExchangeRatesResult;
    }

    /**
     * Sets the value of the getCurrentExchangeRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCurrentExchangeRatesResult(String value) {
        this.getCurrentExchangeRatesResult = value;
    }

}
