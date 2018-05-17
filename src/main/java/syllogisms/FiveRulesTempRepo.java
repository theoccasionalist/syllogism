package syllogisms;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class FiveRulesTempRepo {
	Map <String, FiveRules> fiveRulesMap = new TreeMap<>();
	
	public void addFiveRules(FiveRules fiveRules) {
		fiveRulesMap.put(fiveRules.getFiveRulesSyllogismName(), fiveRules);
	}
	
	public Collection <FiveRules> individualFiveRules() {
		return fiveRulesMap.values();
	}
		
	public FiveRules getIndividualFiveRules(String name) {
		for (FiveRules fiveRules : fiveRulesMap.values()) {
			if (fiveRules.getFiveRulesSyllogismName().equals(name)) {
				return fiveRules;
			}
		} return null;
	}
}
