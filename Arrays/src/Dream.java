import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Dream {
	
	/*This method creates a String array from the words in an external file
	 * The words will all be lower case.  No punctuation
	 *return the array
	 */
	public static String[] loadWords(String fileName) {

		String[] words;
		// count the words
		int index = 0;
		File file = new File(fileName);
		try {
			Scanner inFile = new Scanner(file);

			while (inFile.hasNext()) {
				inFile.next();
				index++;
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("File is in the wrong directory");
		}
		// create array
		words = new String[index];
		// load array
		index = 0;
		File file2 = new File(fileName);
		try {
			Scanner inFile2 = new Scanner(file2);

			while (inFile2.hasNext()) {
				String temp = inFile2.next();
				temp = temp.toLowerCase();
				temp = temp.replaceAll("[!;,:.?'\"-]", "");
				temp = temp.trim();

				words[index] = temp;
				index++;
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("File is in the wrong directory");
		}

		return words;
	}

	//Display the array a 
	 public static void display(String[] a)
	    {  
		 for(int i = 0; i < a.length; i++) {
			 System.out.print(a[i] + " ");
		 }
		}	
	
	/*Determine how many words have 1 letter, 2 letters, 3 letters, etc.  
	 Print out a table of possible word lengths and how many words have that length. 
     LENGTH      COUNT
     1           50
     2           331
     3           300

     14		1*/

	 public static void wordTally( String[] a){
		 int len = 0;
		 for(int i  = 0; i < a.length; i++) {
			len = Math.max(len, a[i].length());
		 }
		 int[] tally = new int[len+1];
		 for(int i = 0; i < a.length; i++) {
			 tally[a[i].length()]++;
		 }
		 for(int i = 1; i < tally.length; i++ ) {
			 System.out.println(i +"\t" + tally[i] );
		 }
	        
	    }

//return an array of words of 8 or more letters
	public static String[] vocab(String[] a){
		int count = 0;
	 for(int i = 0; i < a.length; i++) {
		 if(a[i].length() >= 8) {
		 count++;
		 }
	 }
	 String[] vocab = new String[count];
	 int x = 0;
	 for(int i = 0; i < a.length; i++) {
		 if(a[i].length() >= 8) {
			 vocab[x] = a[i];
			 x++;
		 }
	 }
	 return vocab;
	}

	//This method returns one of the words with the longest length
	 private static String getLongestWord (String[] a ){
		 int len = 0;
		 String word = "";
		 for(int i  = 0; i < a.length; i++) {
			len = Math.max(len, a[i].length());
		 }
		 for(int i = 0; i < a.length; i++ ) {
			 if(a[i].length() == len) {
				word = a[i];
				break;
			 }
		 }
		 return word;
	}   
	 
	 //This method sorts the words in alphabetical order
	 public static String[] sort(String[] a) {
		    String[] arr = a;
		    for(int i = 0; i < arr.length; i++) {
		        for(int j = i + 1; j < arr.length; j++) {
		            if (arr[i].compareTo(arr[j]) > 0) {
		                String temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
		            }
		        }
		    }
		    return arr;
		}

	
	 
	 public static void main(String[] args) {
		
		String[] dreamWords = loadWords("dream.txt");
		wordTally(dreamWords);
		System.out.println("Longest Word: " + getLongestWord(dreamWords) );
		String[] bigWords = vocab(dreamWords);
		System.out.println("Words longer than 8");
		display(bigWords);
		System.out.println();
		System.out.println("Ordered");;
		display(sort(bigWords));
		

	}

}
