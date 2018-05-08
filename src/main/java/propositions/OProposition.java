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
}
