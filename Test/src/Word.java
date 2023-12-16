

public class Word{
private String original;

/**
* constructs a Word with String value s
* @param s is string value of Word
*/
public Word(String s)
{
original = s;
}
/**
* reverses letters in original string
* @return a string that is a reverse of original
*/
public String reverse()
{
String reverse = "";
for(int i = original.length()-1; i >= 0; i--) {
	reverse += Character.toString(original.charAt(i));
}
return reverse;
}
/**
* returns the length of the string
*/
public int getLength()
{
return original.length();
}
/**
* determines is word is a palindrome
* @return true if word is a palindrome, false otherwise
*/
public boolean isPalindrome()
{
	if(this.reverse().equalsIgnoreCase(original)){
		return true;
	} else { 
		return false;
	}
}
/**
* Alternate method to determine if word is a palindrome
* @return true if word is a palindrome, false otherwise
*/
public boolean isPalindrome2() {
    int x = 0;
	 for(int i = 0; i < original.length(); i++) {
		 for(int j = original.length()-1; j >= 0; j--) {
			 if(original.charAt(i) != original.charAt(j)) {
				 x++;
			 } 
		 }
	 }
	if(x == 0) {
		return true;
	} else {
		return false;
	}
}

/**
* removes vowels in original string
* @return a string that removes all of the vowels
*/
public String removeVowels()
{
	String noVow = original.toLowerCase();
	noVow = noVow.replaceAll("a", "");
	noVow = noVow.replaceAll("e", "");
	noVow = noVow.replaceAll("i", "");
	noVow = noVow.replaceAll("o", "");
	noVow = noVow.replaceAll("u", "");
	return noVow;
}


/**
* creates an anagram
* @return a string that is a random anagram of the original word
*/
public String anagram() {
String x = original;
for(int i = 0; i < 100; i++) {
	int y = (int) (Math.random()*x.length());
			x = x.substring(y+1) + x.charAt(y) + x.substring(0,y);
}
return x;
}

/**
* creates a secret code by finding the letter that is key letters away
* @return a string that where each letter is a position is key spaces away
* Be sure to wrap around at z
* if the word is jazz code(1) will return kbaa
*/
public String code( int key)
{
String code = "";
int len = original.length();
for(int i = 0; i< len; i++) {
	int x = original.charAt(i) + key;
	if( x >= 122) {
		x-=26;
	}
	code += (char)((x-97)%26+97);
}
return code;

}

public static void main(String[] args) {
	Word smit = new Word("jazz");
	System.out.println(smit.anagram());
	System.out.println(smit.code(1));
	System.out.println(smit.isPalindrome());
	System.out.println(smit.anagram());
	System.out.println(smit.isPalindrome2());
	System.out.println(smit.removeVowels());
	System.out.println(smit.reverse());
	System.out.println(smit.getLength());
	

	
}

}
