package Sets;

import java.util.TreeSet;

public class FruitTreeSet {

    public static void main(String[] args){
        TreeSet<String> bowl = new TreeSet<String>();
        bowl.add("lemon");
        bowl.add("apple");
        bowl.add("strawberry");
        bowl.add("pear");
        bowl.add("cherry");
        System.out.println(bowl);

        System.out.println(bowl.last());
        System.out.println(bowl.first());
    }
    
}
