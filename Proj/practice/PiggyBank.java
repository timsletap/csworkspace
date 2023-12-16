
public class PiggyBank {
	
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	
	public PiggyBank() {
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
		
	}
	public PiggyBank(int pennies, int nickels, int dimes, int quarters) {
		super();
		this.pennies = pennies;
		this.nickels = nickels;
		this.dimes = dimes;
		this.quarters = quarters;
	}
	public int getPennies() {
		return pennies;
	}
	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
	public int getNickels() {
		return nickels;
	}
	public void setNickels(int nickels) {
		this.nickels = nickels;
	}
	public int getDimes() {
		return dimes;
	}
	public void setDimes(int dimes) {
		this.dimes = dimes;
	}
	public int getQuarters() {
		return quarters;
	}
	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}
	
	public String toString() {
		return "Pennies:" + pennies + "\nNickels: " + nickels + " \nDimes: " + dimes + "\nQuarters: " + quarters;
	}
	public double totalDolVal() {
		double penVal = pennies*0.01;
		double nicVal = nickels*0.05;
		double dimVal = dimes*0.1;
		double quarVal = quarters*0.25;
		return penVal+nicVal+dimVal+quarVal;
	}
	public void combinePiggy(PiggyBank pb) {// Method will empty the contents from the PiggyBank object accepted as the parameter and move it into the PiggyBank object that the method is called to
		this.pennies+=pb.pennies;
		this.nickels+=pb.nickels;
		this.dimes+=pb.dimes;
		this.quarters+=pb.quarters;
		pb.setPennies(0);
		pb.setNickels(0);
		pb.setDimes(0);
		pb.setQuarters(0);
	}


}
