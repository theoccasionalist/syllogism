package syllogisms;

public class FiveRules {
	
	Syllogism syllogism;
	
	public FiveRules(Syllogism syllogism) {
		this.syllogism = syllogism;
	}
	
	public Boolean Rule1() {
		if (syllogism.getFigure() == "1" && (syllogism.getMajor1() == "distributed" || syllogism.getMinor1() == "distributed")) {
			return true;
		} else if ((syllogism.getFigure() == "2" && (syllogism.getMajor2() == "distributed" || syllogism.getMinor2() == "distributed"))) {
			return true;
		} else if ((syllogism.getFigure() == "3" && (syllogism.getMajor3() == "distributed" || syllogism.getMinor3() == "distributed"))) {
			return true;
		} else if ((syllogism.getFigure() == "4" && (syllogism.getMajor4() == "distributed" || syllogism.getMinor4() == "distributed"))) {
			return true;
		}   return false;
	}
	
	public Boolean Rule2() {
		return false;
	}
	
	public Boolean Rule3() {
		if (syllogism.getMajorQuality() == "negative" && syllogism.getMinorQuality() == "negative") {
			return false;
		} return true;
	}
	
	public Boolean Rule4() {
		if (syllogism.getConclusionQuality() == "negative" && (syllogism.getMajorQuality() == "negative" || syllogism.getMinorQuality() == "negative")) {
			return true;
		} return false;
	}
	
	public Boolean Rule5() {
		if (syllogism.getConclusionQuantity() == "particular" && syllogism.getMajorQuantity() == "universal" && syllogism.getMinorQuantity() == "universal") {
			return false;
		} return true; 
	}
}

