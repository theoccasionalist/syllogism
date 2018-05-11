package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SyllogismController {
	
	@RequestMapping(value = "syllogisms")
	public String shouldDisplaySyllogismsView() {
		return "syllogisms";
	}
	
}
