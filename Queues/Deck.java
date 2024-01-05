

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class Deck {
Queue<Card> deck;
public Deck () {
deck = new LinkedList<Card>();
loadDeck();
}
public Queue<Card> getDeck() {
return deck;
}
// Load the stack with 52 cards in order
public void loadDeck() {
	for (int suit = 1; suit <= 4; suit++) {
        for (int rank = 2; rank <= 14; rank++) {
            deck.add(new Card(suit, rank));
        }
    }
}
public String toString() {
	 int size = deck.size();
	 String temp = "";
	    for (int j = 1; j <= size; j++) {
	        temp += deck.peek() + " ";
	        deck.offer(deck.poll());
	        if(j % 4 == 0) {
	        	temp += "\n";
	        }
	    }
	    return temp;
}

// Return and remove the top card
public Card deal() {
	return deck.poll();
}
// Take the top half of the deck (26 cards) and alternate card by card with
// the bottom half
public void bridgeShuffle() {
	Queue<Card> halfOne= new LinkedList<Card>();
    Queue<Card> halfTwo= new LinkedList<Card>();

    int size = deck.size();
    for (int i = 0; i < size / 2; i++) {
        halfOne.offer(deck.poll());
    }
    while (!deck.isEmpty()) {
        halfTwo.offer(deck.poll());
    }
    while (!halfOne.isEmpty() || !halfTwo.isEmpty()) {
        if (!halfOne.isEmpty()) {
            deck.offer(halfOne.poll());
        }
        if (!halfTwo.isEmpty()) {
            deck.offer(halfTwo.poll());
        }
    }
}
// split the deck at a random spot. Put the stack of cards above the random
// spot below the other cards
public void cut() {
	Random r = new Random();
	int i = r.nextInt(deck.size() - 1) + 1;
    Queue<Card> halfOne = new LinkedList<Card>();
    Queue<Card> halfTwo = new LinkedList<Card>();

    while(i > 0) {
        halfOne.offer(deck.poll());
        i--;
    }
    while (!deck.isEmpty()) {
        halfTwo.offer(deck.poll());
    }

    while (!halfOne.isEmpty()) {
        deck.offer(halfOne.poll());
    }
    while (!halfTwo.isEmpty()) {
        deck.offer(halfTwo.poll());
    }
}
// complete a bridge shuffle and then cut the deck. Repeat 7 times
public void completeShuffle() {
	for(int i = 0; i < 7; i++) {
		this.bridgeShuffle();
		this.cut();
	}
}
// shuffle the deck using your own algorithm
public void customShuffle() {
    Random r = new Random();
    int ran = r.nextInt(10) + 5; 
    for (int i = 0; i < ran; i++) {
        this.completeShuffle();
    }
    this.cut();

}


public static void main(String[] args) {
Deck a = new Deck();
System.out.println("Ordered deck");
System.out.println(a);
a.bridgeShuffle();
System.out.println("After 1 bridge shuffle");
System.out.println(a);
System.out.println("After 1 cut");
a.cut();
System.out.println(a);
a.completeShuffle();
System.out.println("After complete shuffle. ");
System.out.println(a);
System.out.println("After custom shuffle. Deal ");
a.customShuffle();
for(int i=1; i<=5 ;i++) {
	System.out.println(a.deal());
}


}
}
