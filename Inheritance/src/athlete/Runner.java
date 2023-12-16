package athlete;

public class Runner extends Athlete{
private double milesRaced;
private int numberOfRaces;


	public Runner(String fname, String lname) {
		super(fname, lname,"Running");
		milesRaced  =0;
		numberOfRaces= 0; 
	}


	public double getMilesRaced() {
		return milesRaced;
	}


	public void setMilesRaced(double milesRaced) {
		this.milesRaced = milesRaced;
	}


	public int getNumberOfRaces() {
		return numberOfRaces;
	}


	public void setNumberOfRaces(int numberOfRaces) {
		this.numberOfRaces = numberOfRaces;
	}
	
	public void race( double raceLength) {
		numberOfRaces++;
		milesRaced += raceLength;
	}
	
	public String toString() {
		return super.toString()  + " " + milesRaced + " " + numberOfRaces;
	}
	
	public static void main(String[] args) {
		Runner a = new Runner("Oscar", "Lee");
		a.race(55);
		a.train(4);
		System.out.println(a.toString());
	}
}
