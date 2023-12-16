
public class Rectangle {
	
	
	private int length;
	private int width;
	private String position;
	
	public Rectangle() {
		this.length = 0;
		this.width = 0;
		this.position = "";
	}
	public Rectangle(int length, int width, String position) {
		this.length = length;
		this.width = width;
		this.position = position;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getPosition() {
		return position;
	}
	public void translate(String position) {
		this.position = position;
	}
	public int getArea() {
		return length*width;
	}
	public int getPerimeter() {
		return (length*2)+(width*2);
	}
	public void doubleLengthAndWidth() {
		length *= 2;
		width*=2;
	}
	public void rotate() {
	int temp = width;
	 width = length;
	 length = temp;
	}
	public String toString() {
		return "Length: "+length+"\nWidth: "+width+"\nPosition: "+position+"\nArea: "+this.getArea()+"\nPerimeter: "+this.getPerimeter();
	}
	public static void main(String[] args) {
		Rectangle one = new Rectangle(3,5, "(10,10)");
		System.out.println(one);
		one.doubleLengthAndWidth();
		one.translate("(5,7)");
		one.rotate();
		System.out.println();
		System.out.println(one);
	}
	
	

}
