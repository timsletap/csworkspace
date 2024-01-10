
import java.sql.Timestamp;


public class Patient {
	String name;
	int priority;
	
	public Patient(String name, int prior) {
		this.name = name;
		priority = prior;
	}
	public Patient(String name) {
		this.name = name;
		priority = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority(){
		return this.priority;
	}

	public void setPriority(int x){
		this.priority = x;
	}
	

	@Override
	public String toString() {
		return  name + " Priority:  " + this.getPriority() + " ";
	}
	
	public static void main(String[] args) {
		
		Patient tc = new Patient ("Connolly");
		
		try {
			Thread.currentThread();
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(tc);
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp); 
	}

	

}