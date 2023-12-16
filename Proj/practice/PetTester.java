import java.util.Scanner;
public class PetTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter pet name: ");
		String ptName = input.nextLine();
		System.out.println("Please enter pet type: ");
		String ptType = input.nextLine();
		System.out.println("Please enter pet age: ");
		int ptAge = input.nextInt();
		Pet pet1 = new Pet(ptName, ptType, ptAge);
		System.out.println("Pet Name: "+pet1.getName());
		System.out.println("Pet Type: "+pet1.getType());
		System.out.println("Pet Age: "+pet1.getAge());
		
		

   }
	
}
