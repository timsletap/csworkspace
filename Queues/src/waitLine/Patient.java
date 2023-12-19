package src.waitLine;
import java.sql.Timestamp;

public class Patient {
	String name;
	long enterTime;
	long exitTime;
	
	public Patient(String name) {
		this.name = name;
		enterTime = System.currentTimeMillis();
		exitTime=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(long enterTime) {
		this.enterTime = enterTime;
	}

	public long getExitTime() {
		return exitTime;
	}

	public void setExitTime(long exitTime) {
		this.exitTime = exitTime;
	}
	
	public long getWaitTime() {
		return (System.currentTimeMillis() - enterTime)/1000;
	}
	public long getTotalTime() {
		return exitTime - enterTime;
	}

	@Override
	public String toString() {
		return  name + " waitTime=" + getWaitTime() + " seconds";
	}
	
	public static void main(String[] args) {
		
		Patient tc = new Patient ("Connolly");
		
		try {
			Thread.currentThread().sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tc.getWaitTime());
		System.out.println(tc);
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp); 
	}

	

}