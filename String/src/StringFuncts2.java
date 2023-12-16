 public class StringFuncts2{
	// of letter in the string word.
	// countletter("o", "Connolly") ======> 2
	public static int countLetter(String letter, String word) {
		int count = 0;
		
		for(int i = 0; i < word.length();i++) {
			if(Character.toString(word.charAt(i)).equalsIgnoreCase(letter) ) {
				count++;
			}
		}
		return count;
	}


	// This method will put a name back in correct form
	// from an inputted String in the form last, first
	// getName ("Connolly, Tom") =========> Tom Connolly
	// precondition: inputed name is in the correct form
	public static String getName(String name) {
		String y = name;
		name = name.substring(0,name.indexOf(","));
		return y.substring(y.indexOf(" ")+1)+" "+name;
		
	}

	// This method will return a new String with the vowels removed

	public static String removeVowels(String fullName) {
		String noVow = fullName.toLowerCase();
		noVow = noVow.replaceAll("a", "");
		noVow = noVow.replaceAll("e", "");
		noVow = noVow.replaceAll("i", "");
		noVow = noVow.replaceAll("o", "");
		noVow = noVow.replaceAll("u", "");
		return noVow;
	
	}


	// This method returns an anagram of a word
	public static String anagram(String name) {
		String x = name;
		for(int i = 0; i < 100; i++) {
			int y = 1;
			x = x.substring(y+1) + x.charAt(y) + x.substring(0,y);
		}
		return x;
		
	}

	// This will create a random anagram of a string
	public static String randomAnagram(String name) {
		String x = name;
		for(int i = 0; i < x.length(); i++) {
			int y = (int) (Math.random()*x.length());
					x = x.substring(y+1) + x.charAt(y) + x.substring(0,y);
		}
		return x;
	}

	/* Pyramid 1
	  C
	  CO
	  CON
	  CONN
	  CONNO
	  CONNOL
	  CONNOLL
	  CONNOLLY*/
	  public static void displayPyramid1(String last)
	  {
		  String x ="";
		  for(int i = 0; i < last.length(); i++) {
			  x+=last.substring(i, i+1);
			  System.out.println(x);
		  }
	  }	  
	  
	  /*Pyramid 2
	  CONNOLLY
	  CONNOLL
	  CONNOL
	  CONNO
	  CONN
	  CON
	  CO
	  C*/
	  public static void displayPyramid2(String last)
	  {
		  for(int i = last.length(); i > 0; i--) {
			  System.out.println(last.substring(0,i));
			  
		  }

	  }


	  /*Pyramid 3

	  Y
	  LY
	  LLY
	  OLLY
	  NOLLY
	  NNOLLY
	  ONNOLLY
	  CONNOLLY
*/
	  public static void displayPyramid3(String last)
	  {
		  for(int i = last.length()-1; i >= 0; i--) {
			  System.out.println(last.substring(i, last.length()));
			  
		  }  
	  }

	  /*Pyramid 4
	  CONNOLLY
	  ONNOLLY
	  NNOLLY
	  NOLLY
	  OLLY
	  LLY
	  LY
	  Y*/
	  public static void displayPyramid4(String last)
	  {
		  for(int i = 0; i < last.length(); i++) {
			  System.out.println(last.substring(i, last.length()));
			  ;
		  }  
	      
	  } 
	  public static void main(String[] args) {
		  System.out.println(countLetter("S", "Sarsopapylus"));
		  System.out.println(getName("Patel, Smit"));
		  System.out.println(removeVowels("Encyclopedia"));
		  System.out.println(anagram("lollipop"));		
		  System.out.println(randomAnagram("lollipop"));
		  displayPyramid1("Smitty");
		  System.out.println();
		  displayPyramid2("Smitty");
		  System.out.println();
		  displayPyramid3("Smitty");
		  System.out.println();
		  displayPyramid4("Smitty");
	  }
 }

