package experiment.service.transformer;

import experiment.domain.exception.ApplicationException;
import experiment.domain.stereotypes.Command;
import experiment.domain.model.MyInput;
import experiment.domain.model.MyOutput;
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
