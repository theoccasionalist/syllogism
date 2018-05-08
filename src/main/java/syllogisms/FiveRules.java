package syllogisms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FiveRules {
	Map<String, Syllogism> syllogisms = new HashMap<>();
		
	public void addSyllogism(Syllogism syllogism) {
		syllogisms.put(syllogism.getSyllogismName(), syllogism);
	}
	
	public Collection <Syllogism> individualSyllogisms() {
		return syllogisms.values();
	}
	
	public Boolean Rule1() {
		for (Syllogism syllogism : syllogisms.values()) {
			if (syllogism.getFigure() == "1" && (syllogism.getMajor1() == "distributed" || syllogism.getMinor1() == "distributed")) {
				return true;
			} else if ((syllogism.getFigure() == "2" && (syllogism.getMajor2() == "distributed" || syllogism.getMinor2() == "distributed"))) {
				return true;
			} else if ((syllogism.getFigure() == "3" && (syllogism.getMajor3() == "distributed" || syllogism.getMinor3() == "distributed"))) {
				return true;
			} else if ((syllogism.getFigure() == "4" && (syllogism.getMajor4() == "distributed" || syllogism.getMinor4() == "distributed"))) {
				return true;
			}   
		} return false;
	}
	
	public Boolean Rule2() {
		return false;
	}
	
	public Boolean Rule3() {
		for (Syllogism syllogism : syllogisms.values()) {
			if (syllogism.getMajorQuality() == "negative" && syllogism.getMinorQuality() == "negative") {
				return false;
			}
		} return true;
	}
	
	public Boolean Rule4() {
		for (Syllogism syllogism : syllogisms.values()) {
			if (syllogism.getConclusionQuality() == "negative" && (syllogism.getMajorQuality() == "negative" || syllogism.getMinorQuality() == "negative")) {
				return true;
			}
		} return false;
	}
}

