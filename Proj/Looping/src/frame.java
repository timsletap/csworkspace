
public class frame {
	
	public static void frame(int x, int y, int z) {
		for(int i = 1; i <= z; i++) {
			for(int j = 1; j <= (2*(z))+x;j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		for(int a = 1; a<=y; a++) {
			for(int b = 1; b<=z ; b++) {
				System.out.print("-");
			}
			for(int c = 1; c <= x; c++) {
				System.out.print("*");
			}
			for(int b = 1; b<=z ; b++) {
				System.out.print("-");
			}
			System.out.println();
		}

		
		for(int i = 1; i <= z; i++) {
			for(int j = 1; j <= (2*(z))+x;j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		

	}
	
	public static void main(String[] args) {
		frame(7,3,4);
	}

}
