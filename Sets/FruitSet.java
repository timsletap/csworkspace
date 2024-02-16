package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class FruitSet {
    HashSet<String> bowl;

    public FruitSet(){
        bowl = new HashSet<String>();
        bowl.add("apple");
        bowl.add("strawberry");
        bowl.add("pear");
        bowl.add("cherry");
        bowl.add("apple");
        System.out.println(bowl.add("peach"));
        System.out.println(bowl.add("peach"));
        System.out.println("Aa");
        System.out.println("BB");
    }

    public void display(){
        Iterator<String> i = bowl.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    public void display2(){
        for(String i: bowl){
            System.out.println(i);
        }
    }
    public void display3(){
        System.out.println(bowl);
    }
    public void displayHashCodes(){
        for(String x : bowl){
            System.out.println(x +": "+x.hashCode() + " "+ myHashCode(x));
        }
    }

    public int myHashCode(String current){
        int h = 0;
        int len = current.length();
        for(int i = 0; i < len; i++){
            h = 31 * h+ current.charAt(i);
        }
        return h;
    }

    public static void eratosthenes(int number){
        HashSet<Integer> nums = new HashSet<Integer>();
        for(int i = 2; i <= number; i++){
            nums.add(i);
        }
        for(int i = 2; i < number; i++){
            for(int j = 2; j < number; j++){
                nums.remove(i*j);
            }
        }
        System.out.println(nums);
        System.out.println(nums.size());
    }
    
    public static void main(String[] args){
        FruitSet tc = new FruitSet();
        tc.displayHashCodes();
        eratosthenes(1000);
       
    }
}
