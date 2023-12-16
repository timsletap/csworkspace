public class Balloon {
       private double vol;
     


 public Balloon(double vol ) {
		this.vol = vol;
	}
 
 public Balloon() {
		this.vol = 0;
	}

public void addAir(double amount) {
	this.vol+=amount;
}

 public double getVolume() {
	 return vol;
 }

 public double getRadius() {
	 return Math.cbrt((vol*3.0/4)/Math.PI);
 }

 public double getSurfaceArea() {
	 return 4*Math.PI*Math.pow(this.getRadius(), 2);
 }
 
 public static void main(String[] args) {
	 Balloon b = new Balloon();
	 b.addAir(100);
	 System.out.println(b.getVolume());
	 System.out.println(b.getRadius());
	 System.out.println(b.getSurfaceArea());
	 b.addAir(100);
	 System.out.println(b.getVolume());
	 System.out.println(b.getRadius());
	 System.out.println(b.getSurfaceArea());
	 
 }
}