import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

public class Fruits {
	private ArrayList<String> bowl;
	
	
	
	public Fruits() {
		bowl = new ArrayList<String>();
		bowl.add("banana");
		bowl.add("lemon");
		bowl.add("pear");
		bowl.add(0, "apple");
		bowl.add(4, "watermelon");
	}
	
	public void display() {
		for(int i = 0; i < bowl.size(); i++) {
			System.out.println(bowl.get(i));
		}
	}
	public void display2() {
		for(String f : bowl) {
			System.out.println(f);
		}
	}
	
	public void display3() {
		System.out.println(bowl.toString());
		
	}
	
	public void display4() {
		ListIterator<String> pointer = bowl.listIterator();
		while(pointer.hasNext()) {
			System.out.println(pointer.next());
		}
	}
	
	public void displayEveryOther() {
		for(int i = 0; i < bowl.size(); i+=2) {
			System.out.println(bowl.get(i));
		}
	}
	public void displayReverse() {
		for(int i = bowl.size()-1; i >= 0; i--) {
			System.out.println(bowl.get(i));
		}
	}
	public void reverse() {
		ArrayList<String> temp = bowl;
		for(int i = bowl.size()-1; i >= 0; i--) {
			temp.add(bowl.get(i));
		}
	}
	
	public void displayFirstLetter() {
		for(int i  = 0; i < bowl.size(); i++) {
			System.out.println(bowl.get(i).charAt(0));
		}
	}
	
	public void removeEveryOther() {
		for(int i = 0; i < bowl.size(); i++) {
			bowl.remove(i);
			}
		}
	
	public boolean check(String lookFor) {
		 return bowl.contains(lookFor);
	}
	
	public int search(String lookFor) {
		return bowl.indexOf(lookFor);
	}
	public void insert(String newFruit) {
		int index = 0;
		//find the index number of newFruit
		for (int i = 0; i < bowl.size(); i++) {
			if (newFruit.compareTo(bowl.get(i)) > 0) {
				index++;
			}
		}
		bowl.add(index, newFruit);
	}
	public void displayEveryOtherFruitReverse()
	{










	}

	
	public static void main(String[] args) {
		Fruits one = new Fruits();
		one.reverse();
		one.display();
 	}
}
