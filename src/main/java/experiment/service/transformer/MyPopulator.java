package experiment.service.transformer;

import experiment.domain.model.MyOutput;
import experiment.domain.stereotypes.Command;
import experiment.service.remote.MyXmlRemote;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class MyPopulator implements Command<MyOutput, Void> {
	@Resource
	private MyXmlRemote myXmlRemote;
	
	@Override
	public void apply(MyOutput subject, Void argument) {
		String data1 = myXmlRemote.process(null);
		subject.setMyField(data1);
	}
}
