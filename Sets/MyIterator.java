package Sets;

public interface MyIterator<E>
{  
	   /**
	      Moves the iterator past the next element.
	      @return the traversed element
	   */
	  public E next();
	      
	   /**
	      Tests if there is an element after the iterator 
	      position.
	      @return true if there is an element after the iterator 
	      position
	   */
	   public boolean hasNext();
	      
	   /**
	      Adds an element before the iterator position
	      and moves the iterator past the inserted element.
	      @param element the element to add
	   */

	  public void remove();
}
