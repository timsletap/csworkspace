import java.util.Scanner;

public class Casino {
	private double cash;
	public Casino() {
	cash = 100;
	}
	public Casino(double myCash) {
	cash = myCash;
	}
	public double getCash() {
	return cash;
	}
	//add bet to cash
	public void changeCash(int bet) {
		cash+=bet;
	}

	//roll dice and print them
	public int rollDice() {
		int x = (int)(Math.random()*6)+1;
		int y = (int)(Math.random()*6)+1;
		
		System.out.println(x+" + "+y+" = "+(x+y));
	return x+y;
	}
	// decides win or lose changes bankroll
	public void play(int bet) {
	if (game()) {
	changeCash(bet);
	System.out.println("You Win");
	} else {
	changeCash(-bet);
	System.out.println("You Lose");
	}
	System.out.println("Your Bankroll is " + getCash());

	}
	//rolls dice
	//returns false if 2,3,12
	//returns true if 7,11
	//calls roll2(int roll) for other numbers
	public boolean game() {
		boolean temp;
		int roll = this.rollDice();
		if(roll == 7 || roll == 11) {
			temp = true;
		} else if(roll == 2 || roll == 3 || roll == 12) {
			temp = false;
		} else {
			 temp = this.roll2(roll);
		}
		return temp;
	}
	//while loop keep rolling dice until

	// 7 return false
	// point return true
	public boolean roll2(int point) {
		boolean p = true;
		while(p == true) {
			int z = this.rollDice();
			if(z == 7) {
				p = false;
				return false;
			} else if(z == point) {
				p = true;
				return true;
			} 
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double collectx;
		int collecty;
		
		System.out.println("Enter amount of money in your bankroll ---> ");
		collectx = input.nextDouble();
		Casino one = new Casino(collectx);
		do {
		System.out.println("What is your bet ---> ");
		collecty = input.nextInt();
		
		one.play(collecty);
		} while(one.getCash() > 0);
		
	}
	
}