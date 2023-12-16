import java.util.Scanner;
public class Equals {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your computer programming teacher");
		String teacher = key.next();
		
		if(teacher.equals("Connolly")) {
			System.out.println(" .equals()? Yes");
			
		} else {
			System.out.println(".equals() No");
		}
		
		//3 types of errors
		//1. Logic Error..... == not .equals()
		//2. Compile error (Syntax error) no semicolon
		//3. Run time error
	}
}
