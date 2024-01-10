public interface PriorityQueue<E>{
public boolean isEmpty();
public void offer(E x);
//Retrieves and removes the head of this queue, or null if this queue is empty.
public E poll();
//Retrieves, but does not remove, the head of this queue, returning null if this queue is empty.
public E peek();
public int size();
public String toString();


}

