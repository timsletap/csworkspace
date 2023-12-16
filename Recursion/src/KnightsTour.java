public class KnightsTour {
	
private long calls;
private int[][] board;
//int rows;
//int cols;
public KnightsTour(int rows, int cols) {
board = new int[rows][cols];
calls = 0;

}
public long getCalls() {
	return calls;
}
public int[][] getBoard() {
	return board;
}
public void displayBoard() {
	for (int[] row : board) {
		for (int col : row)
			System.out.printf("%,3d", col);
		System.out.println();
}
System.out.println();
}
private boolean placeKnight(int startX, int startY) {
	
return placeKnight(startX, startY, 1);
}
//position (r,c), moveNum – order of knight placement
private boolean placeKnight(int r, int c, int moveNum) {
	calls++;
	if( r < 0|| c < 0 || r >= board.length || c >= board[r].length) {
        return false;
    }
    if(board[r][c] > 0) {
    	return false;
    } 
    
    board[r][c] = moveNum;
    if(moveNum == board.length * board[0].length) {
    	return true;
    }
    if(placeKnight(r+1, c+2, moveNum+1)) {
    	return true;
    }if(placeKnight(r+2, c+1, moveNum+1)) {
    	return true;
    }if(placeKnight(r-1, c+2, moveNum+1)) {
    	return true;
    }if(placeKnight(r-2,c+1, moveNum+1)) {
    	return true;
    }if(placeKnight(r+1, c-2, moveNum+1)) {
    	return true;
    }if(placeKnight(r+2, c-1, moveNum+1)) {
    	return true;
    }if(placeKnight(r-1, c-2, moveNum+1)) {
    	return true;
    }if(placeKnight(r-2, c-1, moveNum+1)) {
    	return true;
    }
    board[r][c] = 0;
    return false;
    
}


public static void main(String[] args) {
KnightsTour one = new KnightsTour(7,7);
one.placeKnight(0, 0);
one.displayBoard();
System.out.print("Recursive method call count: ");
System.out.printf("%,d", +one.getCalls());
//System.out.println();
 }
}