package syllogisms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SyllogismTempRepo {
	
	Map<String, Syllogism> syllogisms = new HashMap<>();
	
	public void addSyllogism(Syllogism syllogism) {
		syllogisms.put(syllogism.getSyllogismName(), syllogism);
	}

	public Collection <Syllogism> individualSyllogisms() {
		return syllogisms.values();
	}

	public Syllogism getIndividualSyllogism(String name) {
		for (Syllogism syllogism : syllogisms.values()) {
			if (syllogism.getSyllogismName().equals(name)) {
			return syllogism;
			}
		} return null;
	}
}
