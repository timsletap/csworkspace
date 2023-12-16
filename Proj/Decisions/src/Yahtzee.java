
public class Yahtzee {
	public static void twoDice() {
		int x;
		int y;
		int count = 1;
		 do {
			 x = (int)(Math.random()*6)+1;
			 y = (int)(Math.random()*6)+1;
			 System.out.println(x + " "+ y);
			 count++;
		} while(!(x == y));
		 System.out.println("Number of rolls "+count);
	}
	public static void threeDice() {
		int x;
		int y;
		int z;
		int count = 1;
		 do {
			 x = (int)(Math.random()*6)+1;
			 y = (int)(Math.random()*6)+1;
			 z = (int)(Math.random()*6)+1;
			 System.out.println(x + " "+ y + " " + z);
			 count++;
		} while(!(x == y && y == z));
		 System.out.println("Number of rolls: "+count);
	}
	public static int fiveDice() {
		int x;
		int y;
		int z;
		int a;
		int b;
		int count = 1;
		 do {
			 x = (int)(Math.random()*6)+1;
			 y = (int)(Math.random()*6)+1;
			 z = (int)(Math.random()*6)+1;
			 a = (int)(Math.random()*6)+1;
			 b = (int)(Math.random()*6)+1;;
			 count++;
		} while(!(x == y && y == z && z == a && a==b));
		 return count;
	}
	public static void yahtzeeTrials(int trials) {
		for(int i = 1; i <= trials; i++) {
			System.out.println("Trial: "+i + " " + "Number of rolls: "+fiveDice());
		}
		
	}
	
	public static void main(String[] args) {
		yahtzeeTrials(100000000);
	}
}
