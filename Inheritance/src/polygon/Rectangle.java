package polygon;

public class Rectangle extends Polygon {
 private double length;
 private double width;
 
 
 
 public Rectangle(double myLength, double myWidth) {
	 super(4, "Rectangle");
	 length = myLength;
	 width = myWidth;
 }



public double getLength() {
	return length;
}



public void setLength(double length) {
	this.length = length;
}



public double getWidth() {
	return width;
}



public void setWidth(double width) {
	this.width = width;
}



public double getArea() {
	return this.length*this.width;
}
public double getPerimeter() {
	return (this.length*2)+(this.width*2);
}
 
 
 
}
