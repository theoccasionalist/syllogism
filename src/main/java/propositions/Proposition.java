package propositions;

public abstract class Proposition {
	protected String name;
	protected String quantity;
	protected String quality;
	
	public Proposition (String name, String quantity, String quality) {
		this.name = name;
		this.quantity = quantity;
		this.quality = quality;
	}
	
	public String getSyllogismName() {
		return name;
	}
	
	public String getQuantity() {
		return quantity;
	}
	
	public String getQuality() {
		return quality;
	}
	
	public abstract String getMajor1();
	
	public abstract String getMinor1();
	
	public abstract String getMajor2();
	
	public abstract String getMinor2();
	
	public abstract String getMajor3();
	
	public abstract String getMinor3();
	
	public abstract String getMajor4();
	
	public abstract String getMinor4();
}
