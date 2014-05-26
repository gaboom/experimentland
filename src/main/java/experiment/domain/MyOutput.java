package experiment.domain;

import org.codehaus.jackson.annotate.JsonIgnore;

/** Example JSON output.
 * 
 *  Example how to hide specific fields.
 */
public class MyOutput extends AbstractDomainObject {
	private String myText; 	
	@JsonIgnore
	private String mySecretText; 	

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
	}

	public String getMySecretText() {
		return mySecretText;
	}

	public void setMySecretText(String mySecretText) {
		this.mySecretText = mySecretText;
	}
}
