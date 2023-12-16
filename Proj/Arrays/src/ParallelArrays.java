import java.util.Scanner;

public class ParallelArrays {

	/**
	Implement the cashRegister method 
	A customer buys an item for less than $5.00 and pays for it with a $5 dollar bill.  Print the change and the number and type of each coin. (do not include half dollars)
	Sample Output:  
			Input Cost of the item:     3.32
	        CHANGE: 	1.68
	        DOLLARS 	1
	        QUARTERS    2
	        DIMES       1
	        NICKLES 	1
	        PENNIES 	3 
	 */  
	
	
public static void cashRegister() {
	int[] val = {100,25,10,5,1};
	String[] coin = {"dollars" , "quarters", "dimes", "nickels", "pennies"};
	int[] count = new int[5];
	final double epsilon = 0.000001;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter amount of purchase: ");
	double purchase = input.nextDouble();
	System.out.println("Enter amount of cash paid: ");
	double payment = input.nextDouble();
	int change = (int)((payment - purchase + epsilon)*(100));
	System.out.println("Item Cost:\t"+ purchase);
	System.out.println("Change: \t" + change / 100.0);
	for (int i = 0; i < val.length; i++) {
		while (change >= val[i]) {
			count[i]++;
			change -= val[i];
		}
	}
	for (int i = 0; i < val.length; i++) {
		if(val[i] == 25) {
		System.out.println(coin[i] + "\t" + count[i]);
		} else {
	    System.out.println(coin[i] + "\t\t" + count[i]);
		}
	}
}
	
public static void main(String[] args) {

	cashRegister();
	}
}
