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
			return "Rule 1: Passes";
		} else if (syllogism.getFigure().equals("2") && (syllogism.getMajor2().equals("distributed") || syllogism.getMinor2().equals("distributed"))) {
			return "Rule 1: Passes";
		} else if (syllogism.getFigure().equals("3") && (syllogism.getMajor3().equals("distributed") || syllogism.getMinor3().equals("distributed"))) {
			return "Rule 1: Passes";
		} else if (syllogism.getFigure().equals("4") && (syllogism.getMajor4().equals("distributed") || syllogism.getMinor4().equals("distributed"))) {
			return "Rule 1: Passes";
		}   return "Rule 1: Fails";
	}
		
	public String Rule2() {
		if (syllogism.getConclusionName().equals("A")) {
			if (Rule2MinorSubMethod()) {
				return "Rule 2: Passes";
			}
		} else if (syllogism.getConclusionName().equals("E")) {
			if (Rule2MajorSubMethod() && Rule2MinorSubMethod()) {
				return "Rule 2: Passes";
			}
		} else if (syllogism.getConclusionName().equals("O")) {
			if (Rule2MajorSubMethod()) {
				return "Rule 2: Passes";
			}
		}
		return "Rule 2: Fails";
	}
	
	public Boolean Rule2MajorSubMethod() {
		if (syllogism.getMajorName().equals("A") && (syllogism.getFigure().equals("2") || syllogism.getFigure().equals("4"))) {
			return true;
		} else if (syllogism.getMajorName().equals("E")) {
			return true;
		} else if (syllogism.getMajorName().equals("O") && (syllogism.getFigure().equals("1") || syllogism.getFigure().equals("3"))) {
			return true;
		} return false;
	}
	
	public Boolean Rule2MinorSubMethod() {
		if (syllogism.getMinorName().equals("A") && (syllogism.getFigure().equals("1") || syllogism.getFigure().equals("2"))) {
			return true;
		} else if (syllogism.getMinorName().equals("E")) {
			return true;
		} else if (syllogism.getMinorName().equals("O") && (syllogism.getFigure().equals("3") || syllogism.getFigure().equals("4"))) {
			return true;
		} return false; 
	}
	
	public String Rule3() {
		if (syllogism.getMajorQuality().equals("negative") && syllogism.getMinorQuality().equals("negative")) {
			return "Rule 3: Fails";
		} return "Rule 3: Passes";
	}
	
	public String Rule4() {
		if (syllogism.getConclusionQuality().equals("negative") && (syllogism.getMajorQuality().equals("negative") || syllogism.getMinorQuality().equals("negative"))) {
			return "Rule 4: Passes";
		} else if (syllogism.getConclusionQuality().equals("affirmative") && syllogism.getMajorQuality().equals("affirmative") && syllogism.getMinorQuality().equals("affirmative")) { 
			return "Rule 4: Passes";
		}	return "Rule 4: Fails";	
	}
	
	public String Rule5() {
		if (syllogism.getConclusionQuantity().equals("particular") && syllogism.getMajorQuantity().equals("universal") && syllogism.getMinorQuantity().equals("universal")) {
			return "Rule 5: Fails";
		} return "Rule 5: Passes"; 
	}
	
	public String getRule1() {
		return this.Rule1();
	}
	
	public String getRule2() {
		return this.Rule2();
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

