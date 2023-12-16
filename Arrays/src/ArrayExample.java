
public class ArrayExample {
private int[] numbArray;
// 1. Constructs a default array of size 10
public ArrayExample() {
numbArray = new int[10];
numbArray[0] = 1;
numbArray[1] = 3;
numbArray[2] = 7;
numbArray[3] = 19;
numbArray[4] = 15;
numbArray[5] = 19;
numbArray[6] = 7;
numbArray[7] = 3;
numbArray[8] = 19;
numbArray[9] = 48;
}
// 2. Constructs an array of random numbers (0-24) array of size count
public ArrayExample(int count) {
	numbArray = new int[count];
	for(int i = 0; i <= count-1; i++ ) {
		numbArray[i] = (int)(Math.random() * 25);
	}
		
}
// 3. This method prints all of the elements of the array in list form
public void display() {
	System.out.println("List");
	for(int i  = 0; i < numbArray.length; i++) {
		System.out.print(numbArray[i] + " ");
      }
}
public void display2() {
	System.out.println("List");
	for(int i  : numbArray) {
		System.out.print(numbArray[i] + " ");
      }
}
// 4. This method prints all of the elements in reverse order
public void displayReverse() {
	System.out.println("REVERSE LIST");
	for(int i = numbArray.length-1; i >=0 ; i--) {
		System.out.print(numbArray[i] + " ");
	}
}
// 5. This method calculates and returns the average of all of the elements
// The average of the default array is 14.1
public double average(){
	double sum = 0;
	for(int i = 0; i < numbArray.length; i++) {
		sum += numbArray[i];
	}
	 sum /= numbArray.length;
	 return sum;
		
}

// 6. This method returns the maximum value of all of the elements
// The max of the default array is 48.
public int findMax() {
	int num = Integer.MIN_VALUE;
	for(int i = 0; i < numbArray.length; i++) {
		if(numbArray[i] > num) {
			num = numbArray[i];
		}
	}
	return num;
}
// 7. This method returns the index number of the first instance of int lookFor
// returns -1 if not in the list
// ex. Using the default array findIndex(15) will return 4
public int linearSearch(int lookFor) {
	for(int i = 0; i < numbArray.length;i++) {
		if(numbArray[i] == lookFor) {
			return i;
		}
	}
	return -1;
}

/**
* 8. This method will print the elements and the tally. The chart with the
* default constructor will be
* Element Frequency
* 1 1
* 3 2
* 7 2
* 15 1
* 19 3
* 48 1
*/
public void tallyList(){
	int[] tally = new int[findMax()+1];
	
	for(int i = 0; i < numbArray.length; i++) {
		tally[numbArray[i]]++;
	}
	System.out.println("ArrayExample" + "\t" + "COUNT");
	for(int i = 0; i < tally.length; i++) {
		if(tally[i] > 0 ){
			System.out.println( i + "\t" +tally[i]);
			
		}
	}
	
}
/**
9. This method will print a column of numbers in the original order,
a column of numbers in reverse order, and the average of the two.
default constructor will be
LIST REVERSE AVERAGE
1 48 24.5
3 19 11.0
7 3 5.0
19 7 13.0
15 19 17.0
19 15 17.0
7 19 13.0
3 7 5.0
19 3 11.0
48 1 24.5 */
public void listReverseAvg() {
	for(int i = 0; i < numbArray.length; i++) {
		System.out.println(numbArray[i] + "\t"
				+ numbArray[numbArray.length - 1 - i] + "\t"
				+ (numbArray[i] + numbArray[numbArray.length - i - 1])/2.0);			
		}
	}


// 10. This method will sort the array in ascending order
//
public void sort() {
	for(int i = 0; i < numbArray.length; i++) {
		for(int j = 0; j < numbArray.length-1-i; j++) {
			if(numbArray[j] > numbArray[j + 1]) {
				int temp = numbArray[j];
				numbArray[j] = numbArray[j+1];
				numbArray[j+1] = temp;
			}
		}
	}
}
// 11. Binary Search. This method returns the index number of the first instance of int lookFor
// returns -1 if not in the list. The Array must be sorted to use the Binary search
// ex. Using the default array findIndex(15) will return 4
public int binarySearch(int lookFor) {
	int low = 0;
	int high = numbArray.length;
	while(low <= high) {
		int mid = low + (high - low) / 2;
		int diff = numbArray[mid] - lookFor;
		if(diff == 0) {
			return mid;
		} else if(diff < 0) {
			low = mid + 1;;
		} else {
			high = mid + 1;
		}
	}
	return -1;
}
// 12. Write a tester that will create a random array of size 50 and test all of these methods
//
public static void main(String[] args) {
	ArrayExample one = new ArrayExample();
	ArrayExample smit = new ArrayExample(50); 
	
	//smit.tallyList();
	smit.sort();
	System.out.println(smit.binarySearch(8));
	smit.listReverseAvg();
}

}
