
public class DataSet {
	private int count;
	private int sum;
	private int smallest;
	private int largest;
	
	public DataSet() {
		count = 0;
		sum = 0;
		largest = Integer.MIN_VALUE;
		smallest = Integer.MAX_VALUE;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getSmallest() {
		return smallest;
	}

	public void setSmallest(int smallest) {
		this.smallest = smallest;
	}

	public int getLargest() {
		return largest;
	}

	public void setLargest(int largest) {
		this.largest = largest;
	}

	public void addValue(int x) {
		count++;
		sum+=x;
		largest = Math.max(largest, x);
		smallest = Math.min(smallest, x);
	}
	public double getAverage() {
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		DataSet sp = new DataSet();
		sp.addValue(5);
		sp.addValue(7);
		sp.addValue(3);
		sp.addValue(11);
		System.out.println("Average: "+sp.getAverage());
		System.out.println("Largest: "+sp.getLargest());
		System.out.println("Smallest: "+sp.getSmallest());

	}


}
