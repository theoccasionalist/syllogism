package syllogisms;

public class FiveRules {
	
	Syllogism syllogism;
	
	public FiveRules(Syllogism syllogism) {
		this.syllogism = syllogism;
	}
	
	public String getFiveRulesSyllogismName() {
		return syllogism.getSyllogismName();
	}
	
	public String Rule1() {
		if (syllogism.getFigure().equals("1") && (syllogism.getMajor1().equals("distributed") || syllogism.getMinor1().equals("distributed"))) {
			return "Passes Rule 1";
		} else if (syllogism.getFigure().equals("2") && (syllogism.getMajor2().equals("distributed") || syllogism.getMinor2().equals("distributed"))) {
			return "Passes Rule 1";
		} else if (syllogism.getFigure().equals("3") && (syllogism.getMajor3().equals("distributed") || syllogism.getMinor3().equals("distributed"))) {
			return "Passes Rule 1";
		} else if (syllogism.getFigure().equals("4") && (syllogism.getMajor4().equals("distributed") || syllogism.getMinor4().equals("distributed"))) {
			return "Passes Rule 1";
		}   return "Breaks Rule 1";
	}
		
	public String Rule2() {
		return "nothing to report yet";
	}
	
	public String Rule3() {
		if (syllogism.getMajorQuality().equals("negative") && syllogism.getMinorQuality().equals("negative")) {
			return "Breaks Rule 3";
		} return "Passes Rule 3";
	}
	
	public String Rule4() {
		if (syllogism.getConclusionQuality().equals("negative") && (syllogism.getMajorQuality().equals("negative") || syllogism.getMinorQuality().equals("negative"))) {
			return "Passes Rule 4";
		} else if (syllogism.getConclusionQuality().equals("affirmative") && syllogism.getMajorQuality().equals("affirmative") && syllogism.getMinorQuality().equals("affirmative")) { 
			return "Passes Rule 4";
		}	return "Breaks Rule 4";	
	}
	
	public String Rule5() {
		if (syllogism.getConclusionQuantity().equals("particular") && syllogism.getMajorQuantity().equals("universal") && syllogism.getMinorQuantity().equals("universal")) {
			return "Breaks Rule 5";
		} return "Passes Rule 5"; 
	}
	
	public String getRule1() {
		return this.Rule1();
	}
	
	public String getRule3() {
		return this.Rule3();
	}
	
	public String getRule4() {
		return this.Rule4();
	}
	
	public String getRule5() {
		return this.Rule5();
	}
}

