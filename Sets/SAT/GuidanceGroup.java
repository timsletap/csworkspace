package Sets.SAT;

import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Comparator;

public class GuidanceGroup {

	private TreeSet<SatStudent> group;
    private TreeSet<SatStudent> group2;

	/**
	 * Default Constructor for objects of class GuidanceGroup
	 */

    public GuidanceGroup(){
        group = new TreeSet<SatStudent>();
        group2 = new TreeSet<SatStudent>(new Comparator<SatStudent>(){
            public int compare(SatStudent x, SatStudent y){
                return x.getName().compareTo(y.getName());
            }
        });
        load();
    }

	public void load() {
		File one = new File("Sets\\SAT\\SATData.txt");
		String name;
		int math, verbal, writing;
		try {
			Scanner in = new Scanner(one);
			while (in.hasNext()) {
				name = (in.next());
				math = (in.nextInt());
				verbal = (in.nextInt());
				writing = (in.nextInt());
				group2.add(new SatStudent(name, math, verbal, writing));
                group.add(new SatStudent(name, math, verbal, writing));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// displays the Students in descending order by total score
	public void displayByTotal() {
		System.out.printf("%-15s %6s", "NAME", "TOTAL");
		System.out.println();
		System.out.printf("%-15s %6s", "====", "=====");
		System.out.println();

        for(SatStudent s : group){
            System.out.println(s.name + "             " + s.total());
        }

	}

	// This method returns the name of the student with the lowest total SAT
	// score
	public String getMin() {
        return group.getLast().getName();

	}

	// This method returns the name of the student with the highest total SAT
	// score
	public String getMax() {
        return group.getFirst().getName();
	}

	// This method returns the average of the scores
	public double average() {
        double avg = 0;
        for(SatStudent s : group){
            avg += s.total();
        }

        return avg/group.size();

	}

	// displays the Students in ascending order by name
	public void displayByName() {

		System.out.printf("%-15s %6s", "NAME", "TOTAL");
		System.out.printf("%-15s %6s", "====", "=====");

        for(SatStudent s : group2){
            System.out.println(s.name + "             " + s.total());
        }
		

	}

	public static void main(String[] args) {
		GuidanceGroup tc = new GuidanceGroup();
		tc.displayByTotal();

		System.out.println("LOWEST: " + tc.getMin());
		System.out.println("HIGHEST: " + tc.getMax());
		System.out.println("AVERAGE: " + tc.average());

		System.out.println();
		tc.displayByName();

	}

}