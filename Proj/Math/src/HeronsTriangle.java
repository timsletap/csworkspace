
public class HeronsTriangle {
	private int a;
	private int b;
	private int c;
	
	public HeronsTriangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public HeronsTriangle() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String toString() {
		return "Triangle: "+"\nSide 1 Length: "+a+"\nSide 2 Length: "+b+"\nSide 3 Length: "+c;
	}
	public int getLargest() {
		return Math.max(Math.max(a, b), c);
	}
	public void scaleSideLength(int x) {
		a*=x;
		b*=x;
		c*=x;
	}
	public double returnAverage() {
		return (a+b+c)/3.0;
	}
	public int returnPerimeter() {
		return a+b+c;
	}
	public double getArea() {
		double s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public boolean confirmTriangle() {
		if(a+b > c) {
			return true;
		} else if(b+c > a) {
			return true;
		} else if(a+c > b) {
			return true;
		} else {
			return false;
		}
	}
	public double returnHeight() {
		return (2*this.getArea())/this.getLargest();
	}
	public static void main(String[] args) {
		HeronsTriangle one = new HeronsTriangle(3,4,5);
		System.out.println(one.confirmTriangle());
		System.out.println(one.getArea());
		System.out.println(one.getLargest());
		System.out.println(one.returnAverage());
		System.out.println(one.returnPerimeter());
		System.out.println(one.returnHeight());
		one.scaleSideLength(2);
		System.out.println(one);
		System.out.println(one.confirmTriangle());
		System.out.println(one.getArea());
		System.out.println(one.getLargest());
		System.out.println(one.returnAverage());
		System.out.println(one.returnPerimeter());
		System.out.println(one.returnHeight());
		
	}
	

}
