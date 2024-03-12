package Sets.Nums;

import java.io.File;
import java.util.*;



public class TreeSetExample {
	TreeSet<Integer> tree;

	public TreeSetExample() {
		tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(23);
		tree.add(34);
		tree.add(45);
		tree.add(6);
		tree.add(9);
		tree.add(1);
		tree.add(31);
		tree.add(5);
	}

	public TreeSetExample(String file) {
        File one = new File("Sets\\Nums\\numbers.txt");
		tree = new TreeSet<Integer>();
		int num;
		try {
			Scanner in = new Scanner(one);
			while (in.hasNext()) {
				num = (in.nextInt());
				tree.add(num);

            }
    } catch (Exception e) {
        System.out.println(e);
    }

	}

	public void displayInOrder() {
        for(int s : tree){
            System.out.print(s + " ");
        }

	}

	public void displayReverse() {
        Iterator<Integer> temp = tree.descendingIterator();
        while(temp.hasNext()){
            System.out.print(temp.next() + " ");
        }

	}

	// Biggest number
	public int getBiggest() {
        return tree.getFirst();

	}

	// Smallest number
	public int getSmallest() {
        return tree.getFirst();

	}
 //empty set and display in order
	public void removeInOrder() {
        while(tree.size() > 0){
            System.out.println(tree.pollFirst());
        }

	}
	//empty set and display in reverse order
	public void removeInReverseOrder() {
        while(tree.size() > 0){
            System.out.println(tree.pollLast());
        }
	}

	public double getAverage() {
        double avg = 0; 
        for(int u : tree){
            avg += u;
        }
        avg /= tree.size();
        return avg;

	}

	public static void main(String[] args) {

		TreeSetExample defaultSet = new TreeSetExample("numbers.txt");
        
        System.out.println("Display numbers in order (default set):");
        defaultSet.displayInOrder();
        System.out.println("\nDisplay numbers in reverse (default set):");
        defaultSet.displayReverse();
        
        System.out.println("\nBiggest number (default set): " + defaultSet.getBiggest());
        System.out.println("Smallest number (default set): " + defaultSet.getSmallest());
        System.out.println("Average (default set): " + defaultSet.getAverage());

        System.out.println("\nRemoving in order (default set):");
        defaultSet.removeInOrder();

        TreeSetExample fileSet = new TreeSetExample("numbers.txt");
        System.out.println("\nDisplay numbers in order (file set):");
        fileSet.displayInOrder();
        System.out.println("\nDisplay numbers in reverse (file set):");
        fileSet.displayReverse();

        System.out.println("\nBiggest number (file set): " + fileSet.getBiggest());
        System.out.println("Smallest number (file set): " + fileSet.getSmallest());
        System.out.println("Average (file set): " + fileSet.getAverage());

        System.out.println("\nRemoving in reverse order (file set):");
        fileSet.removeInReverseOrder();


	}
}

