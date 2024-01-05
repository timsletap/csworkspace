import java.util.ArrayList;

public class ArrayListQueue<E> implements MyQueue<E> {
    ArrayList<E> data;
    public ArrayListQueue(){
        data = new ArrayList<E>();

    }
    public boolean isEmpty() {
        return data.size() == 0;
    }

    @Override
    public boolean offer(E item) {
        return data.add(item);
        
    }

    @Override
    public E poll() {
      return data.remove(0);
       
    }

    @Override
    public E peek() {
       return data.get(0);
    }

    public String toString(){
        return data.toString();
    }


    public static void main(String[] args){
        ArrayListQueue<String> smit = new ArrayListQueue<String>();
        smit.offer("test1");
        smit.offer("test2");
        smit.offer("test3");
        smit.poll();
        System.out.println(smit);
        System.out.println(smit.peek());
        System.out.println(smit.isEmpty());
    } 
    
}
