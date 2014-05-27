package experiment.service.remote;

import experiment.domain.stereotypes.Processor;
import hu.mnb.webservices.MNBArfolyamService;
import hu.mnb.webservices.MNBArfolyamServiceSoap;
import org.springframework.stereotype.Component;

/** Example WS invocation.
 * http://krams915.blogspot.sg/2010/12/spring-ws-mvc-implementing-client.html
 * http://www.mnb.hu/arfolyamok.asmx?WSDL
 */
@Component
public class MyWsRemote implements Processor<Void, String>{
	private MNBArfolyamServiceSoap service = new MNBArfolyamService().getMNBArfolyamServiceSoap();

	@Override
	public String process(Void input) {
		return service.getCurrencies();
	}
		
}
