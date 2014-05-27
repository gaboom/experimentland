package experiment.domain.model;

import experiment.domain.AbstractDomainObject;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/** Example JSON output.
 * 
 *  Example how to hide specific fields.
 */
public class MyOutput extends AbstractDomainObject {
	private String myText; 	
	@JsonProperty("my_rates_xml_cdata")
	private String myField;
	private String myCurrencies;
	@JsonIgnore
	private String mySecretText; 	

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
	}

	public String getMyField() {
		return myField;
	}

	public void setMyField(String myField) {
		this.myField = myField;
	}

	public String getMySecretText() {
		return mySecretText;
	}

	public void setMySecretText(String mySecretText) {
		this.mySecretText = mySecretText;
	}

	public String getMyCurrencies() {
		return myCurrencies;
	}

	public void setMyCurrencies(String myCurrencies) {
		this.myCurrencies = myCurrencies;
	}
}
