import java.util.Random;
public class Game {
	private Purse stor;
	private Spinner spinner;
	private Random r = new Random();

	
	public Game() {
		stor = new Purse();
		spinner = new Spinner();
		
	}
	
	public Purse getPurse() {
		return stor;
	}
	
	public void playGame() {
		
		double purseVal = stor.getAmount();
		int tempNum = 0;
		
		do {
			System.out.println("Number of Coins: "+stor.getNumOfCoins());
			System.out.println("Money in Purse: "+stor.getAmount());
			if(stor.getNumOfCoins() > 0) {
		 tempNum = r.nextInt(stor.getPurse().size());
			} else {
		tempNum = -1;
		break;
			}
		Coin temp = stor.getPurse().get(tempNum);
		System.out.println("The coin named "+temp.getName()+" was chosen and its value is $"+ temp.getVal());
		
		spinner.spin();
				
		if(spinner.getNum() == 0) {
			stor.removeCoin(temp);
			System.out.println("You lost the coin!");
		} 
		
		if(spinner.getNum() == 2) {
			stor.addCoin(temp);
			System.out.println("You keep your coin and get another one of the same value!");
		} 
		
		if(spinner.getNum() == 3) {
			stor.addCoin(temp);
			stor.addCoin(temp);
			stor.addCoin(temp);
			System.out.println("You keep your coin and get three of the same value!");	
		}	
		
		
		
		
			
		} while((purseVal*2 > stor.getAmount()));
		System.out.println("Game Over!");
		System.out.println("Money in Purse: "+stor.getAmount());
		
		
	}
	
	

}
