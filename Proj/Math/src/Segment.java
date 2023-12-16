
public class Segment {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public Segment() {
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
			
	}
	public Segment(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public double getLength() {
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
	public double getSlope() {
		return ((double)(y2-y1)/(double)(x2-x1));
	}
	public String getMidpoint() {
		double midx = (double)(x2+x1)/2;
		double midy = (double)(y2+y1)/2;
		return "( "+midx+" , "+midy+" )";
	}
	public String toString() {
		return "Segment with endpoints ("+x1+","+y1+") and ("+x2+","+y2+")";
	}
	public static void main(String[] args) {
		Segment one = new Segment(-11,2,3,3);
		System.out.println(one);
		System.out.println("Slope: " + one.getSlope());
		System.out.println();
		System.out.println("Midpoint: " + one.getMidpoint());
		System.out.println();
		System.out.println("Length: " + one.getLength());
		}


}
