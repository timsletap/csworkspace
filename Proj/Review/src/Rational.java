

public class Rational implements Comparable<Rational>{
	private int numerator;
	private int denominator;
	
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.simplify();
	}
	
	public void simplify() {
		
		int gcd = gcd(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
		if(denominator < 0) {
			denominator = denominator *-1;
			numerator = numerator*-1;
		}
		
				
	
	}
			
		
	
	private int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
	
	public int getNumer() {
		return numerator;
	}
	
	public int getDenom() {
		return denominator;
	}
	
	public void setNumer(int num) {
		numerator = num;
	}
	
	public void setDenom(int denom) {
		denominator = denom;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public double getValue() {
		return ((double) numerator)/denominator;
	}
	
	public boolean equals(Rational other) {
		if(other.getValue() == this.getValue()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public int compareTo(Rational other) {
		 if(this.getValue() > other.getValue()) {
			return 1;
		}  else if( this.getValue() < other.getValue()) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
	public static Rational add(Rational one, Rational two) {
		int tempDen = one.getDenom() * two.getDenom();
		
		int addOne = one.getNumer() * two.getDenom();
		int addTwo = two.getNumer() *one.getDenom();
		Rational temp = new Rational(addOne+addTwo,tempDen);
		temp.simplify();
		
		return temp;
		
		
		
	}
	
	public static Rational subtract(Rational one, Rational two) {
		int tempDenom = one.denominator * two.denominator;
		int subOne = one.getNumer() * two.getDenom();
		int subTwo = two.getNumer() *one.getDenom();
		Rational temp = new Rational(subOne - subTwo, tempDenom);
		temp.simplify();
			return temp;
		
	}
	
	public static Rational getReciprocal(Rational one) {
	return new Rational(one.denominator, one.numerator);
	}
	
	public static Rational multiply(Rational one, Rational two) {
		Rational temp = new Rational(one.getNumer()*two.getNumer(), one.getDenom()*two.getDenom());
		temp.simplify();
		return temp;
		
	}
	
	public static Rational divide(Rational one, Rational two) {
		Rational temp = getReciprocal(two);
		return multiply(one, temp);
		
	}
	
	public static void main(String[] args) {
		Rational numOne = new Rational(3,4);
		Rational numTwo = new Rational(1,2);
		System.out.println(add(numOne, numTwo));
		System.out.println(subtract(numOne, numTwo));
		System.out.println(multiply(numOne, numTwo));
		System.out.println(divide(numOne, numTwo));
		System.out.println(getReciprocal(numOne));
		System.out.println(subtract(numTwo, numOne));
		
	}

	

}
