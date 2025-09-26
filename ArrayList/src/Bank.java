package ArrayList.src;

import java.util.ArrayList;

public class Bank {

	private ArrayList<BankAccount> accounts;
	
	
	public Bank() {
		accounts = new ArrayList<BankAccount>();
	}
	
	public void addAccount(BankAccount B) {
		accounts.add(B);
	}
	public int count(double atLeast) {
		int count = 0;
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getBalance() >= atLeast) {
			count++;
			}
		}
		return count;
	}
	public BankAccount find(int num) {
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNum() == num) {
			return accounts.get(i);
			}
		}
		return null;
	}
	public BankAccount getMaximum() {
		BankAccount max = accounts.get(0);
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getBalance() > max.getBalance()) {
			max = accounts.get(i);
			}
		}
		return max;
	}
	
	public double getTotalBalance() {
		double total = 0;
		for(int i = 0; i < accounts.size(); i++) {
			total += accounts.get(i).getBalance();
		}
		return total;
	}
	
	public boolean deposit(int accountNumber ,double balance) {
		BankAccount x = this.find(accountNumber);
		if(x != null) {
			this.find(accountNumber).deposit(balance);
			return true;
		} else {
			return false;
		}
	

	}
	public double averageBalance() {
		double avg = 0;
		for(int i = 0; i < accounts.size(); i++) {{
			avg += accounts.get(i).getBalance();
			}
		}
		return avg/accounts.size();
	}
	
	public void display() {
		for(int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i).toString());
		}
	}
	
	public static void main(String[] args) {
		Bank firstBankOfJava = new Bank();
		firstBankOfJava.addAccount(new BankAccount(1001, 20000));
		firstBankOfJava.addAccount(new BankAccount(1015, 10000));
		firstBankOfJava.addAccount(new BankAccount(1729, 15000));

		System.out.println("Total of all Accounts: "
				+ firstBankOfJava.getTotalBalance());

		double threshold = 15000;
		int c = firstBankOfJava.count(threshold);
		System.out.println(c + " accounts with balance >= " + threshold);

		int accountNumber = 1015;
		BankAccount a = firstBankOfJava.find(accountNumber);
		if (a == null)
			System.out.println("No account with number " + accountNumber);
		else
			System.out.println("Account with number " + accountNumber
					+ " has balance " + a.getBalance());

		BankAccount max = firstBankOfJava.getMaximum();
		System.out.println("Account with number " + max.getAccountNum()
				+ " has the largest balance.");
		System.out.println(firstBankOfJava.deposit(1729, 346.25));
		firstBankOfJava.display();
		System.out.println("Average Balance: " + firstBankOfJava.averageBalance());


	}}
		

