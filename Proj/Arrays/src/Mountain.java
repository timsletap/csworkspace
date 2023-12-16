public class Mountain {
//needed for part (b):
		private static boolean isIncreasing(int[] arr, int stop) {
			for(int i = 0; i < stop; i++ ) {
				if(arr[i] >= arr[i+1]) {
					return false;
				}
			}
			return true; 
		}
		//needed for part (b):
		private static boolean isDecreasing(int[] arr, int start) {
			for(int i = start; i < arr.length-1; i++) {
				if(arr[i] <=  arr[i+1]) {
					return false;
				}
			}
			return true; 
		}		
		public static int getPeakIndex(int[] array) {
			for(int i = 1; i < array.length-1; i++ ) {
				if(array[i+1] < array[i] && array[i-1] < array[i]) {
					return i;
				}
			}
				return -1;
		}
		
		//part (b)
		public static boolean isMountain(int[] array) {
			int peak = getPeakIndex(array);
			if(peak == -1) {
				return false;
			}
			 return (isIncreasing(array,peak) && isDecreasing(array, peak)); 
		}


		
		


		public static void main(String[] args) {
			testPartA();
			testPartB();
		}

		public static void testPartA() {
			int[] arr1 = { 11, 22, 33, 22, 11 };
			int[] arr2 = { 11, 22, 11, 22, 11 };
			int[] arr3 = { 11, 22, 33, 55, 77 };
			int[] arr4 = { 99, 33, 55, 77, 120 };
			int[] arr5 = { 99, 33, 55, 77, 55 };
			int[] arr6 = { 33, 22, 11 };

			System.out.println( getPeakIndex(arr1) == 2 );
			System.out.println( getPeakIndex(arr2) == 1 );
			System.out.println( getPeakIndex(arr3) == -1 );
			System.out.println( getPeakIndex(arr4) == -1 );
			System.out.println( getPeakIndex(arr5) == 3 );
			System.out.println( getPeakIndex(arr6) == -1 );
		}

		public static void testPartB() {
			int[] arr1 = { 1, 2, 3, 2, 1 };
			int[] arr2 = { 1, 2, 1, 2, 1 };
			int[] arr3 = { 1, 2, 3, 1, 5 };
			int[] arr4 = { 1, 4, 2, 1, 0 };
			int[] arr5 = { 9, 3, 5, 7, 5 };
			int[] arr6 = { 3, 2, 1 };

			System.out.println( isMountain(arr1) );
			System.out.println( ! isMountain(arr2) );
			System.out.println( ! isMountain(arr3) );
			System.out.println( isMountain(arr4) );
			System.out.println( ! isMountain(arr5) );
			System.out.println( ! isMountain(arr6) );
		}

	}
