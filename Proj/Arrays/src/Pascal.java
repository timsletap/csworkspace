
public class Pascal {
	private int pascTri[][];
	
	
	
	public Pascal(int size) {
		pascTri = new int[size][size];
		build();
	}
	
	public Pascal() {
		this(20);
	}
	public void display() {
    	int count = pascTri.length;
    	for(int row = 0; row < pascTri.length; row++) {
    		for(int col = 0; col <= count; col++) {
    			System.out.printf("%3s", "");
    		}
    		for(int col = 0; col <= row; col++) {
    			System.out.printf("%6d", pascTri[row][col]);
    		}
    		System.out.println();
    		count--;
    	}
    }



	private void build() {
		for(int i = 0; i < pascTri.length; i++) {
			pascTri[i][0] = 1;
			pascTri[i][i] = 1;
		}
		for(int row = 2; row < pascTri.length; row++) {
			for(int col = 1; col < pascTri[row].length-1; col++) {
				pascTri[row][col] = pascTri[row-1][col-1] + pascTri[row-1][col];
			}
			
		}
	
		
	}
	
	public static void main(String[] args) {
		Pascal x = new Pascal(20);
		x.display();
	}

}
