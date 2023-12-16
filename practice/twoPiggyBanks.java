import java.util.Scanner;
public class twoPiggyBanks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("PiggyBank 1: ");
		System.out.println("Please input the number of pennies: ");
		int penniesy = input.nextInt();
		System.out.println("Please input the number of nickels: ");
		int nickelsy = input.nextInt();
		System.out.println("Please input the number of dimes: ");
		int dimesy = input.nextInt();
		System.out.println("Please input the number of quarters: ");
		int quartersy = input.nextInt();
		PiggyBank one = new PiggyBank(penniesy, nickelsy, dimesy, quartersy);
		System.out.println(one);
		System.out.println("Total Dollar Value: "+one.totalDolVal());
		System.out.println("PiggyBank 2: ");
		System.out.println("Please input the number of pennies: ");
		int penniesy2 = input.nextInt();
		System.out.println("Please input the number of nickels: ");
		int nickelsy2 = input.nextInt();
		System.out.println("Please input the number of dimes: ");
		int dimesy2 = input.nextInt();
		System.out.println("Please input the number of quarters: ");
		int quartersy2 = input.nextInt();
		PiggyBank two = new PiggyBank(penniesy2, nickelsy2, dimesy2, quartersy2);
		System.out.println(two);
		System.out.println("Total Dollar Value: "+two.totalDolVal());
		System.out.println("Now both PiggyBanks will be combined.");
		one.combinePiggy(two);
		System.out.println("New Total Dollar Value of PiggyBank 1: "+one.totalDolVal());
		System.out.println("New Total Dollar Value of PiggyBank 2: "+two.totalDolVal());
		
		
		
		
	}

}
