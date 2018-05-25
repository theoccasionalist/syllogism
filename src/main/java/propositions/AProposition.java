package propositions;

public class AProposition extends Proposition  {
	public AProposition () {
		super ("A", "universal", "affirmative");
	}

	@Override
	public String getMajor1() {
		return "distributed";
	}

	@Override
	public String getMinor1() {
		return "undistributed";
	}

	@Override
	public String getMajor2() {
		return "undistributed";
	}

	@Override
	public String getMinor2() {
		return "undistributed";
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
		return "undistributed";
	}

	@Override
	public String getMinor4() {
		return "distributed";
	}
	
	public String getContraryName() {
		return "E";
	}
	
	public String contraryTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("true")) {
			return "False";
		} 
		return "Undetermined";
	}

	@Override
	public String getContradictionName() {
		return "O";
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
		return "I";
	}

	@Override
	public String subaltTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("true")) {
			return "True";
		}
		return "Undetermined";
	}
	
}
