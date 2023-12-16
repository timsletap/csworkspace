
public class DecisionsQuizTakeHome {
	public static void getStatus(int score) {
		if(score > 1400) {
			System.out.println("full scholarship");
		} else if(score > 1300 && score <= 1400) {
			System.out.println("partial scholarship");
		} else if(score > 1100 && score <= 1300) {
			System.out.println("acceptance");
		} else if(score > 1000 && score <= 1100) {
			System.out.println("conditional acceptance");
		} else {
			System.out.println("denied");
		}
	}
	public static void getGrade(String className) {
		if(className.equalsIgnoreCase("Freshman")) {
			System.out.println("9");
		} else if(className.equalsIgnoreCase("Sophomore")) {
			System.out.println("10");
		} else if(className.equalsIgnoreCase("Junior")) {
			System.out.println("11");
		} else if(className.equalsIgnoreCase("Senior")) {
			System.out.println("12");
		} else {
			System.out.println("Invalid input");
		}
	}
	
	public static String getStanding2( int grade) {
		return (grade >= 70) ? "passing" : "failing";
	}
	
	public static int miniLotto(int a, int b, int c){
		if(a == b && b == c) {
			return 500;
		} else if(a == b || b == c || a == c) {
			return 10;
		} else {
			return 0;
		}
	
	}
    	
	public static int deliveryPrice(int ounces, String deliveryMethod) {
		int price;
		if(ounces >= 1 && ounces <= 8) {
			price = 3 * ounces;
		} else if(ounces >= 9 && ounces <= 16) {
			price = 2 * ounces;
		} else if(ounces == 0){
			return 0;
		} else {
			price = 2*16 + 1*(ounces-16);
		}
		
		if(deliveryMethod.equalsIgnoreCase("Regular")) {
			price+=5;
		} else if(deliveryMethod.equalsIgnoreCase("One-Day")) {
			price+=20;
		} else {
			return -1;
		}
		return price;
	}
	public static String postRating(int stars, String comment) {
		int points = 0;
		if(stars == 2) {
			points+=1;
		} else if(stars == 3) {
			points+=3;
		} else if(stars == 4) {
			points+=5;
		} else {
			points+=0;
		}
		if(comment.contains("!")){
			points+=3;
		}
		if(points >= 6) {
			return "Loved";
		} else if(points >= 4) {
			return "Liked";
		} else {
			return "Disliked";
		}
	}


	
	
	public static void main(String[] args) {
		getStatus(1000);
		getGrade("fResHman");
		getGrade("smit");
		System.out.println(getStanding2(65));
		System.out.println(miniLotto(1,1,1));
		System.out.println(miniLotto(1,2,1));
		System.out.println(miniLotto(1,2,3));
		System.out.println(deliveryPrice(14, "One-Day"));
		System.out.println(postRating(4,"I love your dog!"));
	}

}
