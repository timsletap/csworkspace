import java.util.ArrayList;

public class RecursiveMethodsAP {

	/**
	 * 1. Recursively find and return the product of the first y whole numbers.
	 * 
	 * @param y
	 * @return y! as a long integer
	 */
	
	//The recursive definition of 7!   is 7 * 6!   (6! = 6 *5!)
	//We continue until we get to the base case (1!)
public static long factorial(int y) {

		if (y == 1) {
			return 1;
		}

		return y * factorial(y - 1);
	}

	/**
	 * 2. Recursively find and return the sum of the first y whole numbers.
	 * 
	 * @param y
	 * @return sum as an int
	 */
	public static int sumInt(int y)

	{
		if(y == 1) {
			return 1;
		}
		
		return y + sumInt(y-1);

	}

	/**
	 * 3. Recursively finds the value of 2 to the yth power
	 * 
	 * @param y
	 * @return 2^y as a long integer
	 */
	public static long powerOfTwo(int y)

	{
		if(y == 1){
			return 2;
		}
		return 2*powerOfTwo(y-1);
		

	}
/**
	 * 4. Recursively find the nth term of the Fibonacci Sequence
	 * 1,1,2,3,5,8,13.......
	 * 
	 * @param n
	 * @return nth term as an int
	 */
	public static int fib(int n) {
		if ((n == 0) || (n == 1)) {
	         return n;
		} else {
	         return fib(n - 1) + fib(n - 2);
		}

	}

	/**
	 * 5. Recursively finds and returns the sum of the digits of n
	 * 
	 * @param n
	 * @return
	 */
	public static int sumDigits(int n) {
		if(n == 1) {
			return 1;
		} 
		return n % 10 + sumDigits(n/10);
	}

	/**
	 * 6. Recursively find and return the reverse of a String s
	 * 
	 * @param s
	 * @return the reverse of s
	 */
	public static String reverse(String s) {
		if(s.length() == 0) {
			return "";
		}
			return Character.toString(s.charAt(s.length()-1)) + reverse(s.substring(0,s.length()-1));
		}
	
	public static double birthdayGift(int year) {
		if(year == 1) {
			return 0.01;
		}
		return birthdayGift(year-1)*2;
	}
	public static boolean  anyOdd(ArrayList<Integer> numbers){
		if(numbers.size() == 0) {
			return false;
		} else if(numbers.get(0) % 2 == 0 ) { 
			return true;
		} else {
			numbers.remove(0);
			return anyOdd(numbers);
		}
		
	}
	public static boolean  find(char lookFor, String lookIn){
		if(lookIn.length() == 0){
			return false;
		} else if(lookIn.charAt(0) == lookFor) {
			return true;
		} else {
			lookIn = lookIn.substring(1);
			return find(lookFor, lookIn);
		}
	}
	public static boolean isPalindrome(String word) {
		if(word.length() == 0) {
			return false;
		} else if(word.charAt(0) == word.charAt(word.length()-1)) {
			return true;
		} else { 
			word = word.substring(1, word.length()-1);
			return isPalindrome(word);
		}
	}
	public static int getArea(int height){
		if(height == 1) {
			return 1;
		}
		return height+getArea(height-1);
	}

	//5. Method oddSum returns the sum of the odd digits of its parameter n. For example:

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

	
	public static void decToBin(int num){
		if(num > 0) {
			decToBin(num/2);
			System.out.print(num % 2);
		}
	}
	
	public static int linearSearch(int[] a, int lookFor) {
		return linearSearch(a, lookFor, 0);
	}
	
	private static int linearSearch(int[] a, int lookFor, int index) {
		if(index == a.length) {
			return -1;
		} else if(a[index] == lookFor) {
			return index;
		} else {
			return linearSearch(a, lookFor, index + 1);
		}
	}
	
	
	
	public static int findSum(int[] a) {
		return findSum(a , 0);
	}
	private static int findSum(int[] a, int index) {
		if(index == a.length) {
			return 0;
		} else {
			return a[index] + findSum(a, index + 1);
		}
			}












	
	public static void main(String[] args) {
		System.out.println(sumInt(5));
		System.out.println(powerOfTwo(4));
		System.out.println(fib(11));
		System.out.println(sumDigits(1234));
		System.out.println(reverse("Smit"));
		System.out.println(birthdayGift(57));
		System.out.println(find('S', "Smit"));
		System.out.println();
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("smit"));
		System.out.println(oddSum(123));
		decToBin(25);
	}

}
