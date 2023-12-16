import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LLNumbers {
   

public static int getSum(LinkedList<Integer> list) {
        int sum = 0; 
        ListIterator<Integer> temp = list.listIterator();
        while(temp.hasNext()) {
        	sum += temp.next();
        }
        return sum;
    }
   
public static int getMax(LinkedList<Integer> list) {
    int max = list.getFirst();
    ListIterator<Integer> temp = list.listIterator();
    while(temp.hasNext()) {
    	int 
    	x = temp.next();
    	if(max < x) {
    		max = x;
    	}
    }
    return max;
    }

public static void removeOdds(LinkedList<Integer> list) {
	ListIterator<Integer> temp = list.listIterator();
	while(temp.hasNext()) {
		if(temp.next() % 2 != 0) {
			temp.remove();
		}
	}
    }


/*public static void cardTrick() {
   //LinkedList<Integer> nums = new LinkedList<Integer>();
   //ListIterator<Integer> temp = nums.listIterator();
  int[] deck = new int[13];
   int num = 1;
   int i = 0;
  
	  for(int b = 0 ; b < 5;b++){
		   if(i % 13 == 0) {
			   i = 0;
		   }
		   \
		   if(deck[i] == 0) {
			   deck[i] = num;
			   num++;
			   i += i + 1;
		   } else {
			   i++;
		   }
		 
		 
		   
	   }
	   
   
   for(int j = 0; j < deck.length; j++) {
	   System.out.print(deck[j] + " ");
   }

}*/
   
    public static void main(String[] args) {    
    
    }

}