package propositions;

public class EProposition extends Proposition {
	public EProposition() {
		super ("E", "universal", "negative");
	}

	@Override
	public String getMajor1() {
		return "distributed";
	}

	@Override
	public String getMinor1() {
		return "distributed";
	}

	@Override
	public String getMajor2() {
		return "distributed";
	}

	@Override
	public String getMinor2() {
		return "distributed";
	}

	@Override
	public String getMajor3() {
		return "distributed";
	}

	@Override
	public String getMinor3() {
		return "distributed";
	}

	@Override
	public String getMajor4() {
		return "distributed";
	}

	@Override
	public String getMinor4() {
		return "distributed";
	}
	
	public String getContraryName() {
		return "A";
	}
	
	public String contraryTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("true")) {
			return "False";
		} 
		return "Undetermined";
	}

	@Override
	public String getContradictionName() {
		return "I";
	}

	@Override
	public String contradictionTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("true")) {
			return "False";
		}
		return "True";
	}

	@Override
	public String getSubaltName() {
		return "O";
	}

	@Override
	public String subaltTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("True")) {
			return "True";
		}
		return "Undetermined";
	}
}
