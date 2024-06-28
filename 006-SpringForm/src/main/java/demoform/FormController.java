package demoform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/getdata")
	public String getdata() {
		
		return "display";
	}

}
