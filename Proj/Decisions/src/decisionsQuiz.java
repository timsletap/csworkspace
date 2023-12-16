
public class decisionsQuiz {
	
	public static void calculateBill(String plan, int minutes) {
		if(plan.equalsIgnoreCase("A")) {
			if(minutes <= 450) {
				System.out.println("Your monthly total is $39.99");
			} else {
				System.out.println("Your monthly total is $"+(39.99+(0.45*(minutes-450))));
			}
		} else if(plan.equalsIgnoreCase("B")) {
			if(minutes <= 900) {
				System.out.println("Your monthly total is $59.99");
			} else {
				System.out.println("Your monthly total is $"+(59.99+(0.40*(minutes-900))));
			}
		} else if(plan.equalsIgnoreCase("C")) {
			System.out.println("Your monthly total is $79.99");
		} else {
			System.out.println("Invalid Plan Choice");
		}
	}
	public static String getColor(int num) {
		String color = "";
		if(num == 0) {
			color = "Green";
		} else if(num >= 1 && num <= 10) {
			if(num % 2 == 0) {
				color = "Black";
			} else {
				color = "Red";
			}
		} else if(num >= 11 && num <= 18) {
			if(num % 2 == 0) {
				color = "Red";
			} else {
				color = "Black";
			}
		} else if(num >= 19 && num <= 28) {
			if(num % 2 == 0) {
				color = "Black";
			} else {
				color = "Red";
			}
		} else if(num >= 29 && num <= 36) {
			if(num % 2 == 0) {
				color = "Red";
			} else {
				color = "Black";
			}
		} else {
			return null;
		}
		return color;

	}
	
	public static void main(String[] args) {
		 calculateBill("A", 750);   //174.99
	        calculateBill("C", 750);    //79.99
	        System.out.println(getColor(20));     //BLACK
	        System.out.println(getColor(36));    //RED
	}





}
