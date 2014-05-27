package experiment.service.remote;

import experiment.domain.exception.ApplicationException;
import experiment.domain.model.xml.SoapEnvelopeRequest;
import experiment.domain.model.xml.SoapEnvelopeResponse;
import experiment.domain.stereotypes.Processor;
import java.net.URI;
import java.net.URISyntaxException;
import javax.annotation.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/** Example XML-over-HTTP with JAXB and RestTemplate example.
 * Endpoint: http://www.mnb.hu/arfolyamok.asmx?op=GetCurrentExchangeRates
 * 
 * The response contains an XML in CDATA you could further parse with spring OXM marshaller/unmarshaller:
 * - create package of domain model using JAXB annotations (if you have xsd, use xjc to generate https://jaxb.java.net/2.2.4/docs/xjc.html)
 * - declare a new bean of org.springframework.oxm.jaxb.Jaxb2Marshaller, list bound classes
 * - use this marshaller directly anywhere
 */
@Component
public class MyXmlRemote implements Processor<Void, String> {
	@Resource
	RestTemplate mnbRestTemplate;

	@Override
	public String process(Void input) {
		URI uri = null;
		try {
			uri = new URI("http://www.mnb.hu/arfolyamok.asmx");
		} catch (URISyntaxException ex) {
		}
		
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(MediaType.TEXT_XML);
		requestHeaders.add("SOAPAction", "http://www.mnb.hu/webservices/GetCurrentExchangeRates");
		
		SoapEnvelopeRequest requestBody = new SoapEnvelopeRequest();
		
		HttpEntity<SoapEnvelopeRequest> request = new HttpEntity<>(requestBody, requestHeaders);
		ResponseEntity<SoapEnvelopeResponse> response = mnbRestTemplate.postForEntity(uri, request, SoapEnvelopeResponse.class);

		if (response.getStatusCode() == HttpStatus.OK) {
			return response.getBody().getSoapBodyResponse().getGetCurrentExchangeRatesResponse().getGetCurrentExchangeRatesResult().getRates();
		} else {
			throw new ApplicationException("MNB request failed.");
		}
	}
	
}
