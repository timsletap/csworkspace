public class StringFuncts3 {


public static boolean isValid (String password){
	int containUP = 0;
	int containLOW = 0;
	for(int i = 0; i < password.length();i++) {
		if(password.charAt(i) >= 65 && password.charAt(i) <= 90) {
			containUP++;
		}
		if(password.charAt(i) >= 97 && password.charAt(i) <= 122) {
			containLOW++;
		}
		
	}
	if(password.length() >= 5 && containUP > 0 && containLOW > 0) {
		return true;
	} else {
		return false;
	}
		}


public static String getSecretWord (String phrase){
	String secret = "";
	for(int i = 0; i < phrase.length()-1; i++) {
		if(phrase.charAt(i+1) == ' ') {
			secret+=phrase.charAt(i);
		}
	}
	return secret+phrase.charAt(phrase.length()-1);
}


public static void extractFromEmail(String email){
	int period = email.indexOf(".");
	int amp = email.indexOf('@');
	String first = email.substring(0,period);
	String last  = email.substring(period+1, amp);
	String work = email.substring(amp+1);
	System.out.println("Hello, " + first + " " + last + ". How do you like working at " + work + "?");

}

public static void main(String[] args) {
	System.out.println(getSecretWord("Smit Likes To Eat Cheese Pizza Vigorously"));
	System.out.println(isValid("smitP"));
	extractFromEmail("smit.patel@wwprsd.org");
}
}