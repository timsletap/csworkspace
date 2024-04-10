package Maps.assignments;


import java.util.TreeMap;
import java.util.TreeSet;


public class ReviewMapandSets {

    public static String SecretCode(String input) {
        TreeSet<Character> temp = new TreeSet<Character>();
        for(char c : input.toCharArray()){
            temp.add(c);
        }
        String x = "";
        for(char s : temp){
            x += ""+s;
        }
        return x;
    }

    public static void letterTally(String input){
        TreeMap<Character, Integer> temp = new TreeMap<Character, Integer>();
        for(char c : input.toCharArray()){
            if(temp.containsKey(c)){
                int count = temp.get(c) + 1;
                temp.put(c, count);
            } else {
                temp.put(c, 1);
            }
        }
        for(char c : temp.keySet()){
            System.out.println(c + "    " + temp.get(c));
        }
    }


    public static void main(String[] args){
        System.out.println(SecretCode("connolly"));
        letterTally("connolly");
    }
    
}
