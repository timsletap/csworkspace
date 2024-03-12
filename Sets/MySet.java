package Sets;

//import java.util.Iterator;


public interface  MySet<E>
	{
		public boolean add(E y);
		public boolean contains(E x); 
		public int size();
		public MyIterator<E> iterator();
		public boolean remove(E y);	
		public String toString();
	}


