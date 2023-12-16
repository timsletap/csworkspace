
public class Rabbit {
	private int newbornPairs;
	private int olderPairs;
	
	
	
	public Rabbit() {
		newbornPairs = 1;
		olderPairs = 0;
	}
	
	public int getNewbornPairs() {
		return newbornPairs;
	}

	public void setNewbornPairs(int newbornPairs) {
		this.newbornPairs = newbornPairs;
	}

	public int getOlderPairs() {
		return olderPairs;
	}

	public void setOlderPairs(int olderPairs) {
		this.olderPairs = olderPairs;
	}

	public int getPairs() {
		return newbornPairs+olderPairs;
	}
	
	public void waitAMonth() {
		int prev = newbornPairs;
		newbornPairs = olderPairs;
		olderPairs += prev;
		
		
	}
	public static void main(String[] args) {
		Rabbit one = new Rabbit();
		for(int i = 0;  i < 25; i++) {
			one.waitAMonth();
			System.out.println("Total Pairs: "+one.getPairs());

		}
		
		
		
		}
	}


