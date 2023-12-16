
public class MagicSquares {
	public void printTable(int[][] square) {
		for(int row = 0; row < square.length; row++) {
			for(int col = 0; col < square[row].length; col++) {
				System.out.print(square[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	public int sumRow (int[][] square, int row) {
		int tot = 0;
		for(int i = 0; i < square[row].length; i++) {
			tot+=square[row][i];
		}
		return tot;
	}
	public int sumCol (int[][] square, int col) {
		int tot = 0;
		for(int i = 0; i < square.length; i++) {
			tot+=square[i][col];
		}
		return tot;
	}
	public int sumDiag1 (int[][] square) {
		int tot = 0;
		for(int i = 0; i < square.length; i++) {
			tot+=square[i][i];
		}
		return tot;
	}
	public int sumDiag2 (int[][] square) {
		int tot = 0;
		for(int i = 0; i < square.length; i++) {
			tot+=square[i][square.length-(i+1)];
		}
		return tot;
	}
//  Precondition:  square is an initialized matrix, MAX rows x MAX columns
//                 0 <= row < MAX
//  Postcondition: returns the sum of the values in row

 public boolean unique(int[][] square) {
//  Precondition: square is initialized with integers.
//  Action: Inspects every value in square, checking that each one is
//          a unique integer ranging from 1..MAX*MAX
//  Postcondition: Returns true if each value is unique from 1..MAX*MAX,
//                 otherwise returns false
int count = square.length*square.length;
int[] tally = new int[count+1];
	for(int r = 0; r < square.length; r++) {
		for(int c = 0; c < square[r].length; c++ ) {
			if(square[r][c] < 1 || square[r][c] > count) {
				return false;
			} else {
				tally[square[r][c]]++;
			}
		}
	}
	
	for(int i = 0; i < tally.length; i++) {
		if(tally[i] > 1) {
			return false; 
		} 
	}
	return true;
	
}


public boolean testMagic(int[][] square) {
//  Precondition: square is initialized with integers.
//  Action: Checks that row, col, and diagonal sums are equal and elements are unique
//  Postcondition: Returns true if magic else return false.
	int magicSum = sumDiag1(square);
	
	if(unique(square) == false) {
		return false;
	}
	for (int i = 0; i < square.length; i++) {
        if (sumRow(square, i) != magicSum) {
            return false;
        }
    }

    for (int i = 0; i < square[0].length; i++) {
        if (sumCol(square, i) != magicSum) {
            return false;
        }
    }
    if (sumDiag2(square) != magicSum) {
            return false;
        }
    
    return true;
}


public static void main(String[] args) {
int[][]  one ={{16, 3, 2,13},
        {5, 10, 11,8},
        {9, 6, 7,12},
        {4, 15, 14,1}};
        
int[][] two ={{14, 5, 2,4},
        {3, 12, 6,8},
        {9, 11, 7,10},
        {13, 15, 16,1}};
        
int[][] three ={{14, 5, 2},
        {3, 12, 6},
        {9, 11, 7}}; 
int[][] four ={{32,29, 4,1,24,21},
             {30,31, 2,3,22,23},
             {12,9, 17,20,28,25},
             {10,11, 18,19,26,27},
             {13,16, 36,33,5,8},
             {14,15, 34,35,6,7}}; 

int[][] five ={{1, 2, 3,4},
     {3, 4, 1,2},
     {4, 1, 2,3},
     {2, 3, 4,1}};                     
       
int[][] six ={{1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}}; 

MagicSquares tms  = new MagicSquares();  
tms.printTable(one);
System.out.println("MAGIC SQUARE? " + tms.testMagic(one));
System.out.println();
tms.printTable(two);
System.out.println("MAGIC SQUARE? " +  tms.testMagic(two));
System.out.println();
tms.printTable(three);
System.out.println("MAGIC SQUARE? " +  tms.testMagic(three));
System.out.println();
tms.printTable(four);
System.out.println("MAGIC SQUARE? " + tms.testMagic(four));
System.out.println();
tms.printTable(five);
System.out.println("MAGIC SQUARE? " +  tms.testMagic(five));
System.out.println();
tms.printTable(six);
System.out.println("MAGIC SQUARE? " + tms.testMagic(six)); 
}
}


