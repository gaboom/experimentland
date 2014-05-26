package experiment.domain;

import org.codehaus.jackson.annotate.JsonProperty;

/** Example JSON input.
 * 
 * Example how to name fields differently.
 */
public class MyInput extends AbstractDomainObject {
	@JsonProperty("my_name")
	private String myName;
	private String myValue;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getMyValue() {
		return myValue;
	}

	public void setMyValue(String myValue) {
		this.myValue = myValue;
	}
}
