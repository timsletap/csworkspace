
public class LoopingWS3 {
	public static void pythTriplesList(){
		for(int a = 1; a <= 500; a++) {
			for(int b = a; b <= 500; b++) {
				for(int c = b; c <= 500; c++) {
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		/*
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 4; i >= 1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i = 4; i >= 1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		} */
		for(int i = 1; i <= 4;i++) {
			for(int x = 0; x<= (i - 1);x++) {
				System.out.print(" ");
			}
			for(int j = i; j <= 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i = 1; i<= 4; i++) {
			for(int x = 0; x<= (i - 1);x++) {
				System.out.print(" ");
			}
			for(int j = 4; j>=i;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i = 1; i<= 4; i++) {
			for(int x = 0; x<= (i - 1);x++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=5-i;j++) {
				System.out.print(j);
			}
			System.out.println();
			}
	}
	
}
