package propositions;

public class DetermineProposition {
	String name;
	
	public DetermineProposition() {}
	
	public Proposition makeProposition(String name) {
	if (name.equalsIgnoreCase("A")) {
		AProposition aProposition = new AProposition();
		return aProposition;
	} else if (name.equalsIgnoreCase("E")) {
		EProposition eProposition = new EProposition();
		return eProposition;
	} else if (name.equalsIgnoreCase("I")) {
		IProposition iProposition = new IProposition();
		return iProposition;
	} else {
		OProposition oProposition = new OProposition(); 
		return oProposition;
		}
	}
}
