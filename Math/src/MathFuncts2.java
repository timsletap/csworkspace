import java.awt.Color;
public class MathFuncts2 {
// This method finds the average of q1,q2,q3
public static double average(int q1, int q2, int q3) {
	return (q1+q2+q3)/3.0;
}
// This method converts an inputed Celsius temperature
// into fahrenheit temperature
// F = 9/5 C +32
public static double convertToFar(int celsTemp) {
	return 9.0/5 *celsTemp + 32;

}

// This method will return the max number of quarters needed
// to correctly make change
// howManyQuarters( .78 ) =======&gt; 3
public static int howManyQuarters(double change) {
	return (int)(change/0.25);
}
// This method rounds x to the tens place.
public static int roundToTensPlace(double x) {
	return (int)Math.round(x/10)*10;
}
// This method will find the minimum value of 3 integers
public static double findMin(int a, int b, int c) {
	return Math.min(Math.min(a, b), c);
}
// This method returns the thousandth digit
// whatIsTheThousandthDigit(123.456789) ===========&gt; 6
public static int whatIsTheThousandthDigit(double number) {
	return (int)Math.round(number*100)%10;
}

// This method will return a random color
public static Color randColor() {
	int a = (int)(Math.random() * 256);
	int b = (int)(Math.random() * 256);
	int c = (int)(Math.random() * 256);
	Color one = new Color(a,b,c);
	return one;
}

// This method will return the total value of a coin bank
// We round to 2 decimals to avoid roundoff errors
public static double total(int pennies, int nickels, int dimes, int quarters) {
	double x = (pennies*0.01)+(nickels*0.05)+(dimes*0.10)+(quarters*0.25);
	return x;
}
// This method will return the midpoint of segment with endpoints (x1,y1)
// and (x2,y2)
// The midpoint will be returned at a String)
public static String segmentMidPoint(int x1, int y1, int x2, int y2) {
	double midx = (double)(x2+x1)/2;
	double midy = (double)(y2+y1)/2;
	return "( "+midx+" , "+midy+" )";
}

// This method will return the slope of a line through points (x1,y1) and
// (x2,y2)
public static double slope(int x1, int y1, int x2, int y2) {
	return ((double)(y2-y1)/(x2-x1));
}

// This method will return the length of the segment with endpoints (x1,y1)
// and (x2,y2)
public static double getLength(int x1, int y1, int x2, int y2) {
	return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
}

// This method will return hundreds digit of a number
// assume number is greater than 100
// whatIsTheHundredDigit( 1234.567 )=======&gt; 2
public static int whatIsTheHundredDigit(double number) {
	return (int)Math.round(number/100)%10;
}

// This method will return the volume of a sphere with given radius
// V = 4/3PIr3
public static double sphereVolume(int radius) {
    return 4/3.0*Math.PI*Math.pow(radius, 3);
}
// This method will round x to the nearest thousandthPlace
// roundToThousandthPlace(12.9756) =======&gt; 12.976
public static double roundToThousandthPlace(double x) {
	return (double)Math.round(x*1000)/1000;
}
public static void main(String[] args) {
    System.out.println("1.Average: " + MathFuncts2.average(2,4, 5));
    System.out.println("2. Temperature: " +convertToFar(31));
    System.out.println("3. Quarters: " +howManyQuarters(2.27));
    System.out.println("4. Round to Tens: " +roundToTensPlace(12345.678));
    System.out.println("5. Find Min: " + findMin(3,8,-5));
    System.out.println("6. Thousandth Digit: " + whatIsTheThousandthDigit(123.4567));
    System.out.println("7. Random Color: " + randColor());
    System.out.println("8. Total Money: $" + total(4,3,6,12));
    System.out.println("9. Midpoint: " + segmentMidPoint(3,4,6,12));
    System.out.println("10. Slope: " + slope(3,4,7,11));
    System.out.println("11. Length: " + getLength(3,4,7,12));
    System.out.println("12. Hundred Digit : " + whatIsTheHundredDigit(1123.456));
    System.out.println("13. Sphere Volume : " + sphereVolume(5));
    System.out.println("14. Round to thousandth: " + roundToThousandthPlace(123.4561));

}}