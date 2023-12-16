import java.util.ArrayList;
import java.util.Random;

public class Methods {

	/*
	 *  1.  This method will return a random integer 9, 10, 11, or 12 (9 to 12 inclusive)
	 */
	public static int getRandomClass() {
			return (int)(Math.random()*4)+9;
}

	/*
	 *  2. This method will return a take a full name separated by a space (first last)
	 * and return it in the form of last, first getFormalName("Thomas Connolly")
	 * ====> Connolly, Thomas
	 */
	public static String getFormalName(String fullName) {
		String formName = "";
		int temp = 0;
		for(int i = 0; i < fullName.length();i++) {
			if(fullName.charAt(i) == ' ') {
				formName = fullName.substring(i+1);
				temp = i;
				break;
				
			}
		}
		return formName + ", "+  fullName.substring(0,temp);
	}

	/*
	 *  3. This will return a new word that is the reverse. reverse("KNIGHTS") ====>
	 * STHGINK
	 */
	public static String reverse(String name) {
			String temp = "";
			for(int i = name.length()-1; i >= 0; i--) {
				temp += Character.toString(name.charAt(i));
			}
			
			return temp;
}

	
	
	/*
	 * 4. Test integer n for prime or not prime precondition n>=2
	 */
	public static boolean isPrime(int n) {
		for(int i = 2; i < Math.sqrt(n); i++) {
			if((n % i == 0)) {
				return false;
			}
		}
		return true;
			
}

	/*  5. Calculates the sum of the digits of int n */
	public static int sumDigits(int n) {
		if(n == 1) {
			return 1;
		} 
		return n % 10 + sumDigits(n/10);
	}

	/*  6.This method prints a rowXcol matrix of asterisks */
	public static void matrix(int row, int col) {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j ++) {
					System.out.print("*");
				}
				System.out.println();
			}
}

	/*  7.Find and return the maximum value in the int array numbers */
	public static int getMax(int[] numbers) {
			int temp = numbers[0];
			for(int i = 1; i < numbers.length; i++) {
				if(temp < numbers[i]) {
					temp = numbers[i];
				}
			}
			return temp;
}

	/*
	 *  8. Determine if every element in the int array numbers is positive. Return
	 * True/False
	 */
	public static boolean allPositive(int[] numbers) {
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] < 0) {
					return false;
				}
			}
			return true;
}

	/*
	 *  9. An int array []salary contains the integer salary of all employees. Write a
	 * method that calculates the average salary.
	 */

	public static double avgSal(int[] salary) {
		double avg = 0;
		for(int i = 0; i < salary.length;i++) {
			avg+=salary[i];
		}
		return avg/salary.length;

			
}

	

	/**
	 * 10. This method will determine if an array of Strings (words[]) is in
	 * alphabetical order. Return true/false. isAlphabetical(words) {apple,banana,
	 * strawberry} ====> true {lime, cherry, lemon} ====> false
	 */

	public static boolean isAlphabetical(String[] words) {
		for(int i = 0; i < words.length-1; i++) {
			if(words[i].compareTo(words[i+1]) > 0) {
				return false;
			}
		}
		return true;
			
}

	/* 11. returns the average of the integers in ArrayList data */
	public static double getAverage(ArrayList<Integer> data) {
		double avg = 0;
		for(int i = 0; i < data.size();i++) {
			avg+=data.get(i);
		}
		return avg/data.size();

}
	
	/**
	 *  12. An ArrayList words contains strings that are ordered alphabetically. 
	 * Add the String ins to the list in the correct position
	 */
	public static void insertion(ArrayList<String> words, String ins) {
		int i = 0;
		while(i < words.size() && words.get(i).compareTo(ins) < 0) {
	      i++;
		}
		words.add(i, ins);
			
}



	// 13.  Return minimum value of an ArrayList of Integers
	public static int getMin(ArrayList<Integer> numbers) {
		int min = numbers.get(0);
		for(int i = 1; i < numbers.size(); i++) {
			if(min > numbers.get(i)) {
				min = numbers.get(i);
			}
			
		}
  return min;
	}

	// 14. Return a new ArrayList that contains only the positive numbers from numbers.
	public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
			ArrayList<Integer> newNums = new ArrayList<Integer>();
			for(int i = 0; i < numbers.size(); i++) {
				if(numbers.get(i) > 0) {
					newNums.add(numbers.get(i));
				}
			}
			return newNums;
}

	// 15. This method will return one Array of Strings that contain all of the Strings
	// from ArrayList one followed by all of the Strings from ArrayList two
	// The Lists might be different sizes

	public String[] append(ArrayList<String> one, ArrayList<String> two) {
		String[] combined = new String[one.size()+two.size()];
		for(int i = 0; i < one.size(); i++) {
			combined[i] = one.get(i);
		}
		for(int i = 0; i < two.size();i++) {
			combined[one.size()+i] = two.get(i);
		}
		
		return combined;
			
}

	
	// 16. Calculate and return the the average of a 2Dim Array
	public static double average(int[][] numbers) {
	double avg = 0;
	int count = 0; 
	for(int r = 0; r < numbers.length; r++) {
		for(int c = 0; c < numbers[r].length; c++) {
			avg += numbers[r][c];
			count++;
		}
	}
	return avg/count;
	
}

	// 17.  Find and return the the minimum value of a 2Dim Array
	public int minimum(int[][] numbers) {
		int min = numbers[0][0];
		for(int r = 0; r < numbers.length; r++) {
			for(int c = 0; c < numbers[c].length; c++) {
				if(min > numbers[r][c]) {
					min = numbers[r][c];
				}
			}
		}
		return min;
	}

	// 18. Create an 2Dim array with random numbers 0-100 (include 0 and 100)
	// the dimensions of the array will be rows x cols
	public int[][] getRandomArray(int rows, int cols) {
	int[][] randomArray = new int[rows][cols];
    Random random = new Random();
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            randomArray[i][j] = random.nextInt(101);
        }
    }

    return randomArray;
}

	

	// 19. returns a one dimensional array of strings from words that are
	// more than 5 letters
	public static String[] vocab(String[][] words) {
		  int count = 0;
		    for (int r = 0; r < words.length; r++) {
		        for (int c = 0; c < words[r].length; c++) {
		            if (words[r][c].length() > 5) {
		                count++;
		            }
		        }
		    }

		    String[] newArr = new String[count];

		    
		    int index = 0;
		    for (int r = 0; r < words.length; r++) {
		        for (int c = 0; c < words[r].length; c++) {
		            if (words[r][c].length() > 5) {
		                newArr[index] = words[r][c];
		                index++;
		            }
		        }
		    }

		    return newArr;
		}
		


	
	public static void main(String[] args) {
		System.out.println(getRandomClass());
		System.out.println(getFormalName("Smit Patel"));
		System.out.println(reverse("Smit"));
		System.out.println(sumDigits(1234));
		System.out.println(isPrime(17));
		matrix(3,5);
		int[] nums = {1,2,3,4,5,6,-23,21};
		System.out.println(getMax(nums));
		System.out.println(allPositive(nums));
		
		
			}

}

