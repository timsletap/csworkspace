
public class IceCreamCone {
	
	private double height;
	private double radius;
	
	public IceCreamCone(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	public IceCreamCone() {
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
		return (1.0/3.0)*Math.PI*(radius*radius)*height;
	}
	public double getSurfaceArea() {
		return Math.PI  *radius*(Math.sqrt(Math.pow(radius, 2)+Math.pow(height, 2)));
	}
	public String toString() {
		return "Height: "+height+"\nRadius: "+radius+"\nVolume: "+getVolume()+"\nSurface Area: "+getSurfaceArea();
	}
	public static void main(String[] args) {
		IceCreamCone one = new IceCreamCone(14.2, 13.6);
		System.out.println(one);
	}
	
	

}
