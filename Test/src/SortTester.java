
public class SortTester {
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
    public static void insertionSortRecursive(int array[]) {
        insertionSortRecursive( array, array.length);
    }
    
     public static void insertionSortRecursive(int array[], int index){
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
     int left[] = new int[n1];
     int right[] = new int[n2];

     // Copy data to temp arrays
     for (int i = 0; i < n1; ++i)
     left[i] = arr[l + i];
     for (int j = 0; j < n2; ++j)
     right[j] = arr[m + 1 + j];

     // Merge the temp arrays

     // Initial indices of first and second subarrays
     int i = 0, j = 0;

     // Initial index of merged subarray array
     int k = l;
     while (i < n1 && j < n2) {
     if (left[i] <= right[j]) {
     arr[k] = left[i];
     i++;
     }
     else {
     arr[k] = right[j];
     j++;
     }
     k++;
     }

     // Copy remaining elements of L[] if any
     while (i < n1) {
     arr[k] = left[i];
     i++;
     k++;
     }

     // Copy remaining elements of R[] if any
     while (j < n2) {
     arr[k] = right[j];
     j++;
     k++;
     }
     }
        
     public static void mergeSortRecursive(int[] array) {
            mergeSortRecursive( array, 0, array.length-1);
     }

     public static  void mergeSortRecursive(int[] array, int left, int right) {
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

}
