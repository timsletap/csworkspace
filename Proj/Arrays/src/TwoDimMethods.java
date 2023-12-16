import java.util.Random;

public class TwoDimMethods {
    private int[][] numbers;

    public TwoDimMethods() {
   
        numbers = new int [][]  { { 11, 73, 5, 70 },
                                { 78, 276, 75, 34 },
                                { 21, 70, 94, 17 } };
    }
    
    public TwoDimMethods(int rows, int cols) {
    	numbers = new int[rows][cols];
    	Random gen = new Random(12345);
    	for(int r = 0; r < numbers.length; r++) {
    		for(int c = 0; c < numbers[r].length; c++) {
    			numbers[r][c] = gen.nextInt(101);
    		}
    	}
    	
    	
    }
    
    public void display() {
    	System.out.println("PrintLn Display");
    	for(int r = 0; r < numbers.length; r++) {
    		for(int c = 0; c < numbers[r].length; c++) {
    			System.out.print(numbers[r][c] + "  ");
    		}
    		System.out.println();
    	}
    }
    public void sideWaysDisplay() {
    	System.out.println("PrintLn Display");
    	for(int c = 0; c < numbers[0].length;  c++) {
    		for(int r = 0; r < numbers.length; r++) {
    			System.out.print(numbers[r][c] + "  ");
    		}
    		System.out.println();
    	}
    }
    
    
    public double average() {
    	double avg = 0;
    	int b = 0;
    	System.out.println("Average");
    	for(int r = 0; r < numbers.length; r++) {
    		for(int c = 0; c < numbers[r].length; c++) {
    			avg += numbers[r][c];
    			b++;
    		}
    	}
    	avg/=b;
    	return avg;
    }
    public double average2() {
    	double avg = 0;
    	int b = 0;
    	System.out.println("Average");
    	for(int[] x : numbers) {
    		for(int y : x) {
    			avg +=y ;
    			b++;
    		}  
    	}
    	avg/=b;
    	return avg;
    }
    
    public int minimum() {
    	int min = numbers[0][0];
    	double avg = 0;
    	int b = 0;
    	System.out.println("Minimum");
    	for(int r = 0; r < numbers.length; r++) {
    		for(int c = 0; c < numbers[r].length; c++) {
    			if(min > numbers[r][c]) {
    				min = numbers[r][c];
    		}
    	}
    	
    }
    	return min;
    }
    public int minimum2() {
    	int min = numbers[0][0];
    	double avg = 0;
    	int b = 0;
    	System.out.println("Minimum");
    	for(int[] x : numbers) {
    		for(int y : x) {
    			if(min > y) {
    				min = y;
    		}
    	}
    	
    }
    	return min;
    }

    public static void main(String args[]) {
    	TwoDimMethods newX = new TwoDimMethods();
    	newX.display();
    	newX.sideWaysDisplay();
    	System.out.println(newX.average());
    	System.out.println(newX.average());
    	System.out.println(newX.minimum());
    	System.out.println(newX.minimum2());


}
}
