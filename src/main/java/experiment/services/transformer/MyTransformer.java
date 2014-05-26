package experiment.services.transformer;

import experiment.domain.ApplicationException;
import experiment.domain.Command;
import experiment.domain.MyInput;
import experiment.domain.MyOutput;
import org.springframework.stereotype.Component;

@Component
public class MyTransformer implements Command<MyOutput, MyInput> {
	@Override
	public void apply(MyOutput result, MyInput input) {
		if (input == null) {
			result.setMyText("No input received.");
		} else {
			if (input.getMyValue() == null) {
				throw new NullPointerException();
			}
			if ("error".equals(input.getMyValue())) {
				throw new ApplicationException();
			}
			result.setMyText(input.getMyName() + " - " + input.getMyValue());
		}
		result.setMySecretText("CLIENT_ID_SUPER_SECRET");
	}
}
