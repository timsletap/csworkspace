package Maps.assignments;

import java.util.HashMap;
import java.util.TreeMap;

public class NCAASquaresPool {
    private HashMap<Integer, Integer> temp;
    private int count;

    public NCAASquaresPool(int n) {
        temp  = new HashMap<>();
        count = n;
        for (int i = 0; i < 100; i++) {
            temp.put(i,0); 
        }
    }

    public void getScores() {
        int one = 1;
        int two = 1;
        int win = 0;
        for (int i = 0; i < count; i++) {
                 one = (int) (Math.random() * 50 + 50);
                 two = (int) (Math.random() * 50 + 50);  
            
            if(one > two){
             win = (one % 10) * 10 + (two % 10);
            } else {
            win = (two % 10) * 10 + (one % 10);
            } 

            if(!(one==two)){
                temp.put(win, temp.get(win) + 1); 
            }
        }      
    }
    
   public void displayResults() {
    TreeMap<Double, Integer> newTemp = new TreeMap<>();
    double percentage;
    for (int key : temp.keySet()) {
        int value = temp.get(key);
        percentage = 100.0 * value / count;
        newTemp.put(percentage + (double) key / 1000, key);
    }
    for (double key : newTemp.keySet()) {
        int value = newTemp.get(key);
        System.out.println(String.format("%02d", value) + ": " + String.format("%.2f%%", key));
    }
}
    public static void main(String[] args) {
        NCAASquaresPool squaresPool = new NCAASquaresPool(100000);
        squaresPool.getScores(); 
        squaresPool.displayResults();
    }
}
