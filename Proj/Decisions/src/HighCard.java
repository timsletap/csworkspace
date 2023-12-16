import java.util.Random;
import java.util.Scanner;
public class HighCard {
	
	static Random r = new Random();
	static Scanner input = new Scanner(System.in);
	private String value;
	private String suit;
	
	public HighCard(String value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	public HighCard() {
      this.value = "";
      this.suit = "";
	}
	
	public int CardVal() {
		
		int x = r.nextInt(14)+2;
	      if(x == 2) {
			value = "2";
		}else if(x == 3) {
			value = "3";
		}else if(x == 4) {
			value = "4";
		}else if(x == 5) {
			value = "5";
		}else if(x == 6) {
			value = "6";
		}else if(x == 7) {
			value = "7";
		}else if(x == 8) {
			value = "8";
		}else if(x == 9) {
			value = "9";
		}else if(x == 10) {
			value = "10";
		}else if(x == 11) {
			value = "Jack";
		}else if(x == 12) {
			value = "Queen";
		}else if(x == 13) {
			value = "King";
		} else {
			value = "Ace";
		}
	      return x;
	}
	public String cardSuit() {
		int a = r.nextInt(4)+1;
		if(a == 1) {
			suit = "Diamonds";
		}else if(a == 2) {
			suit = "Clubs";
		}else if(a == 3) {
			suit = "Spades";
		}else { 
			suit = "Hearts";
		}
		return suit;

	}
	
	public static void main(String[] args) {
		String collecty;
		String collectx;
		int bet;
		int winnings = 0;
		HighCard user = new HighCard();
		HighCard pc = new HighCard();
		do {
		user.cardSuit();
		pc.cardSuit();
		System.out.println("Do you want to play High Card?(y/n)");
		collectx = input.next();
		if(collectx.equalsIgnoreCase("Y")) {
			System.out.println("Do you want to bet?(y/n)");
			collecty = input.next();
			if(collecty.equalsIgnoreCase("Y")) {
				System.out.println("How much do you want to bet? ");
			    bet = input.nextInt();
			    if(user.CardVal() > pc.CardVal()) {
			    	System.out.println("YOUR CARD: "+user.value+" of "+user.suit);
				    System.out.println("PC CARD: "+pc.value+" of "+pc.suit);
			    	System.out.println("YOU WIN!");
			    	winnings+=bet;
			    	System.out.println("You have $" + winnings);
			    } else {
			    	System.out.println("YOUR CARD: "+user.value+" of "+user.suit);
				    System.out.println("PC CARD: "+pc.value+" of "+pc.suit);
				    System.out.println("YOU LOSE!");
				   winnings-=bet;
				   System.out.println("You have $" + winnings);
			    }
			}
		}
		
		
		     } while(!(collectx.equalsIgnoreCase("N")));
		System.out.println("Your total winnings: $"+winnings);
		

	  }
	}



