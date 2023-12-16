import java.util.ArrayList;

public class ArrayListPractice {
	//1. Create an ArrayList with 5 Strings. 
	public static ArrayList<String> create()
	{
		ArrayList<String> listy = new ArrayList<String>();
		listy.add("Cheese");
		listy.add("Bacon");
		listy.add("Lettuce");
		listy.add("Tomato");
		listy.add("Onion");
		return listy;

	}
	// 2. This method will print every other string in the ArrayList temp starting with the first.
	public static void displayEveryOther ( ArrayList<String> temp)
	{
		for(int i = 0; i < temp.size(); i+=2) {
			System.out.print(temp.get(i) + " ");
		}


	}
	//3 This method will search for a String lookFor in the ArrayList temp. Return true/false
	public static boolean search (ArrayList<String> temp, String lookFor  )
	{
		int x = temp.indexOf(lookFor);
		if(x != -1) {
			return true;
		}
		return false;
		

	}
	   
	   	//4.  Creates the ArrayList that contains the first 225 perfect squares starting with 1.  …(1,4,9,…n2.)
	   	public static ArrayList<Integer>perfectSquares() 
	  	{
	   		ArrayList<Integer> smit = new ArrayList<Integer>(); 
	    for(int i = 1; i <= 225; i++) {
	    	smit.add(i*i);
	    }
         return smit;

	}  
	 
	 //5. This method calculates the average of ArrayList<Integer> temp..   
	 
	 	public static double  average(ArrayList<Integer> temp)
	   	 {
	 		double avg = 0;
	 		for(int i = 0; i < temp.size(); i++) {
	 			avg += temp.get(i);
	 		}
return avg/temp.size();



	 	 } 

	//6. This method removes the odd numbers from the array temp   
	 
	 	public static ArrayList<Integer>  removeOdds (ArrayList<Integer> temp)
	   	 {
	 		for(int i  = temp.size()-1; i >= 0; i--) {
	 			if(temp.get(i) % 2 != 0) {
	 				temp.remove(i);
	 			}
	 			
	 		}
	 		return temp;



	 	 } 
	 	public static void main(String[] arg) {
	 		ArrayList<String> burger = create();
	        System.out.println(burger);
	        displayEveryOther(burger);
	        System.out.println(search(burger, "Bacon"));
	        System.out.println(search(burger, "Yes"));
	        System.out.println(perfectSquares());
	        System.out.println(average(perfectSquares()));
	        System.out.println(removeOdds(perfectSquares()));
	 	}

}
