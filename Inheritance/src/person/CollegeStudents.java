package person;

public class CollegeStudents extends Student {
 static final int FRESH = 1;
 static final int SOPH = 2;
 static final int JUNIOR = 3;
 static final int SENIOR = 4;
 private int year;
 private String major;
 
 public CollegeStudents(String name, int age, String major, int year, String idNum, double gpa) {
	 super(name, age, idNum, gpa);
	 this.year = year;
	 this.major = major;
 }
 
 public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}

public String toString() {
	return super.toString() + "/nYear: " + year + "/n Major:"+major;
}

public static void main(String[] args) {
	
}

 
}
