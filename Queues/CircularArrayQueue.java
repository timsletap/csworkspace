
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue as a circular array.
 */
public class CircularArrayQueue<E> implements MyQueue<E> {

	private int front; // the index # of the element in the front of the line
	private int end; // the index # where the next element will be added
	private int queueSize; // # of elements in queue. Changes when we offer or poll
	private E[] data; //

	/**
	 * Constructs a CircularArrayQueue object.
	 * 
	 * @param capacity the size of the array container
	 */
	public CircularArrayQueue(int capacity) {

		data = (E[]) new Object[capacity];
		front = 0;
		end = 0;
		queueSize = 0;
	}

    public E[] getData(){
        return this.data;
    }

	/**
	 * Adds an item to the end of the queue. Change the end index.
	 * 
	 * @param x the item to add.
	 * 
	 * if the array is full, call the resize() method the doubly the
	 * capacity of the array and rearrange the elements in the new array.
	 */
	public boolean offer(E x) {
        if(data.length == queueSize){
        resize();
        }
        data[end] = x;
        end = (end + 1) % data.length;
        queueSize++;
        return true;
    }
		
	

	
	/**
	 * Helper method to use when adding to a full array Double the size of the
	 * array. Change front and end to rearrange the elements so that the front is at
	 * the zero element and all other elements remain in order.
	 */

	private void resize() {
        CircularArrayQueue<E> newArr = new CircularArrayQueue<E>(queueSize*2);
        while(!this.isEmpty()){
            newArr.offer(this.poll());
        }
           data = newArr.getData();
        
        end = data.length/2;
        front = 0;
	}

	/**
	 * Test if the queue is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return (queueSize == 0);
	}




/**
	 * Removes an item from the front of the queue. change the end index
	 * 
	 * @return the removed item
	 * 
	 * throw a NoSuchElementException if queue has no elements
	 */
	public E poll() {	
        if(this.isEmpty()){
        throw new NoSuchElementException();
        }   
		 queueSize--;
        E temp = data[front];
        data[front] = null;
        front = (front + 1) % data.length;;
       
        return temp;
        }
	

	/**
	 * @return the element from the front of the queue.
	 * 
	 * throw a NoSuchElementException if queue has no elements
	 */
	public E peek() {
        return data[front];
	}

	/**
	 * Gets the number of items in the queue.
	 * 
	 * @return the size
	 */
	public int size() {
        return queueSize;
			}
	
	/**
	 * @return a String representation of the queue similar to Java’s toString
	 */
	public String toString() {
        List<E> temp = Arrays.asList(data);
		String s= "[";
		for(int i = 0; i < temp.size(); i++){
			if(temp.get(i) != null){
				s += temp.get(i) + ", ";
			} 
		}
			if(temp.get(temp.size()-1) != null){
				s += temp.get(temp.size() - 1)+ "] ";
			}
        return s.substring(0, s.length()-2) + "]";
	}

	/**
	 * Helper method for troubleshooting. Use this to ensure that the array is
	 * functioning circularly.
	 * 
	 * @return a String representation of the contents of the array
	 */

	public String toString2() {
		List<E> temp = Arrays.asList(data);
        return temp.toString();
	}

	



	public static void main(String[] args) {
		CircularArrayQueue<Integer> a = new CircularArrayQueue<Integer>(10);
		a.offer(1);
		a.offer(2);
		a.offer(3);
		a.offer(4);
		a.offer(5);
		a.offer(6);
		a.offer(7);
		a.offer(8);
		a.offer(9);
		System.out.println(a);
		System.out.println("NEXT: " + a.poll());
		System.out.println("NEXT: " + a.poll());
		System.out.println("NEXT: " + a.poll());
		System.out.println(a);
		a.offer(10);
		System.out.println(a);
		a.offer(11);
		System.out.println(a);
		a.offer(12);
		System.out.println(a);
		System.out.println("NEXT: " + a.poll());
		System.out.println(a);
		a.offer(13);
		System.out.println(a);
		a.offer(14);
		System.out.println(a);
		a.offer(15);
		System.out.println(a);
		System.out.println("NEXT: " + a.poll());
		System.out.println(a);
	}

}