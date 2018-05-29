package propositions;

public class OProposition extends Proposition {
	public OProposition () {
		super ("O", "particular", "negative");
		
	}

	@Override
	public String getMajor1() {
		return "undistributed";
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
		return "undistributed";
	}

	@Override
	public String getMinor3() {
		return "undistributed";
	}

	@Override
	public String getMajor4() {
		return "distributed";
	}

	@Override
	public String getMinor4() {
		return "udistributed";
	}
	
	public String getSubcontraryName() {
		return "I";
	}
	
	public String subcontraryTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("False")) {
			return "True";
		}
		return "Undetermined";
	}

	@Override
	public String getContradictionName() {
		return "A";
	}

	@Override
	public String contradictionTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("True")) {
			return "False";
		}
		return "True";
	}

	@Override
	public String getSubaltName() {
		return "E";
	}

	@Override
	public String subaltTruthValue(String truthValue) {
		if (truthValue.equalsIgnoreCase("false")) {
			return "False";
		}
		return "Undetermined";
	}
}
