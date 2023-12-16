
public class StringFuncts {

	// 1.This method will return an email address in the form
	// first.last@ww-p.org
	// getEmail("Mister", "Connolly") ====> mister.connolly@ww-p.org
	public static String getEmail(String first, String last) {
		return first+"."+last+"@ww-p.org";
			}

	// 2. This method will return initials with periods.
	// getInitials("Mister", "Connolly") ====> M.C.
	public static String getInitials(String first, String last) {
		return first.charAt(0)+"."+last.charAt(0);
			}
	// 3. This method will determine if a String contains the '@' symbol
	// isValidEmail("tom.connolly@ww-p.org") ===> TRUE
	// isValidEmail("tom.connolly.ww-p.org") ===> FALSE
		public static boolean isValidEmail(String email) {
			if(email.contains("@")) {
				return true;
			} else {
				return false;
			}
					}

	// 4. This method will determine if a string is more than 8 characters 
	//isValid("programming") ====> true
	// sValid("java") ====> false
	public static boolean  isVocab(String word) {
			if(word.length() > 8) {
				return true;
			} else {
				return false;
			}
		}
	
// 5. This method will parse the year from a birthdate
	// in the form MMDDYYYY
	// getYear("06021966) ====> 1966
	public static String getYear(String bday) {
		return bday.substring(4);
			}

	// 6. This method will return a lower case
	// user name in the form of first 3 letters of first name and
	// last 3 letters of last name.
	// getUserName("Mister", "Connolly") ====> mislly
	public static String getUserName(String first, String last) {
		return first.substring(0,3)+last.substring(last.length()-3);
	}

	// 7. This method will parse the first name from a full name separated with
	// a space
	// getFirst("Mister Connolly") ====> Mister
	public static String getFirst(String fullName) {
		return fullName.substring(0, fullName.indexOf(' '));
	}

	// 8. This method will parse the last name from a full name separated with a
	// space
	// getLast("Mister Connolly") ====> Connolly
	public static String getLast(String fullName) {
		return fullName.substring(fullName.indexOf(' ')+1);
	}

	// 9. This will return a random 4 letter string of letters
	// getRandomWord() ====> CDRT
	public static String getRandomWord() {
		return Character.toString((char)(Math.random()*25)+65)+Character.toString((char)(Math.random()*25)+65)+Character.toString((char)(Math.random()*25)+65)+Character.toString((char)(Math.random()*25)+65);
	}

	// 10. This will return a new word of every other letter
	// everyOtherLetter("KNIGHTS") ====> KIHS
	public static String everyOtherLetter(String word) {
		String x = "";
		for(int i = 0; i < word.length();i+=2){
			x += Character.toString(word.charAt(i));			
			}
		return x;
		}

	// 11. This will return a new word that is the reverse.
	// reverse("KNIGHTS") ====> STHGINK
	public static String reverse(String word) {
		String x = "";
		for(int i = word.length()-1;  i >= 0;i--) {
			x += Character.toString(word.charAt(i));
		}
		return x;
	}
	

	// 12. This will return true if the sum of the first digit and the last
	// digit is divisible by 5.
	// checkDigit("123456789") ====> TRUE
	// checkDigit("12345543211") ====> FALSE
	// checkDigit("87878787") ====> TRUE
	public static Boolean checkDigit(String creditCard) {
		if(creditCard.charAt(0)+creditCard.charAt(1) - 94 % 5 == 0){
			return true;
		} else {
			return false;
		}
	}
	

	// 13. This will return a string where every other letter is capitalized
	// everyOtherLetterCaps("misterconnolly") ====> mIsTeRcOnNoLlY
	public static String everyOtherLetterCaps(String word) {
		String x ="";
		for(int i = 0; i < word.length(); i++) {
			if(i % 2 != 0) {
				 x += Character.toString(word.charAt(i)).toUpperCase();
			} else {
				 x += Character.toString(word.charAt(i));
			}
		}
	 return x;
	}

	// 14. This will return a string where every o is replaced with an 8
	// replacesOsWith8s("TomConnolly") ====> T8mC8nn8lly
	public static String replaceOsWith8s(String word){
		String x ="";
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'o' || word.charAt(i) == 'O') {
				 x += '8';
			} else {
				 x += Character.toString(word.charAt(i));
			}
		}
	 return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Email: " + getEmail("Mister", "Connolly"));
		System.out.println("2. Initials: " + getInitials("Mister", "Connolly"));
		System.out.println(getRandomWord());
		System.out.println(reverse("KNIGHTS"));
		System.out.println(replaceOsWith8s("smittyanddhroovy"));
		
		
	}
}

