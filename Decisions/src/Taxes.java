import java.util.Scanner;
public class Taxes {
	static Scanner input = new Scanner(System.in);
	public static void single(int y) {
		String filingStatus = "Single";
		double taxableIncome = y;
		double federalTax=  0;
		if(y > 0 && y < 27050) {
			federalTax = 0.15*(y);
		} else if( y >= 27050 && y < 65550) {
			federalTax = 4057.5 + 0.275*(y-27050);
		} else if( y >= 65550 && y < 136750) {
			federalTax = 14645.0 + 0.305*(y-65550);
		} else if( y >= 136750 && y < 297350) {
			federalTax = 36361.0 + 0.355*(y-136750);
		} else if( y >= 297350) {
				federalTax = 93374.0 + 0.391*(y-297350);
		}
		System.out.println("Filing Status = "+filingStatus);
		System.out.println("Taxable Income = $"+taxableIncome);
		System.out.println("Federal Tax = $"+federalTax);
	}
	public static void marry(int x) {
		String filingStatus = "Married";
		double taxableIncome = x;
		double federalTax=  0;
		if(x > 0 && x < 45200) {
			federalTax = 0.15*(x);
		} else if( x >= 45200 && x < 109250) {
			federalTax = 6780.0 + 0.275*(x-45200);
		} else if( x >= 109250 && x < 166500) {
			federalTax = 24393.75 + 0.305*(x-109250);
		} else if( x >= 166500 && x < 297350) {
			federalTax = 41855.0 + 0.355*(x-166500);
		} else if( x >= 297350) {
				federalTax = 88306.0 + 0.391*(x-297350);
		}
		System.out.println("Filing Status = "+filingStatus);
		System.out.println("Taxable Income = $"+taxableIncome);
		System.out.println("Federal Tax = $"+federalTax);
	}
	public static void main(String[] args) {
		String collectz;
		String collectx;
		int collecty;
	do {
		collecty = 0;
		collectx = "";
		System.out.println("Enter filing status: Single: (S/s) & Married(M/m)");
		collectx = input.next();
		System.out.println("Enter Income ----> ");
		collecty = input.nextInt();
		if(collectx.equalsIgnoreCase("M")) {
			marry(collecty);
		} else if(collectx.equalsIgnoreCase("S")) {
			single(collecty);
		} 
		System.out.println("Do you wish to continue? Yes(Y/y) or No(N/n)");
		collectz = input.next();
	} while(collectz.equalsIgnoreCase("y"));
	}

}
