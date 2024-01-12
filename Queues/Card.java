public class Card implements Comparable<Card>{
private int suit;
private int value;
/**
* Constructor for objects of class Card
*/
public Card() {
suit = 1;
value = 2;
}
public Card(int mySuit, int myValue) {
suit = mySuit;
value = myValue;
}
public static void main(String[] args) {
Card one = new Card();
Card two = new Card(3,4);
Card three= new Card(1,11);
System.out.println(one);
System.out.println(two);
System.out.println(three);
}


public String toString() {
	if(value == 11) { return "J" + this.getSuit();}
	if(value == 12) { return "Q" + this.getSuit();}
	if(value == 13) { return "K" + this.getSuit();}
	if(value == 14) { return "A" + this.getSuit();}
	
	return this.value + this.getSuit();
}

public String getSuit() {
	if(suit == 1) {
		return "\u2663";
	}
	if(suit == 2) {
		return "\u2666";
	}
	if(suit == 3) {
		return "\u2665";
	}
	if(suit == 4) {
		return "\u2660";
	}
	return "";
}

public int getValue(){
	return value;
}
@Override
public int compareTo(Card o) {
	// TODO Auto-generated method stub
	return 0;
}
}