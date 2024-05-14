package Maps;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleEntry;
import java.util.Set;


   public class MyMap<E, E2> implements MapImplementation<E, E2> {
private ArrayList<E> keys;
private ArrayList<E2> values;


public MyMap(){
    keys = new ArrayList<E>();
    values = new ArrayList<E2>();
}

public E2 put(E key, E2 value){
    int i = keys.indexOf(key);
    if(i == -1) {
        keys.add(key);
        values.add(value);
        return null;
    } else {
        E2 replaced = values.get(i);
        values.set(i, value);
        return replaced;
    }
}

public E2 remove(E key){
    int i = keys.indexOf(key);
        if (i != -1) {
            E2 removed = values.remove(i);
            keys.remove(i);
            return removed;
        } else {
            return null;
        }
}

public E2 get(E key){
    int i = keys.indexOf(key);
        if (i != -1) {
            return values.get(i);
        } else {
            return null;
        }
}

public boolean containsKey(E key){
    return keys.contains(key);
}

public boolean containsValue(E2 value){
    return values.contains(value);
}

public Set<E> keySet(){
    HashSet<E> temp = new HashSet<E>();
    temp.addAll(keys);
    return temp;
}



public Set<Entry<E, E2>> entrySet() {
    Set<Entry<E, E2>> temp = new HashSet<Entry<E,E2>>();
    for (int i = 0; i < keys.size(); i++) {
        temp.add(new SimpleEntry<E, E2>(keys.get(i), values.get(i)));
    }
    return temp;
}

public void clear() {
    keys.clear();
    values.clear();
}

public boolean isEmpty() {
    return keys.isEmpty();
}

public int size() {
    return keys.size();
}



public static void main(String[] args){
    MyMap<String, Integer> map = new MyMap<String, Integer>();
   map.put("one", 1); 
    map.put("two", 2); 
    map.put("one", 10); 
    System.out.println(map.get("one")); // 10
    System.out.println(map.values);
    System.out.println(map.keys);
    System.out.println(map.get("three")); //null
    System.out.println(map.containsKey("two")); // true
    System.out.println(map.containsValue(2)); // true
    System.out.println(map.keySet()); 
    System.out.println(map.entrySet()); 
    System.out.println(map.remove("one")); // 10
    System.out.println(map.remove("three")); 
    System.out.println(map.isEmpty()); //false
    map.clear();
    System.out.println(map.isEmpty()); // true
}







    
}

