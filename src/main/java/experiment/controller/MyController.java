package experiment.controller;

import experiment.domain.exception.ApplicationException;
import experiment.domain.model.MyInput;
import experiment.domain.model.MyOutput;
import experiment.service.MyFacade;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * References:
 * 
 * Spring REST Controller: http://docs.spring.io/spring/docs/3.2.0.RELEASE/spring-framework-reference/html/mvc.html#mvc-ann-requestmapping-uri-templates 
 * Sprint REST Client: http://docs.spring.io/spring/docs/3.2.0.RELEASE/spring-framework-reference/html/remoting.html#rest-client-access
 * Spring XML mapper: http://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/oxm.html
 * Jackson JSON annotations: http://wiki.fasterxml.com/JacksonAnnotations
 * JAXB XML annotations: http://docs.oracle.com/javase/tutorial/jaxb/intro/ and https://jaxb.java.net/tutorial/
 */
@Controller
@RequestMapping("/example.json")
public class MyController {
	private static final Logger LOG = LoggerFactory.getLogger(MyController.class);
	@Resource
	MyFacade myFacade;

	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody ResponseEntity<MyOutput> myMethod(@RequestBody(required = false) MyInput input) {
		MyOutput result;
		try {
			result = myFacade.process(input);
		} catch (RuntimeException ex) {
			LOG.warn("Request failed:", ex);
			return new ResponseEntity<>(ex instanceof ApplicationException ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}	

}
