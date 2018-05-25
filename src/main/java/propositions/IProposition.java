package propositions;

public class IProposition extends Proposition {
	public IProposition() {
		super ("I", "particular", "affirmative");
	}

	@Override
	public String getMajor1() {
		return "undistributed";
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
		return "undistributed";
	}

	@Override
	public String getMinor3() {
		return "undistributed";
	}

	@Override
	public String getMajor4() {
		return "undistributed";
	}

	@Override
	public String getMinor4() {
		return "undistributed";
	}
	
	public String getSubcontraryName() {
		return "O";
	}
	
	public String subcontraryTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("False")) {
			return "True";
		}
		return "Undetermined";
	}

	@Override
	public String getContradictionName() {
		return "E";
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
		return "A";
	}

	@Override
	public String subaltTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("False")) {
			return "False";
		}
		return "Undetermined";
	}	
}
