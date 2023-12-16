import java.util.Arrays;

public class SortSearch {



//iterative linear search
	
	
	public static void displayArray(int[] array) {
		String s="[";
		for (int i : array)
			s+=i + ", ";
		System.out.println(s.substring(0, s.length()-2)+ "]");
	}
	public static int linearSearch(int[] a, int lookFor) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == lookFor) {
				return i;
			}
		}
		return -1;
	}

	public static int linearSearchRecursive(int[] a, int lookFor)

	{
		return linearSearchRecursive(a, lookFor, 0);
	}

	private static int linearSearchRecursive(int[] a, int lookFor, int index) {
		if (index == a.length)
			return -1;
		else if (a[index] == lookFor)
			return index;
		else
			return linearSearchRecursive(a, lookFor, index + 1);
	}
	
	
	public static int binarySearch(int[] a, int lookFor) {
		int low = 0;
		int high = a.length - 1;
		int mid;
		
		while(low <= high) {
			mid = (low + high)/2;
		if(a[mid] == lookFor) {
			return mid;
		} else if( lookFor > a[mid]) {
			low = mid + 1;
		} else {
			high = mid -1;
		}
	}
		return -1;
	}

	/**
	 * Recursively finds the index number of lookFor in an array using Binary Search
	 * 
	 * @param arr. arr must be ordered for the algorithm to work
	 * @return the index number of lookFor. -1 if not found
	 */

	public static int binarySearchRecursive(int[] arr, int lookFor) {
		return binarySearchRecursive(arr, lookFor, 0, arr.length - 1);
	}

	static int binarySearchRecursive(int arr[], int lookFor, int start, int end) {
		int mid = (start+end)/2 ;
		if(arr[mid] == lookFor) {
			return mid;
		} else if(start >= end) {
			return -1;
		} else if(lookFor > arr[mid]) {
				return binarySearchRecursive(arr, lookFor, mid + 1 , end);
		} else {
				return binarySearchRecursive(arr, lookFor, start, mid-1);
		}
		
		

	}

	

	public static void selectionSort(int[] array) {
		
	for(int outer = 0; outer < array.length-1; outer++) {
		int minIndex = outer;
		for(int inner = outer + 1; inner < array.length; inner++) {
			if(array[inner] < array[minIndex]) {
				minIndex = inner;
			}
		}
			
		int temp = array[outer];
		array[outer] = array[minIndex];
		array[minIndex] = temp;
			
	}
  }


	public static void selectionSortRecursive(int[] array) {
		selectionSortRecursive(array, 0);
	}

	public static void selectionSortRecursive(int[] array, int startIndex) {
		if(startIndex >= array.length-1) {
			return;
		} int minIndex = startIndex;
		for(int index = startIndex + 1; index < array.length; index++) {
			if(array[index] < array[minIndex]) {
				minIndex = index;
			}
		}
		int temp = array[startIndex];
		array[startIndex] = array[minIndex];
		array[minIndex] = temp;
		selectionSortRecursive(array, startIndex + 1);
		
	}

	public static void insertionSort(int[] array)
    {
    for (int outer = 1; outer < array.length; outer++)
    {
    int position = outer;
    int key = array[position];
    // Shift larger values to the right
    while (position > 0 && array[position - 1] > key)
    {
    array[position] = array[position - 1];
    position--;
    }

    array[position] = key;
    }
    }

   
   static void insertionSortRecursive(int array[]) {
       insertionSortRecursive( array, array.length);
   }
   static void insertionSortRecursive(int array[], int index){
       
       if (index <= 1)
    return;
    insertionSortRecursive( array, index-1 );
    int last = array[index-1];
    int j = index-2;
     //displayArray(array);
    while (j >= 0 && array[j] > last){
    array[j+1] = array[j];
    j--;
    }
    array[j+1] = last;
   
    }
	public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        // Merge the temp arrays
 
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	
	static public void mergeSortRecursive(int[] array) {
	       mergeSortRecursive( array, 0, array.length-1);
	   }

	   static public void mergeSortRecursive(int[] array, int left, int right) {
	       int mid;
	       if (right > left) {
	           mid = (right + left) / 2;
	           mergeSortRecursive(array, left, mid);
	           mergeSortRecursive(array, (mid + 1), right);
	           merge(array, left, mid, right);
	       }
	   }
	   public static void quickSort (int[] list) {
	       quickSort(list,0, list.length-1);
	   }

	   public static void quickSort (int[] list, int first, int last)
	   {int g = first, h = last;
	    // int midIndex = (first + last) / 2;
	    //int dividingValue = list[midIndex];
	   int pivot = list[first];
	    do
	    { while (list[g] < pivot)
	    g++;
	    while (list[h] > pivot)
	    h--;
	    if (g <= h)
	    {
	    //swap(list[g], list[h]);
	    int temp = list[g];
	    list[g] = list[h];
	    list[h] = temp;
	    g++;
	    h--;
	    }
	    }
	    while (g < h);
	    if (h > first)
	    quickSort (list,first,h);
	    if (g < last)
	    quickSort (list,g,last);
	    }
	   public void cocktailSort(int a[])
	    {
	        boolean swapped = true;
	        int start = 0;
	        int end = a.length;
	 
	        while (swapped == true)
	        {
	            // reset the swapped flag on entering the
	            // loop, because it might be true from a
	            // previous iteration.
	            swapped = false;
	 
	            // loop from bottom to top same as
	            // the bubble sort
	            for (int i = start; i < end - 1; ++i)
	            {
	                if (a[i] > a[i + 1]) {
	                    int temp = a[i];
	                    a[i] = a[i + 1];
	                    a[i + 1] = temp;
	                    swapped = true;
	                }
	            }
	 
	            // if nothing moved, then array is sorted.
	            if (swapped == false)
	                break;
	 
	            // otherwise, reset the swapped flag so that it
	            // can be used in the next stage
	            swapped = false;
	 
	            // move the end point back by one, because
	            // item at the end is in its rightful spot
	            end = end - 1;
	 
	            // from top to bottom, doing the
	            // same comparison as in the previous stage
	            for (int i = end - 1; i >= start; i--)
	            {
	                if (a[i] > a[i + 1])
	                {
	                    int temp = a[i];
	                    a[i] = a[i + 1];
	                    a[i + 1] = temp;
	                    swapped = true;
	                }
	            }
	 
	            // increase the starting point, because
	            // the last stage would have moved the next
	            // smallest number to its rightful spot.
	            start = start + 1;
	        }
	    }

	

	public static void main(String[] args) {
		int[] x = { 11, 2, 3, 36, 17 };
		//selectionSort(x);
		selectionSortRecursive(x);
		//insertionSort(x);
		//insertionSortRecursive(x);
		//mergeSortRecursive(x);
		displayArray(x);
		
		 //System.out.println("linear Search: " +linearSearch(x,11));
		// System.out.println("linear Search: " +linearSearch(x,17));
		// System.out.println("linear Search: " +linearSearch(x,56));
		// System.out.println("linear Search: " +linearSearch(x, 36));
		// System.out.println("linear Search: " +linearSearchRecursive(x,11));
		// System.out.println("linear Search: " +linearSearchRecursive(x,17));
		// System.out.println("linear Search: " +linearSearchRecursive(x,56));
		// System.out.println("linear Search: " +linearSearchRecursive(x, 36));
		 //System.out.println("Binary Search: " +binarySearch(x,11));
		// System.out.println("Binary Search: " +binarySearch(x,17));
		// System.out.println("Binary Search: " +binarySearch(x,-56));
		// System.out.println("Binary Search: " +binarySearch(x, 36));
		//System.out.println("Binary Search: " +binarySearchRecursive(x,11));
		// System.out.println("Binary Search: " +binarySearchRecursive(x,17));
		// System.out.println("Binary Search: " +binarySearchRecursive(x,-56));
		// System.out.println("Binary Search: " +binarySearchRecursive(x, 36));
		/**
		 * ArrayList<Integer> numb = new ArrayList<Integer>(); numb.add(6); numb.add(3);
		 * 
		 */	
	

}
}