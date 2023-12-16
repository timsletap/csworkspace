import java.util.ArrayList;

public class LabClass {

    private String instructor;
    private String room;
    private String timeAndDay;
    private ArrayList<Student> students;
    /**
     * Create a LabClass with default values.
     */
    public LabClass()
    {
        instructor = "Connolly";
        room = "119";
        timeAndDay = "Monday, 8:40am";
        students = new ArrayList<Student>();
       
    } 
    public LabClass(String instructor, String room, String timeAndDay)
    {
        this.instructor = instructor;
        this.room = room;
        this.timeAndDay = timeAndDay;
        students = new ArrayList<Student>();
       
    } 
    
    public void printList() {
    	System.out.println("Instructor: "+ instructor);
    	System.out.println("Room: " + room);
    	System.out.println("Day and Time: "+ timeAndDay);
    	System.out.println("Class List: ");
    	
    	for(int i = 0; i < students.size();i++) {
    		System.out.println(students.get(i).toString());
    	}
    	System.out.println("Number of Students: "+this.numberOfStudents());
    }
    public void remove(String id) {
    	for(int i = 0; i < students.size(); i++) {
    		if(students.get(i).getStudentID().equalsIgnoreCase(id)) {
    			students.remove(i);
    		}
    	}
    	
    }
    public Student search(String lookForID) {
    	for(int i = 0; i < students.size(); i++) {
    		if(students.get(i).getStudentID().equalsIgnoreCase(lookForID)) {
    			return students.get(i);
    		}
    	}
    	return null;
    }
    public void enrolStudent(Student student) {
    	int index = 0;
		for (int i = 0; i < students.size(); i++) {
			if (student.getStudentID().compareTo(students.get(i).getStudentID()) > 0) {
				index++;
			}
		}
		students.add(index, student);
    	
    }
    public void setTime(String time) {
    	this.timeAndDay = time;
    	
    }
    public void setRoom(String room) {
    	this.room = room;
    	
    }
    public void setInstructor(String instructor) {
    	this.instructor = instructor;
    	
    }
    public int numberOfStudents() {
    	return students.size();
    }
    public double averageCredits() {
    	double avg = 0;
    	for(int i = 0; i < students.size(); i++) {
    		avg += students.get(i).getCredits();
    	}
    	return avg / students.size();
    }
    public Student maxCredits() {
    	Student max = students.get(0);
    	for(int i = 0; i < students.size(); i++) {
    		if(students.get(i).getCredits() > max.getCredits()) {
    			max = students.get(i);
    		}
    	}
    	return max;
    }
    public ArrayList<Student> underList(int cred){
    	ArrayList<Student> unders = new ArrayList<Student>();
    	for(int i = 0; i < students.size(); i++) {
    		if(students.get(i).getCredits() < cred) {
    			unders.add(students.get(i));
    		}
    	}
    	return unders;
    	
    }
public static void main(String[] args)  {    
      LabClass myClass= new LabClass() ;
      myClass.setInstructor("CONNOLLY");
      myClass.setRoom("119");
       myClass.setTime("4:50");
      myClass.enrolStudent(new Student("Tom Thumb", "7999"));
      myClass.enrolStudent(new Student("Jane Dole", "3333"));
      myClass.enrolStudent(new Student("John Garcia", "2315"));
      myClass.enrolStudent(new Student("Pedro Martinez", "4599"));
      myClass.enrolStudent(new Student("Reese Witherspoon", "1234"));
      myClass.enrolStudent(new Student("Grace Hopper", "5555"));
      
      Student a = (Student) myClass.search("3333");
       a.addCredits(15);
       Student b = (Student) myClass.search("4599");
       b.addCredits(100);
      myClass.remove("2315");
      myClass.printList();
}


}
