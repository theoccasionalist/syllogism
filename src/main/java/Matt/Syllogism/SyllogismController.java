package Matt.Syllogism;
import Matt.Syllogism.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SyllogismController {
	
	@RequestMapping("/syllogisms")
	public String shouldDisplaySyllogismsView() {
		return "syllogisms";
	}
	
}
