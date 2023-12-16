
public class RoachPopulation {
	private int population;

	public RoachPopulation(int population) {
		this.population = population;
	}
	public RoachPopulation() {
		this.population = 0;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public void breed() {
		population*=2;
	}
	public void spray() {
		population -= (population*0.1);
	}
	public String toString() {
		return "Roach Population: "+population;
	}
	

}
