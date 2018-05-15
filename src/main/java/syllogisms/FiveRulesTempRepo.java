package syllogisms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FiveRulesTempRepo {
	Map <String, FiveRules> fiveRulesMap = new HashMap<>();
	
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
