package Recursion.src;
public class GoldenRatio {
	
	public static double  goldenRatio(double n) {
		if(n == 0) {
			return 97;
	} else {
		return 1 + 1.0/goldenRatio(n-1);
	}
		
	
	}
	
	public static void main(String[] args) {
		System.out.println(goldenRatio(154));
	}

}
