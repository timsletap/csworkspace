
public class solution {
	 public int minPathSum(int[][] grid) {
	        int minSum = 0;
	        int r = 0;
	        int c = 0; 
	        minSum+=grid[r][c];
	        while(r < grid.length && c < grid[r].length){
	            if(grid[r+1][c] > grid[r][c+1]){
	                minSum += grid[r+1][c];
	            } else{
	                minSum+= grid[r][c+1];
	            }
	        }
	        return minSum;
	        } 
	 
	 public void main(String[] args) {
		 System.out.println();
	 }
}
