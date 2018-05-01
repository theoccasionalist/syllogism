package syllogismPropositions;

public abstract class Proposition {
	protected String name;
	protected String quantity;
	protected String quality;
	
	public Proposition (String name, String quantity, String quality) {
		this.name = name;
		this.quantity = quantity;
		this.quality = quality;
	}
	
	public String getName() {
		return name;
	}
	
	public String getQuantity() {
		return quantity;
	}
	
	public String getQuality() {
		return quality;
	}
}
