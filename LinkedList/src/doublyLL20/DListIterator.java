package doublyLL20;

import java.util.NoSuchElementException;

public class DListIterator<E> implements DIterator <E> {

	private DListNode current;

	private DListNode previous;

	private DLinkedList myList; 

	private boolean canRemove; // for remove() method. true if OK to call 

	// remove() 

	public DListIterator(DLinkedList<E> list) { 

		myList = list; 

		current = null; 

		previous = null; 

		canRemove = false; 

	} 

//	public String toString(){
//
//	}
	public boolean hasNext() {
		if(myList.isEmpty()){
			return false;  //No Elements
		}
		
		// Beginning of list
		else if(current == null){
				return true;	
		}
		return (current.getNext() != null);		
	}
	
	public Object next() {
		if(myList.isEmpty()){
			throw new NoSuchElementException("No");
		}
		if(current == null){
			current =  myList.getFirst();
			canRemove = true;
			return current;
		}
		else{
			previous = current;
			if(current.getNext() == null)
				throw new NoSuchElementException("No");
			current = current.getNext();
			canRemove = true;
			return current;
		}
	}

	public boolean hasPrevious() {
		if(myList.isEmpty())
			return false;
		else if(current == null) //beginning
			return false;	
		else if(previous == null)//at beginning after moving back
				return true;	
		return(current.getPrevious() != null);	
	}

	public Object previous(){
		//System.out.print(previous + " " +current+ " ") ;
		if(myList.isEmpty()){
			throw new NoSuchElementException("No");
		}
		if(current == null){
			current = myList.getLastNode();
			return current;
		}
		else if(previous == null){
			current = null;
			return myList.getFirst();
		}
		else{
			DListNode temp = current;
			current = previous;
			if(current == null)
				throw new NoSuchElementException("No element");
			previous= current.getPrevious();
			canRemove = true;
			return  temp;
		}
	}
	
	public Object previousOld(){
		if(myList.isEmpty()){
			throw new NoSuchElementException("No");
		}
		if(current == null){
			current = myList.getLastNode();
			return current;
		}
		else{
			previous = current;
			if(current.getPrevious() == null)
				throw new NoSuchElementException("No");
			current= current.getPrevious();
			canRemove = true;
			return current;
		}

	}

	public void remove() {
		
		if (!canRemove)
			throw new IllegalStateException(
					"next() has not been called before remove()");
		else if (current.getPrevious() == null) { // first node will be removed
			myList.removeFirst();
			canRemove=false;
		}
		else {
			canRemove=false;
			previous.setNext(current.getNext());
			current.getNext().setPrevious(previous);
			current=previous;
		}
	}

	public void add(Object element) {
		if(myList.isEmpty()){
			myList.addFirst(element);
		}
		else if(current == null) {
			myList.addFirst(element);
		}
		else if(current.getPrevious() == previous){
			DListNode save = current.getNext();
			DListNode value = new DListNode(element, save, current);
			current.setNext(value);
			save.setPrevious(value);
			
		}
		else{
			DListNode save = current.getPrevious();
			DListNode value = new DListNode(element, current, save);
			current.setPrevious(value);
			save.setNext(value);
		}
	}

	public void set(Object element){
		if(current == null){
			throw new NoSuchElementException();
		}
		else{
			current.setValue(element);
		}
	}
}
