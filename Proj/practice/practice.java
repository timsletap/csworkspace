
public class practice {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(i);
			}
		System.out.println();
		}
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		int n= 24;
		int fact = 1;
		boolean check = false;
		for(int i = 1; i <= n; i++) {
			fact*=i;
			if(fact == n) {
				check = true;
			}
		}
		System.out.println(check);

		
	}
	
}


