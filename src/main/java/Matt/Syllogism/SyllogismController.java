package Matt.Syllogism;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import propositions.DetermineProposition;
import propositions.Proposition;
import syllogisms.Syllogism;
import syllogisms.SyllogismTempRepo;

@Controller
public class SyllogismController {
	
	@RequestMapping("/syllogisms")
	public String displaySyllogismsView() {
		return "syllogisms";
	}
	
	@RequestMapping("/add-syllogism") 
		public String makeSyllogism (Model model, @RequestParam String majorPremiseInput, @RequestParam String minorPremiseInput, @RequestParam String conclusionInput, @RequestParam String figure) {
			DetermineProposition determineProposition = new DetermineProposition();
			Proposition majorPremise = determineProposition.makeProposition(majorPremiseInput);
			Proposition minorPremise = determineProposition.makeProposition(minorPremiseInput);
			Proposition conclusion = determineProposition.makeProposition(conclusionInput);
			Syllogism syllogism = new Syllogism(majorPremise, minorPremise, conclusion, figure);
//			SyllogismTempRepo repo = new SyllogismTempRepo();
//			repo.addSyllogism(syllogism);
			model.addAttribute("syllogism", syllogism);
			return "redirct: /syllogisms";
		}
}
