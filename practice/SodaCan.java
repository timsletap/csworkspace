
public class SodaCan {
	
	private double height;
	private double radius;
	
	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	public SodaCan() {
		this.height = 0;
		this.radius = 0;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getVolume() {
		return ((radius*radius)*Math.PI*height);
	}
	public double getSurfaceArea() {
		return (2*Math.PI*radius)*height + 2*(Math.PI*(radius*radius));
	}
	public String toString() {
		return "Height: "+height+"\nRadius: "+radius+"\nVolume: "+getVolume()+"\nSurface Area: "+getSurfaceArea();
	}
	public static void main(String[] args) {
		SodaCan one = new SodaCan(14.2, 13.6);
		System.out.println(one);
	}
	
	

}
