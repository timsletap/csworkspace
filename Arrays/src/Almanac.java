

public class Almanac {
	/**
	 * Almanac contains an Array of City objects
	 */
	City[] list;

	public Almanac() {
		list = new City[5];

		list[0] = new City(1547000, "Philadelphia");
		list[1] = new City(443775, "Atlanta");
		list[2] = new City(636470, "Boston");
		list[3] = new City(8336000, "New York");
		list[4] = new City(277347, "Newark");
	}

	public Almanac(int x) {
		list = new City[x];
	}

	/**
	 * Displays List of Cities  
	 */

	public void printList() {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName() + " " + list[i].getPopulation());
		}
	}
	/**
	 * Find the city with the smallest population return the name.
	 */

	public String smallestPop() {
		int min = list[0].getPopulation();
		for(int i = 0; i < list.length; i++) {
			if(min > list[i].getPopulation()) {
				min = list[i].getPopulation();
			}
		}
		String city ="";
		for(int i = 0; i < list.length; i++) {
			if(min == list[i].getPopulation()) {
				city = list[i].getName();
			}
		}
		return city;
	}	

	/**
	 * Find the average population of the list.
	 */
	public double averagePop() {
		double avg = 0;
		for(int i = 0; i < list.length; i++) {
			avg += list[i].getPopulation();
		}
		return avg/list.length;

	}

	/**
* Find the city searchName.  Change the population to newPopulation. Return true if  *searchName is found
	 */
	public boolean changePop(String searchName, int newPopulation) {
		boolean found = false;
		String city = "";
		for(int i = 0; i < list.length; i++) {
			if(list[i].getName().equalsIgnoreCase(searchName)) {
				city = list[i].getName();
				found = true;
			}
		}
		for(int i = 0; i < list.length; i++) {
			if(list[i].getName().equalsIgnoreCase(city)) {
				list[i].setPopulation(newPopulation);
			}
		}
		return found;
	}

	
	

/**
	* this method will add rate% to each population in the list
	*/

	public void increasePop(double rate) {
		for(int i = 0; i < list.length; i++) {
			list[i].setPopulation((int)(list[i].getPopulation()*(rate/100))+list[i].getPopulation());
		}

	}

	public static void main(String[] args) {
		Almanac tc = new Almanac();
		tc.printList();
		System.out.println("Average Population: " + tc.averagePop());
		System.out.println("Smallest: " + tc.smallestPop());
		System.out.println(tc.changePop("Newark", 1111111));
		System.out.println("After Change");
		tc.printList();
		tc.increasePop(3);
		System.out.println("After Increase");
		tc.printList();
	}

}
