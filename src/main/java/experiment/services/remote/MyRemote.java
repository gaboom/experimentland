package experiment.services.remote;

import experiment.domain.Command;
import experiment.domain.MyOutput;
import org.springframework.stereotype.Component;

@Component
public class MyRemote implements Command<MyOutput, Void> {
	@Override
	public void apply(MyOutput subject, Void argument) {
		
	}
}
