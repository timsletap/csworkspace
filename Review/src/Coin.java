
public class Coin {
	private String name;
	private double val;
	
	
	public Coin() {
		name = "";
		val = 0;
	}
	
	public Coin(String nam, double value) {
		name = nam;
		val = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}
	

}
