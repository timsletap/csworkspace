
public class Auto {
	private int yearModel;
	private int speed;
	private String make;
	
	public Auto(int yearModel,String make) {
		this.yearModel = yearModel;
		this.speed = 0;
		this.make = make;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public void accelerate() {
		speed+=5;
	}
	public void brake() {
		speed-=5;
	}
	 public String toString() {
         return "Car Model Year: "+yearModel+" \nCar Manufacturer: "+make+ "\n Car Speed: "+speed;
	 }

	public static void main(String[] args) {
		Auto car1 = new Auto(1997, "Honda");
		car1.accelerate();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.accelerate();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.accelerate();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.accelerate();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.accelerate();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.brake();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.brake();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.brake();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.brake();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		car1.brake();
		System.out.println("Current Car Speed: "+car1.getSpeed());
		
	}
	
	
	

}
