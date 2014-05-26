package experiment.controllers;

import experiment.domain.MyInput;
import experiment.domain.MyOutput;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * References:
 * http://wiki.fasterxml.com/JacksonAnnotations
 * http://docs.spring.io/spring/docs/3.2.0.RELEASE/spring-framework-reference/html/mvc.html#mvc-ann-requestmapping-uri-templates 
 */
@Controller
@RequestMapping("/example.json")
public class XmlToJson {

	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody MyOutput get(@RequestBody(required = false) MyInput input) {
		MyOutput result = new MyOutput();
		if (input == null) {
			result.setMyText("No input received.");
		} else {
			result.setMyText(input.getMyName() + " - " + input.getMyValue());
		}
		result.setMySecretText("CLIENT_ID_SUPER_SECRET");

		return result;
	}	

}
