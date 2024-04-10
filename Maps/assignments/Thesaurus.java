package Maps.assignments;

import java.util.HashMap;
import java.util.HashSet;

public class Thesaurus {

    HashMap<String, HashSet<String>> tc;

    public Thesaurus(){
        tc = new HashMap<String, HashSet<String>>();
    }

    public void add(String key, String obj){
        if(!tc.containsKey(key)){
            HashSet<String> t = new HashSet<>();
            t.add(obj);
            tc.put(key, t);
        }
        else{
            HashSet<String> t = tc.get(key);
            t.add(obj);
            tc.put(key, t);
        }
    }

    public void display(){
        for(String x: tc.keySet()){
            System.out.println(x + ": " + tc.get(x).toString());
        }
    }
    

    public static void main(String[] args) {
        Thesaurus tc = new Thesaurus();
        tc.add("large","big");
        tc.add("large","humongous");
        tc.add("large","bulky");
        tc.add("large","broad");
        tc.add("large","heavy");
        tc.add("smart","astute");
        tc.add("smart","clever");
        tc.add("smart","clever");
        tc.add("large","big");
        tc.add("heavy","weighty");
        tc.add("heavy","hefty");
        tc.display();
    }
     //output
    //heavy: [hefty, weighty]
    //large: [big, broad, bulky, heavy, humongous]
    //smart: [astute, clever]
}
