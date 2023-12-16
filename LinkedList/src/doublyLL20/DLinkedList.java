package doublyLL20;

public class DLinkedList<E> implements MyList<E> {
	private DListNode firstNode;
	private DListNode lastNode;

	@Override
	public boolean add(Object o) {
		if(firstNode == null) {
			addFirst(o);
			return true;
		}
		
		DListNode temp = new DListNode(o, null, lastNode);
		lastNode.setNext(temp);
		lastNode = temp;
		return true;
	}

	@Override
	public void addLast(Object o) {
		add(o);
		
	}
	
	public DListNode getLastNode() {
		return this.lastNode;
	}

	@Override
	public void addFirst(Object o) {
		if(firstNode == null) {
			firstNode = new DListNode(o, null, null);
			lastNode =firstNode;
		} else {
			DListNode temp = new DListNode(o, firstNode, null);
			firstNode.setPrevious(temp);
			firstNode = temp;
			
			}
		}
		

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;
		
	}

	@Override
	public Object getFirstValue() {
		return firstNode.getValue();
	}
	
	public DListNode getFirst() {
		return firstNode;
	}
	
	public DListNode getLast() {
		return lastNode;
	}

	@Override
	public Object getLastValue() {
		return lastNode.getValue();
	}

	@Override
	public Object removeFirst() {
		Object current = firstNode.getValue();
		if(firstNode.getNext() == null) {
			this.clear();
		}
		
		firstNode = firstNode.getNext();
		firstNode.setPrevious(null);
		return current;
	}

	@Override
	public Object removeLast() {
		if(firstNode == lastNode) {
			removeFirst();
		}
		
		Object temp = lastNode.getValue();
		lastNode = lastNode.getPrevious();
		lastNode.setNext(null);
		return temp;
		
	}

	@Override
	public int size() {
		if(this.isEmpty()) {
			return 0;
		}
		int count = 0;
		DListNode current = firstNode;
		while(current != null) {
			current = current.getNext();
			count++;
		}
		return count;
	
	}

	@Override
	public boolean isEmpty() {
		return (firstNode == null) && (lastNode == null);
	}

	@Override
	public boolean remove(Object o) {
		if(firstNode == null) {
			return false;
		}
		DListNode current = firstNode;
			if(current.getValue() == o) {
				firstNode = firstNode.getNext();
				firstNode.setPrevious(null);
				return true;
			}
		
			while(current.getNext() != null && current.getNext().getValue() != o) {
				current = current.getNext();
			
			}
			if(current.getNext() == null) {
				return false;
			} else if(current.getNext().getNext() == null) {
				current.setNext(current.getNext().getNext());
				lastNode = current;
				return true;
			}  else {
			current.setNext(current.getNext().getNext());
			DListNode x = current.getNext();
			x.setPrevious(current);
			
			return true;
			}
			
		
	}
	
	public String toString() {
		String s = "";
		DListNode current = firstNode;
		while(current != null) {
			s += current.toString() + " ";
			current = current.getNext();
		}
		return s;
	}


public static void main(String[] args){ 
	DLinkedList<String> bowl = new DLinkedList<String>();

	bowl.addFirst("three");
	bowl.addLast("four");
	bowl.addLast("five");
	bowl.addLast("six");
	bowl.addLast("seven");
	bowl.addLast("eight");
	bowl.add("nine");
	bowl.add("ten");
	bowl.addFirst("two");
	bowl.addFirst("one");
	System.out.println("Testing addFirst(),addLast() methods");
	System.out.println(bowl);
	
	System.out.println("Testing previous links");
	DListNode x = bowl.getLastNode();
	while (x != null) { 
		System.out.print(x + " "); 
		x=x.getPrevious(); 
		}
	
	System.out.println();
	System.out.println("Testing removeFirst() and removeLast() methods");
	System.out.println("First? " + bowl.removeFirst());
	System.out.println("Last? " + bowl.removeLast());
	System.out.println(bowl);
	System.out.println ("Testing remove object");
	System.out.println("two? " + bowl.remove("two"));
	System.out.println("nine? " +  bowl.remove("nine"));
	System.out.println("five? " + bowl.remove("five"));
	System.out.println("eleven? " +bowl.remove("eleven"));
	System.out.println(bowl);
	System.out.println("Testing size()");
	System.out.println(bowl.size());
	System.out.println("Testing previous links");
	x = bowl.getLastNode();
	while (x != null) { 
		System.out.print(x + " "); 
		x=x.getPrevious(); 
		}
	
}
}

