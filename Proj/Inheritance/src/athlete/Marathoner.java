package athlete;

public class Marathoner extends Runner{

	
	public Marathoner(String fname, String lname) {
		super(fname, lname);
	}
	
	public void race(double raceLength) {
		if(raceLength >= 10) {
			super.race(raceLength);
		} else {
			double trainingTime = 8.5 *  raceLength/60;
			train(trainingTime);
		}
		
	}
	
	public static void main(String[] args) {
		Marathoner a = new Marathoner("Nikhil", "Parchuri");
		a.train(20);
		a.race(5);
		a. race(10);
		a. race(20);
		System.out.println(a);
	}
	
	
	
}
