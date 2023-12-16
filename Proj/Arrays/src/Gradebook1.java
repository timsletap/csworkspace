
import java.util.Scanner;


public class Gradebook1 {
	
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("How many tests?");
	int count = keyboard.nextInt();
	
	
	int[] t = new int[count];
	for(int i = 0; i < t.length; i++) {
		System.out.println("Enter test "+(i + 1));
		t[i] = keyboard.nextInt();
	}
	double sum = 0;
	for(int i = 0; i< t.length;i++) {
		sum+=t[i];
	}
	System.out.println("Average: "+sum/t.length);
	
	
	
}
}
