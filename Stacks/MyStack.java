package Stacks;
/**
 * Write a description of interface MtStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface MyStack<E>
{  
   public E push(E item);
   
   public E pop();
 
   public E peek();
  
   public boolean isEmpty();
   
   public int size();
   
   public int search (E a);
   
   public String toString();
    
}
public class MyStack {
    
}
