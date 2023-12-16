import java.util.ArrayList;

public class Purse {
	 private ArrayList<Coin> purse;
	
	 
	 
	 public Purse() {
		 purse = new ArrayList<Coin>();
		 
		 
	 }
	 
	 public int getNumOfCoins() {
		 return purse.size();
	 }
	 
	 public double getAmount() {
		  double amount = 0;
		 for(int i = 0; i < purse.size(); i++) {
			 amount += purse.get(i).getVal();
		 }
		 
		 return Math.round(amount * 100.0) / 100.0;
	 }
	 
	 public void addCoin(Coin x) {
		 purse.add(x);
		 
	 }
	 public void removeCoin(Coin x) {
		 for(int i = 0; i < purse.size(); i++) {
			 if(purse.get(i).getName().equals(x.getName())) {
				 purse.remove(i);
				 
			 }
		 }
	 }
	 
	 public ArrayList<Coin> getPurse(){
		 return purse;
	 }
	 
	 public String getPurseContents() {
		 return purse.toString();
	 }

}
