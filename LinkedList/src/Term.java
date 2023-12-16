
public class Term {
	
	private int coeff;
	private int expo;
	
	
	public Term(int num1, int num2) {
		coeff = num1;
		expo = num2;
	}
	public int getCoeff() {
		return coeff;
	}
	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}
	public int getExpo() {
		return expo;
	}
	public void setExpo(int expo) {
		this.expo = expo;
	}
	
	public static Term add(Term a, Term b)
	{
		return new Term(a.getCoeff()+b.getCoeff(), a.getExpo());
	}
	public static Term multiply(Term a, Term b) {
		int newcoeff = a.getCoeff() * b.getCoeff();
		int newexpo = a.getExpo() + b.getExpo();
		return new Term(newcoeff, newexpo);
	}
	public String toString() {
		return this.coeff + "x^" + this.expo;
	}
	
	public static void main(String[] args) {
		Term p = new Term(3, 6);
		Term q = new Term(2, 6);
		Term r = new Term(4, 3);
		System.out.println(p);
		System.out.println(add(p, q));
		System.out.println(multiply(q, r));
		}
}


