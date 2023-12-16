import java.util.*;

class Fruits {
	LinkedList<String> bowl;

//1. Default constructor. Create the LinkedList with 9 fruits (in alphabetical order) 
	public Fruits() {
		bowl = new LinkedList<String>();	
		bowl.addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		bowl.addLast("orange");
		bowl.addLast("pear");
		bowl.addLast("strawberry");
		bowl.addLast("watermelon");
		}

// 2. This method will print list.
	public void displayFruit() {
		ListIterator<String> iterator1 = bowl.listIterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+ " ");
		}
	}

// 3. This method will print every other fruit in the list starting with the first one.

	public void displayEveryOtherFruit() {
		ListIterator<String> iterator1 = bowl.listIterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+ " ");
			if(iterator1.hasNext())
				iterator1.next();
		}
	}
// 4. This method will remove every other fruit in the list starting with the first one.

	public void removeEveryOtherFruit() {
		ListIterator<String> iterator1 = bowl.listIterator();
		while(iterator1.hasNext()) {
			iterator1.next();
			iterator1.remove();
			if(iterator1.hasNext()) {
				iterator1.next();
			}
		}
	}

//5. This method will display the contents of the LinkedList in Reverse order
	public void displayReverse() {
		ListIterator<String> iterator1 = bowl.listIterator();
		while(iterator1.hasNext()) { iterator1.next();}
		while(iterator1.hasPrevious()) {
			System.out.print(iterator1.previous()+ " ");
		}
	}

// 6. Remove the fruit beginning with a letter beginningLetter
	public void delete(String firstLett) {
		ListIterator<String> temp = bowl.listIterator();
		while(temp.hasNext()) {
			if(Character.toString(temp.next().charAt(0)).equalsIgnoreCase(firstLett)) {
				temp.remove();
			}
		}
	}

// 7. This method will remove the last 2 fruits in the bowl
	public void removeLastTwoFruit() {
		ListIterator<String> temp = bowl.listIterator();
		while(temp.hasNext()) {temp.next();}
		for(int i = 0; i <= 1; i++ ) {
			if(temp.hasPrevious()) {
				temp.previous();
				temp.remove();
			}
		}
	}

//8. Assume the list is in alphabetical order.  This method will insert a String newFruit in the correct place in the list 
	private void insert(String newFruit) {
		ListIterator<String> temp = bowl.listIterator();
		while(temp.hasNext()) {
			if(temp.next().compareTo(newFruit) > 0) {
				temp.previous();
				temp.add(newFruit);
				return;
			}
		}
		temp.add(newFruit);
		return;
		
	}

	public static void main(String[] args) {
		Fruits tc = new Fruits();
		tc.insert("papaya");
		tc.displayFruit();

		

	}
}
