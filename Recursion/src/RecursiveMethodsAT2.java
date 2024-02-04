package Recursion.src;
public class RecursiveMethodsAT2 {

	public static boolean isPalindrome(String word) {
		if(word.length() <= 1) {
			return false;
		} else if(word.charAt(0) == word.charAt(word.length()-1)) {
			return true;
		} else { 
			word = word.substring(1, word.length()-1);
			return isPalindrome(word);
		}
	}
	
	private static int fibSum(int n) {
		if( n <= 1) {
			return n;
		} else if( n == 2) {
			return 2;
		}else {
			return fibSum(n-1) + fibSum(n-2) + 1;
	}
}
		
	
		



	//3. Find the area of a stack of 1x1 squares in the following pattern
	//[]
	//[][]
	//[][][]
			
	public static int getArea(int height){
		if(height == 1) {
			return 1;
		} else {
			return height + getArea(height-1);
		}
	}





	//4. Method oddSum returns the sum of the odd digits of its parameter n. For example:

	//oddSum(123) returns 4
	//oddSum(259) returns 14
	// precondition: n >= 0
	public static int oddSum(int n){
		if(n == 0) {
			return 0;		
		} else {
			int ones = n % 10;
			if(ones % 2 == 1) {
				return ones + oddSum(n / 10);
				} else {
					return oddSum(n / 10);
			}
		}
	}
		
		
	



	
	
	public static void decToBin(int num) {
		 if(num >= 1) {
		decToBin(num/2);
		System.out.print(num%2);
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(fibSum(5));
		decToBin(6);
	}

}
