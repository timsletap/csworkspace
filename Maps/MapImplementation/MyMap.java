package Maps.MapImplementation;

import java.util.ArrayList;
import java.util.Entry;

public class MyMap<E, E2> implements MapImplementation<E, E2> {
private ArrayList<E> keys;
private ArrayList<E2> values;


public MyMap(){
    keys = new ArrayList<E>();
    values = new ArrayList<E>();
}

public E2 put(E key, E2 value){
    int i = keys.IndexOf(key);
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
    value.contains(value);
}

public Set<E> keySet(){
    HashSet<E> temp = new HashSet<E>();
    temp.addAll(keys);
    return temp;
}

public Set<Entry<E, E2>> entrySet(){
    HashSet<Entry<E, E2>> temp = new HashSet<Entry<E,E2>>();
    for (int i = 0; i < keys.size(); i++) {
        temp.add(new Entry<E, E2>(keys.get(i), values.get(i)));
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
    MyMap<String, Integer> map = new MyMap<>();
    System.out.println(map.put("one", 1)); 
    System.out.println(map.put("two", 2)); 
    System.out.println(map.put("one", 10)); // 1
    System.out.println(map.get("one")); // 10
    System.out.println(map.get("three")); 
    System.out.println(map.containsKey("two")); // true
    System.out.println(map.containsValue(2)); // true
    System.out.println(map.keySet()); 
    System.out.println(map.entrySet()); 
    System.out.println(map.remove("one")); // 10
    System.out.println(map.remove("three")); 
    System.out.println(map.isEmpty()); 
    map.clear();
    System.out.println(map.isEmpty()); // true
}


    
}

