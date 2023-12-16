
public class LetterArray { 
 
 public String[] letter; 
 
 /** 
  * Default constructor for objects of class LetterArray 
  */ 
 public LetterArray() { 
  letter = new String[] { "r", "a", "c", "e", "c", "a", "r" }; 
 } 
 
 /** 
  * Constructor for objects of class LetterArray. Each letter of phrase will 
  * be assigned as an element in the array 
  */ 
 public LetterArray(String phrase) { 
	String[] letterX =  new String[phrase.length()];
  for(int i = 0; i < phrase.length(); i++) {
	  letterX[i] = Character.toString(phrase.charAt(i));
  }
  letter = letterX;
 }
 /** 
  * Prints the array in order 
  */ 
 public void display() { 
  for(int i = 0; i < letter.length; i++) {
	  System.out.print(letter[i]);
  }
 } 
 
 /** 
  * Prints the array in reverse order 
  */ 
 public void displayReverse() { 
  for(int i = letter.length-1; i >= 0; i--) {
	  System.out.print(letter[i]);
  }
 } 
 
 /** 
  * Prints the every other element of the array starting with the first 
  * letter. 
  */ 
 public void displayEveryOtherLetter() { 
  for(int i = 0; i < letter.length;i+=2) {
	  System.out.print(letter[i]);
  }
 } 
 
 /** 
  * Tests if palindrome. 
  */ 
 public boolean isPalindrome() { 
	 String forward = "";
	 String reverse = "";
	 
	 for(int i = 0; i < letter.length;i++) {
		 forward+=letter[i];
	 }
	 for(int i = letter.length-1; i >= 0;i--) {
		 reverse+=letter[i];
	 }
	 
	return forward.equalsIgnoreCase(reverse);
 } 
 
 
/** 
  * Changes the order of the array. (Scrambles the letters) 
  */ 
 public void anagram() { 
	 String[] letterY = letter;
  for(int i = 1; i < letter.length;i++) {
	  String temp = letter[i];
	 if(i+2> letter.length - 1) {
		 letter[i] = letter[i-1];
		 letter[i-1] = temp;
	 } else {
		 letter[i] = letter[i+2];
		 letter[i+2] = temp;
	 }
  }
 } 
 
 /** 
  * Counts the number of occurrences of an inputed letter in the array 
  */ 
 public int count(String x) { 
	 int count = 0;
	 for(int i = 0; i < letter.length; i++) {
		 if(letter[i].equalsIgnoreCase(x)) {
			 count++;
		 }
	 }
	 return count;
} 
 
 /** 
  * Return a chart of the letters of the alphabet and the letter count.
  * LETTER COUNT
  *  a 	2
  *  b		0
  *  c		1
  *………
  *  z       0
  */ 
 public void letterCount() { 
  int[] tally = new int[26];
  
  for(int i = 0;i < letter.length;i++) {
	 tally[letter[i].charAt(0) - 'a']++;
  }
  for(int i = 0; i < tally.length; i++) {
	  System.out.println(""+ (char) (i + 'a') + "\t" + tally[i]);
  }
  

 } 
 
 /** 
  * sorts the array alphabetically 
  */ 
 public void sort() { 
   for(int i = 0; i < letter.length; i++) {
	   for(int j = 0; j < letter.length; j++) {
		   if(letter[j].compareTo(letter[i]) > 0) {
			   String temp  = letter[j];
			   letter[j] = letter[i];
			   letter[i] = temp;
		   }
	   }
   } 
   }
public static void main(String[] args) { 
  LetterArray one = new LetterArray(); 
  LetterArray two = new LetterArray("programming"); 
  two.display();
  System.out.print("\n");
  two.displayReverse();
  System.out.print("\n");
  System.out.println(two.isPalindrome());
  two.anagram();
  System.out.print("\n");
  two.display();
  System.out.print("\n");
  two.letterCount();
  two.sort();
  two.display();
  
  
 } 
 
} 
