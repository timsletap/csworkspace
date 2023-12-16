
public class GameTest {
	
	public static void main(String[] args) {
		Game smit = new Game();
		smit.getPurse().addCoin(new Coin("Quarter", 0.25));
		smit.getPurse().addCoin(new Coin("Quarter", 0.25));
		smit.getPurse().addCoin(new Coin("Dime", 0.10));
		smit.getPurse().addCoin(new Coin("Nickel", 0.05));
		smit.playGame();
		
		
	}

}
