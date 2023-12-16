import java.util.Scanner;

public class DecisionMethods {
// 1. returns one of the following
// Even Positive, Odd Positive, Zero, or Negative
public static String classify(int n) {
	if(n > 0) {
		if( n == 0) {
			return "Zero";
		} else if(n % 2 == 0) {
			return "Even Positive";
		} else if(n % 2 > 0) {
			return "Odd Positive";
		}else {
		    return "Negative";
		}
	}
	return null;
}
//2. this method will return the Letter Grade of a test
//F &lt;60
public static String letterGrade(int testGrade) {
	String letter = "";
	if(testGrade >= 90) {
		letter = "A";
	} else if(testGrade >= 80) {
		letter = "B";
	} else if(testGrade >= 70) {
		letter = "C";
	} else if (testGrade >= 60) {
		letter = "D";
	} else { 
			letter = "F";
		}
	return letter;
		}


// 3. this method will return the maximum value
public static int getMax(int m, int n, int o){
	if((m > n && m > o)) {
		return m;
	} else if(n > m && n > o) {
		return n;
	} else {
		return o;
	}
}

// 4. this method will print the three numbers in ascending order 
public static void sort1 (int a, int b, int c){
	if( a < b && a < c && b < c) {
		System.out.println(a+","+b+","+c);
	} else if( b < a && b < c && a < c) {
		System.out.println(b+","+a+","+c);
	}else if( c < a && c < b && a < b) {
		System.out.println(c+","+a+","+b);
	} else if( a < b && a < c && c < b) {
		System.out.println(a+","+c+","+b);
	} else if( b < a && b < c && c < a) {
		System.out.println(b+","+c+","+a);
	} else { 
		System.out.println(c+","+b+","+a);
	}
}
// 5. this method will create a chart of statistice of y rolls of a die

//1000000 TRIALS


//ONES: 166793 16.6793%
//TWOS: 166544 16.6544%
//THREES: 166732 16.6732%
//FOURS: 166817 16.6817%
//FIVES: 166144 16.6144%
//SIXES: 166970 16.697%
public static void dieTrials(int y){
	double one = 0;
	double two = 0;
	double three = 0;
	double four = 0;
	double five = 0;
	double six = 0;
	
	for(int i = 1; i <= y; i++) {
		int numRoll = (int)(Math.random()*6)+1;
	if(numRoll == 1) {
		one++;
	} else if(numRoll == 2) {
		two++;
	} else if(numRoll == 3) {
		three++;
	} else if(numRoll == 4) {
		four++;
	} else if(numRoll == 5) {
		five++;
	} else {
		six++;
	}
	}
	System.out.println("ONES: "+(one/y)*100 +"%"+"\n TWOS: "+(two/y)*100+"%"+"\nTHREES: "+(three/y)*100+"%"+"\n FOURS: "+(four/y)*100+"%"+"\n FIVES: "+(five/y)*100+"%"+"\n SIXES: "+(six/y)*100+"%");
	
}
//6. Write a program to count how many input values are positive, how many
//are negative, the sum of the positive and the sum of the negative. The input
//value 999 will mean that all numbers have been typed. (do not include 999 in
//calculations) Use the Scanner class to input values.
//
public static void numberInput() {
	Scanner scan = new Scanner(System.in);
	int pos = 0;
	int poscount = 0;
	int negcount = 0;
	int neg = 0;
	int enter = 0;
	int set = 0;
	
	while(set == 0) {
		System.out.println("Enter a number: (Type 999 to end)");
		enter = scan.nextInt();
		
		if(enter == 999) {
			set++;
		} else if( enter < 0) {
			negcount++;
			neg+=enter;
		} else if(enter > 0) {
			pos++;
			pos+=enter;
		}
		System.out.println(poscount+" positive numbers that add up to "+ pos);
		System.out.println(negcount+" negative numbers that add up to "+ neg);
	}
}
	
	public static void main(String[] args) {
		dieTrials(10000);
		numberInput();
	}
		
	

}