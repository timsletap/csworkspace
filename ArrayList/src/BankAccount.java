package ArrayList.src;


public class BankAccount {
	private int accountNum;
	private double balance;
	
	public BankAccount(int anAccountNum) {
		this.accountNum = anAccountNum;
		this.balance = 0.00;
	}
	
	public BankAccount(int anAccountNum, double balance) {
		this.accountNum = anAccountNum;
		this.balance = balance;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void withdraw(double balance) {
		this.balance -= accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit (double balance) {
		this.balance += balance;
	}
	public String toString() {
		return "Account Number: "+ this.getAccountNum() + " " + "Balance: $" + this.getBalance();
	}
	
	
	
	
	public static void main(String[] args)
	{
	BankAccount one = new BankAccount(1);
	BankAccount two = new BankAccount(2,1000);
	one.deposit(50);
	one.deposit (25.25);
	two.withdraw(12.56);
	two.withdraw(100);
	System.out.println( one);
	System.out.println(two);
	}
	
}
