package myLL;

public class LinkedList<e> implements MyList<e>{
	private ListNode firstNode;
	
	public LinkedList() {
		firstNode = null;
		
	}
	public String toString() {
		String s = "";
		ListNode current = firstNode;
		while(current != null) {
			s += current.toString();
			current = current.getNext();
		}
		return s;
	}
	public void setFirstNode(ListNode x) {
		firstNode = x; 
	}
	
	public ListNode getFirstNode() {
		return firstNode;
	}
	
	public void addFirst(Object o) {
		firstNode = new ListNode(o, firstNode);
	}
	@Override
	public boolean add(Object o) {
		if(firstNode == null) {
			firstNode = new ListNode(o, firstNode);
			return true;
		}
		ListNode current = firstNode;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new ListNode(o, null));
		return true;
		
	}
	@Override
	public void addLast(Object o) {
		add(o);
	}
	@Override
	public void clear() {
		firstNode = null;
		
	}
	@Override
	public Object getFirst() {
		return firstNode;
	}
	@Override
	public Object getLast() {
		if(firstNode == null) {
			return null;
		}
		ListNode current = firstNode;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}
	@Override
	public Object removeFirst() {
		Object current = firstNode.getValue();
		firstNode = firstNode.getNext();
		return current;
	}
	@Override
	public boolean remove(Object o) {
		if(firstNode == null) {
			return false;
		}
		ListNode current = firstNode;
			if(current.getValue() == o) {
				this.removeFirst();
				return true;
			}
			
		int count = 0; 
		while(current.getNext() != null && current.getNext().getValue() != o) {
			current = current.getNext();
			count++;
		}
		if(count == this.size()) {
			return false;
		}
		if(current.getNext() == null) {
			return false;
		} else { 
		current.setNext(current.getNext().getNext());
		}
		return true;
		
}

	@Override
	public Object removeLast() {
		if(firstNode == null) {
			removeFirst();
		}
		ListNode current = firstNode;
		Object temp;
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		temp = current.getNext().getValue();
		current.setNext(null);
		return temp;
	}
	
	@Override
	public int size() {
		if(this.isEmpty()) {
			return 0;
		}
		int count = 0;
		ListNode current = firstNode;
		while(current != null) {
			current = current.getNext();
			count++;
		}
		return count;
	}
	@Override
	public boolean isEmpty() {
		return firstNode == null;
	}

	public static void main(String[] args){ 
		LinkedList<String> bowl = new LinkedList<String>();

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
	}
	
}
