
public class RoachesSimulation {
	public static void main(String[] args) {
		RoachPopulation one = new RoachPopulation(10);
		one.breed();
		one.spray();
		System.out.println("Roach Population: "+one.getPopulation());
		one.breed();
		one.spray();
		System.out.println("Roach Population: "+one.getPopulation());
		one.breed();
		one.spray();
		System.out.println("Roach Population: "+one.getPopulation());
		one.breed();
		one.spray();
		System.out.println("Roach Population: "+one.getPopulation());
	}

}
