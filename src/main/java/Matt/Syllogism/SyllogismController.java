package Matt.Syllogism;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import propositions.DetermineProposition;
import propositions.Proposition;
import syllogisms.FiveRules;
import syllogisms.FiveRulesTempRepo;
import syllogisms.Syllogism;
import syllogisms.SyllogismTempRepo;

@Controller
public class SyllogismController {
	
	SyllogismTempRepo syllogismRepo = new SyllogismTempRepo();
	FiveRulesTempRepo fiveRulesRepo = new FiveRulesTempRepo();
	
	@RequestMapping("/syllogisms")
	public String displaySyllogismsView(Model model) {
		model.addAttribute("syllogismRepo", syllogismRepo.individualSyllogisms());
		model.addAttribute("fiveRulesRepo", fiveRulesRepo.individualFiveRules());
		return "syllogisms";
	}
	
	@RequestMapping("/add-syllogism") 
	public String makeSyllogism (@RequestParam String majorPremiseInput, @RequestParam String minorPremiseInput, @RequestParam String conclusionInput, @RequestParam String figure) {
		DetermineProposition determineProposition = new DetermineProposition();
		Proposition majorPremise = determineProposition.makeProposition(majorPremiseInput);
		Proposition minorPremise = determineProposition.makeProposition(minorPremiseInput);
		Proposition conclusion = determineProposition.makeProposition(conclusionInput);
		Syllogism syllogism = new Syllogism(majorPremise, minorPremise, conclusion, figure);
		syllogismRepo.addSyllogism(syllogism);
		FiveRules testableSyllogism = new FiveRules(syllogism);
		fiveRulesRepo.addFiveRules(testableSyllogism);
		return "redirect:/syllogisms";
	}
	
//	@RequestMapping("/test-rule-1")
//	public String testRule1(Model model, @RequestParam String syllogismName) {
//		FiveRules testSyllogism = fiveRulesRepo.getIndividualFiveRules(syllogismName);
//		model.addAttribute("testableSyllogism", testSyllogism);
//		return "redirect:/syllogisms";
//	}
}
