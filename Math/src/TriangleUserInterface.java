import java.util.Scanner;
public class TriangleUserInterface {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3;
		
		System.out.println("Please enter the x-coordinate for point A of the triangle: ");
		x1 = input.nextDouble();
		System.out.println("Please enter the y-coordinate for point A of the triangle: ");
		y1 = input.nextDouble();
		System.out.println("Please enter the x-coordinate for point B of the triangle: ");
		x2 = input.nextDouble();
		System.out.println("Please enter the y-coordinate for point B of the triangle: ");
		y2 = input.nextDouble();
		System.out.println("Please enter the x-coordinate for point C of the triangle: ");
		x3= input.nextDouble();
		System.out.println("Please enter the y-coordinate for point C of the triangle: ");
		y3= input.nextDouble();
		
		Point A = new Point(x1,y1);
		Point B = new Point(x2, y2);
		Point C = new Point(x3, y3);
		
		Triangle t = new Triangle(A,B,C);
		System.out.println("Triangle: ");
		System.out.println(t);
		System.out.println("Side A: "+t.sideA());
		System.out.println("Side B: "+t.sideB());
		System.out.println("Side C: "+t.sideC());
		System.out.println("Area: "+t.area());
		System.out.println("Perimeter: "+t.perimeter());
		System.out.println("Angle A: "+t.angleA());
		System.out.println("Angle B: "+t.angleB());
		System.out.println("Angle C: "+t.angleC());
		System.out.println("Centroid: "+t.centroid());
		
		

		

	}

}
