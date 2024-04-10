package Maps.assignments;
import java.util.Set;
import java.util.TreeMap;

public class ZooRecords {
	private TreeMap<Integer, Set<String>> heightChart;  
    private HashMap<Integer, Set<String>> tempy;
			

	public ZooRecords( ) {    
        heightChart = new TreeMap<Integer, Set<String>>();
    }

	public void add(int height, String name)  { 
        heightChart.putIfAbsent(height, new TreeSet<String>());
        heightChart.get(height).add(name);
        
    }

	
	private int getTallestAnimal()   {  
        int max = 0;
        for(int h : heightChart.keySet()){
            if(h > max){
                max = h;
            }
        }
        return max;
}

	public  Set<String> getTallestAnimals()   {   
		return heightChart.get(this.getTallestAnimal());
    }

	public  Set<String> getSomeAnimals( int ht )   {     
        TreeSet<String> temp = new TreeSet<String>();
        for(int h : heightChart.keySet()){
            if(h > ht){
                temp.addAll(heightChart.get(h));
            }
        }
        return temp;
    } 
		
    

	public int getAnimalCount() {   
        int max = 0;
        for(int h : heightChart.keySet()){
            max += heightChart.get(h).size();
        }
        return max;
    }

    public static void main(String[] args){
        ZooRecords zoo = new ZooRecords();
        zoo.add(5, "Giraffe");
        zoo.add(2, "Lion");
        zoo.add(1, "Penguin");
        zoo.add(5, "Elephant");

        System.out.println("Total Animals: " + zoo.getAnimalCount());
        System.out.println("Tallest Animals: " + zoo.getTallestAnimals());
        System.out.println("Animals taller than 1 meter: " + zoo.getSomeAnimals(1));
     }
}




		


