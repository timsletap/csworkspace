package Sets;

import java.util.LinkedList;

public class LinkedListSet<E> implements MySet<E> {
    private LinkedList<E> temp; 

    public LinkedListSet() {
        temp = new LinkedList<>();
    }

   
    public LinkedList<E> getList() {
        return temp;
    }

    @Override
    public boolean add(E y) {
        if (!temp.contains(y)) {
            temp.add(y);
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(E x) {
        return temp.contains(x);
    }

    @Override
    public int size() {
        return temp.size();
    }

    @Override
    public MyIterator<E> iterator() {
        return new LLSIterator<E>(this); 
    }

    @Override
    public boolean remove(E y) {
        return temp.remove(y); 
    }

    @Override
    public String toString() {
        return temp.toString(); 
    }

    public static void main(String[] args) {
        LinkedListSet<String> set = new LinkedListSet<>();
        System.out.println("Adding 'Apple': " + set.add("Apple"));
        System.out.println("Adding 'Banana': " + set.add("Banana"));
        System.out.println("Adding 'Apple' again: " + set.add("Apple"));
        System.out.println("Set contains 'Apple': " + set.contains("Apple"));
        System.out.println("Set contains 'Orange': " + set.contains("Orange"));
        System.out.println("Set size: " + set.size());
        System.out.println("Set: " + set.toString());
        System.out.println("Removing 'Banana': " + set.remove("Banana"));
        System.out.println("Set size after removal: " + set.size());
        System.out.println("Set: " + set.toString());
    }
}