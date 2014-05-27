package experiment.service;

import experiment.domain.model.MyInput;
import experiment.domain.model.MyOutput;
import experiment.domain.stereotypes.Processor;
import experiment.service.transformer.MyPopulator;
import experiment.service.transformer.MyTransformer;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class MyFacade implements Processor<MyInput, MyOutput> {
	@Resource
	private MyTransformer myTransformer;
	@Resource
	private MyPopulator myPopulator;
	
	@Override
	public MyOutput process(MyInput input) {
		MyOutput result = new MyOutput();
		
		myTransformer.apply(result, input);
		myPopulator.apply(result, null);
		
		return result;
	}
}
