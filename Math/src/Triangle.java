public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	
	public Triangle() {
		a = new Point(10, 0);
		b = new Point(0, 0);
		c = new Point(7, 10);
	}

	public Triangle(Point newA, Point newB, Point newC) {
		a = newA;
		b = newB;
		c = newC;
	}

	public Triangle(double newX1, double newY1, double newX2, double newY2, double newX3, double newY3) {
		a = new Point(newX1, newY1);
		b = new Point(newX2, newY2);
		c = new Point(newX3, newY3);
	}

	
	public double sideA() {
		return Math.sqrt(Math.pow(c.getX()-b.getX(),2)+Math.pow(c.getY()-b.getY(),2));
	}

	public double sideB() {
		return Math.sqrt(Math.pow(a.getX()-c.getX(),2)+Math.pow(a.getY()-c.getY(),2));
	}

	public double sideC() {
		return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
	}

	public String toString() {
		return "Point A:("+a.getX()+","+a.getY()+")"+"\nPoint B:("+b.getX()+","+b.getY()+")"+"\nPoint C:("+c.getX()+","+c.getY()+")";
	}
	
	public double perimeter() {
		return this.sideA()+this.sideB()+this.sideC();
		
	}
	public double area() {
		double s = (this.sideA()+this.sideB()+this.sideC())/2.0;
		return Math.sqrt(s*(s-this.sideA())*(s-this.sideB())*(s-this.sideC()));
	}
	public double angleA() {
	return Math.acos((Math.pow(this.sideB(), 2)+Math.pow(this.sideC(), 2)-Math.pow(this.sideA(), 2))/(2*this.sideB()*this.sideC()))*(180.0/Math.PI);
	}
	public double angleB() {
	return Math.acos((Math.pow(this.sideC(), 2)+Math.pow(this.sideA(), 2)-Math.pow(this.sideB(), 2))/(2*this.sideA()*this.sideC()))*(180.0/Math.PI);
	}
	public double angleC() {
	return Math.acos((Math.pow(this.sideA(), 2)+Math.pow(this.sideB(), 2)-Math.pow(this.sideC(), 2))/(2*this.sideA()*this.sideB()))*(180.0/Math.PI);
	}

	public Point centroid() {
	double x = (a.getX()+b.getX()+c.getX())/3.0;
	double y = (a.getY()+b.getY()+c.getY())/3.0;
	Point cent = new Point(x,y);
	return cent;
	}
	

	public static void main(String[] args) {
		Triangle myTriangle = new Triangle(.5, 7, 0, 3.2, 5.00, 2.0);
		System.out.println("A " + myTriangle.sideA());
		System.out.println("B " + myTriangle.sideB());
		System.out.println("C " + myTriangle.sideC());
		System.out.println(myTriangle);
		System.out.println(myTriangle.centroid());
		System.out.println(myTriangle.angleA());
		System.out.println(myTriangle.angleB());
		System.out.println(myTriangle.angleC());
	
		
		

	}
}