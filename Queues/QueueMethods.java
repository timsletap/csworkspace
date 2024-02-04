import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

    public static double getAverage(Queue<Integer> one) {
        double avg = 0;
        int i = 0;
        if (one.isEmpty()) {
            return 0;
        }

        while (!one.isEmpty()) {
            avg += one.poll();
            i++;
        }

        return avg / i;
    }

    public static Queue<String> removeEveryOther(Queue<String> x) {
        int n = x.size();
        for(int i = 0; i < n; i++){
            if(i % 2 == 0) {
                x.offer(x.poll());
            } else {
                x.poll();
            }
        }
        return x;
    }

        private static boolean isInOrder(Queue<Card> myDeck) {
        Card temp = myDeck.poll(); 
        while (!myDeck.isEmpty()) {
            Card current = myDeck.poll();
            if (temp.compareTo(current) > 0) {
                return false;
            }
           temp = current;
        }

      
        return true;
    }

    private static Queue<Card> dealHand(Queue<Card> myDeck, int count) {
        Queue<Card> hand = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            if (myDeck.isEmpty()) {
                System.out.println("The deck is empty.");
                break;
            }
            Card dc = myDeck.poll();  
            hand.offer(dc);    
            myDeck.offer(dc);         
        }
        return hand;
    }


        
    
    public static void main(String[] args) {
        
        Queue<Integer> integerQueue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(getAverage(integerQueue));

        
        Queue<String> stringQueue = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        removeEveryOther(stringQueue);
        System.out.println(stringQueue);

            
            Queue<Card> myDeck = new LinkedList<>();
        
            
            myDeck.add(new Card(1,2));          
            myDeck.add(new Card(3, 4));     
            myDeck.add(new Card(4, 11));     
            
            
           
            boolean result = isInOrder(myDeck);
            System.out.println(result);
        }
    


    
    }