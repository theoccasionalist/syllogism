package Matt.Syllogism;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import propositions.AProposition;
import propositions.DetermineProposition;
import propositions.IProposition;
import propositions.OProposition;
import propositions.Proposition;
import syllogisms.Syllogism;
import syllogisms.SyllogismTempRepo;

@Controller
public class SyllogismController {
	
	SyllogismTempRepo repo = new SyllogismTempRepo();
	
	
	@RequestMapping("/syllogisms")
	public String displaySyllogismsView(Model model) {
		AProposition aProp = new AProposition();
		IProposition iProp = new IProposition();
		OProposition oProp = new OProposition();
		Syllogism testSyllogism = new Syllogism(aProp, iProp, oProp, "4");
		repo.addSyllogism(testSyllogism);
		model.addAttribute("syllogismRepo", repo.individualSyllogisms());
		return "syllogisms";
	}
	
	@RequestMapping("/add-syllogism") 
		public String makeSyllogism (Model model, @RequestParam String majorPremiseInput, @RequestParam String minorPremiseInput, @RequestParam String conclusionInput, @RequestParam String figure) {
			DetermineProposition determineProposition = new DetermineProposition();
			Proposition majorPremise = determineProposition.makeProposition(majorPremiseInput);
			Proposition minorPremise = determineProposition.makeProposition(minorPremiseInput);
			Proposition conclusion = determineProposition.makeProposition(conclusionInput);
			Syllogism syllogism = new Syllogism(majorPremise, minorPremise, conclusion, figure);
			repo.addSyllogism(syllogism);
			return "redirect:/syllogisms";
		}
}
