package syllogisms;

import propositions.Proposition;

public class Syllogism {
	private Proposition major;
	private Proposition minor;
	private Proposition conclusion;
	private String figure; 

	public Syllogism (Proposition major, Proposition minor, Proposition conclusion, String figure) {
		this.major = major;
		this.minor = minor; 
		this.conclusion = conclusion;
		this.figure = figure; 
	}

	public String getMajorName() {
		return major.getSyllogismName();
	}
	
	public String getMajorQuantity() {
		return major.getQuantity();
	}
	
	public String getMajorQuality() {
		return major.getQuality();
	}
	
	public String getMajor1() {
		return major.getMajor1();
	}
	
	public String getMajor2() {
		return major.getMajor2();
	}
	
	public String getMajor3() {
		return major.getMajor3();
	}
	
	public String getMajor4() {
		return major.getMajor4();
	}

	public String getMinorName() {
		return minor.getSyllogismName();
	}
	
	public String getMinorQuantity() {
		return minor.getQuantity();
	}
	
	public String getMinorQuality() {
		return minor.getQuality();
	}
	
	public String getMinor1() {
		return minor.getMinor1();
	}
	
	public String getMinor2() {
		return minor.getMinor2();
	}
	
	public String getMinor3() {
		return minor.getMinor3();
	}
	
	public String getMinor4() {
		return minor.getMinor4();
	}

	public String getConclusionName() {
		return conclusion.getSyllogismName();
	}
	
	public String getConclusionQuantity() {
		return conclusion.getQuantity();
	}
	
	public String getConclusionQuality() {
		return conclusion.getQuality();
	}

	public String getFigure() {
		return figure;
	}
	
	public String getSyllogismName() {
		String syllogismName = major.getSyllogismName() + minor.getSyllogismName() + conclusion.getSyllogismName() + figure;
		return syllogismName;
	}
}
