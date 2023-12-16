
public class RetailItem {
	
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String description, int unitsOnHand, double price) {
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
	}
	public RetailItem() {
		this.description = " ";
		this.unitsOnHand = 0;
		this.price = 0.00;
		}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return  "Description: "+description+" \nUnits On Hand: "+unitsOnHand+" \nPrice: "+price;
	}
	
	
	
}
