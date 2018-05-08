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
}
