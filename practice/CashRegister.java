
public class CashRegister {

	
	private String name;
	private double total;

	
	public CashRegister() {
		this.name = "";
		this.total = 0.00;
		
	}

	public CashRegister(String myName, double myTotal) {
		this.name = myName;
		this.total = myTotal;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public String toString() {
		return "Register Name: "+name+"\nTotal: "+total;
	}
	
	private void addToRegister(double saleAmount) {
		total+=saleAmount;
	}

	public double makeChange(double saleAmount, double amountTendered) {
		total+=saleAmount;
		return amountTendered-saleAmount;

	}

	public void combineRegister(CashRegister other) {
		this.total += other.total;
		other.total = 0;
    }

	public static void main(String[] args) {
		CashRegister one = new CashRegister("Connolly", 100.50);
		one.addToRegister(52.15);
		System.out.println("Change Due: "+one.makeChange(45.99, 57.50));
		System.out.println(one);
	}
	

}
