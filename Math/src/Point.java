
public class Point {
	
	private double x, y;
	
	/**
	 * Constructor for objects of class Point
	 */
	public Point() {
		x = 0;
		y = 0;
	}

	/**
	 * Constructor for objects of class Point with parameters
	 */
	public Point(double newX, double newY) {
		this.x = newX;
		this.y = newY;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	/**
	 * returns a string in the form '(x, y)'
	 */
	public String toString() {
		return "("+x+","+y+")";
	}

	public static void main(String[] args) {
		Point a = new Point(3, 6);
		System.out.println(a);
		Point b = new Point(-1, -7);
		System.out.println(b);
		
		
	}
}
