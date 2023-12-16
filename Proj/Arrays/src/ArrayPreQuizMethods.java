
public class ArrayPreQuizMethods {
	

	//Return true if loofFor is in the Array array else return false
    public static boolean searchearch(String[] array, String lookFor){
    	for(int i = 0; i < array.length; i++) {
    		if(lookFor.equals(array[i])) {
    			return true;
    		}
    	}
    	return false;
  }
    
	
	//Create an integer array of the first 500  perfect cubes starting with 0. {0,1,8, 27,…}. The array is returned at the end of the method. 
	public  static  int[]createCubes(){
		int[] perfCubes = new int[500];
		for(int i = 0; i < perfCubes.length; i++) {
			perfCubes[i] = i*i*i;
		}
		return perfCubes;
	
	}
	

 /*This method will determine if an array of Strings (words[]) is in alphabetical order. Return true/false.
words[]	isAlphabetical(words)
{apple, banana, strawberry}	true
{lime, cherry, lemon}	false*/

public static boolean isAlphabetical( String[] words){
	for(int i = 0; i < words.length-1; i++) {
		if(words[i].compareToIgnoreCase(words[i+1]) > 0 ) {
			return false;
	}
}

 return true;
}


//An double array []scores exists and contains golf score averages. 
//This method will create another array from the elements of []scores 
//that are less than 72. Return the array.

public static double[] getParArray (double []scores){
	int count = 0;
	for(int i = 0; i < scores.length; i++) {
		if(scores[i] <= 72.0) {
			count++;
		}
	}
	double[] parScores = new double[count];
	int c = 0;
 	for(int i = 0; i < scores.length; i++) {
 		if(scores[i] <= 72.0) {
			parScores[c] = scores[i];
			c++;
		}
 		
 	}
 	return parScores;
}

/*This method will return a new array containing the bigger corresponding value from int arrays one and two.  Return the array at the end.
Precondition: the length of one[]  is = the length of two[].

If one = {5,12,4,17} and two = {4,5,6,7},  {5,12,6,17} will be returned*/
public static int[] dropLowest (int[] one, int[] two){
	int[] dropLowest = new int[one.length];
	for(int i = 0; i < dropLowest.length; i++) {
		if(one[i] >= two[i]) {
			dropLowest[i] = one[i];
		} else {
			dropLowest[i] = two[i];
		} 
	}
	return dropLowest;
	}


	
	
	
//this main method will test your methods
	public static void main(String[] args) {
		String[] teachers = new String[] {"Allen","Connolly","McCann", "Miller","Vostal"};
		String[] fruit = new String[] {"watermelon","strawberry","banana", "lime"};
//Testing #1
		System.out.println("Look for Connolly? " +searchearch( teachers, "Connolly"));  //true
		System.out.println("Look for Romero? " +searchearch(teachers, "Romero"));		//false
		
//Testing #2	
		for(int x : createCubes())
			System.out.print(x + " ");
		System.out.println();    //0 1 8 27 64 125 216 343 512 729 1000 1331 1728 ... 123505992 124251499
//Testing #3
		System.out.println("Teachers alphabetical? " +isAlphabetical(teachers)); //true
		System.out.println("Fruits alphabetical? " +isAlphabetical(fruit)); //false
//Testing #4
		
		double[] myScores = {73.6,72.8,76.3,80.1,71.3,71.6,75,70.8};
		
		for (double x : getParArray(myScores))
				System.out.print(x + " " );		//71.3 71.6 70.8 
		System.out.println();
//Testing #5	
		
int a[] = {5,12,4,17};
int b[] ={4,5,6,7};
int c[] = dropLowest(a,b);

for (int i : c) {
	System.out.print(i + " ");   //5 12 6 17 
}
		
	}
}
	
	
