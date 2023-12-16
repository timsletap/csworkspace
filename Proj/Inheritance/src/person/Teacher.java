package person;

public class Teacher extends Person {
	
	private double salary;
	private String subject;
	
	
	public Teacher(String name, int age, String subject, double salary) {
		super(name, age);
		this.subject = subject;
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}




	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String toString() {
		return "Teacher: "+this.getName()+"/nSubject: "+this.subject+"/nSalary: "+this.salary+"/nAge: "+this.getAge();
	}
	
}
