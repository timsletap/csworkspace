
public class Quadratics {
	int a;
	int b;
	int c;
	
	public Quadratics() {
		a = 0;
		b = 0;
		c = 0;
	}
	
	public Quadratics(int a, int b, int c) {
		this.a= a;
		this.b= b;
		this.c = c;
	}

	
	public boolean discriminant() {
		if((Math.pow(b, 2) - 4*a*c > 0)) {
			return true;
		} else {
			return false;
		}
	}
	public double root1() {
		return ((b*-1)+Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
	}
	public double root2() {
		return ((b*-1)-Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
	}
	public static void main(String[] args) {
		Quadratics myEquation1 = new Quadratics(2,6,-9);
		if (myEquation1.discriminant()){
		System.out.println("The solutions of Equation 1 are "+myEquation1.root1());
		System.out.println("and "+myEquation1.root2());
		}
		else
		{
		System.out.println("Equation 1 has No Real Solutions");
		}
	}
}
