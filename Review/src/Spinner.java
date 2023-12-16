import java.util.Random;
public class Spinner {
	private Random r;
	private static int[] numbers = {0,0,2,3};
	private int num;
	
	
	public Spinner() {
		r = new Random();
		num = r.nextInt(4);
	}
	
	public void spin() {
		num = numbers[r.nextInt(4)];
	}
	
	public int getNum() {
		return num;
	}

	
}
