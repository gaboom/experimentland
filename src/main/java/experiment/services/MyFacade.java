package experiment.services;

import experiment.domain.MyInput;
import experiment.domain.MyOutput;
import experiment.domain.Processor;
import experiment.services.remote.MyRemote;
import experiment.services.transformer.MyTransformer;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class MyFacade implements Processor<MyInput, MyOutput> {
	@Resource
	private MyTransformer myTransformer;
	@Resource
	MyRemote myRemote;
	
	@Override
	public MyOutput process(MyInput input) {
		MyOutput result = new MyOutput();
		
		myTransformer.apply(result, input);
		myRemote.apply(result, null);
		
		return result;
	}
}
