
public class rightTriangle {
	private int leg1;
	private int leg2; 
	
	public rightTriangle(int leg1, int leg2) {
		this.leg1 = leg1;
		this.leg2 = leg2;
	}
	public rightTriangle() {
		this.leg1 = 0;
		this.leg2 = 0;
	}
	public double getArea() {
		return 0.5*leg1*leg2;
	}
	public double getPerimeter() {
		double hyp = Math.sqrt((double)Math.pow(leg1, 2)+Math.pow(leg2, 2));
		return leg1+leg2+hyp;
	}
	public static void main(String[] args) {
		rightTriangle one = new rightTriangle(4,7);
		System.out.println(one.getPerimeter());
	}
	
	
	

}
