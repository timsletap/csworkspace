import java.util.PriorityQueue;

/**
 * Write a description of class Patient here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student implements Comparable<Student>{
	// instance variables - replace the example below with your own
	private String name;
	private int grade;
    private int order;
    private static int count;
	
	/**
	 * Constructor for objects of class Patient
	 */
	public Student(String newName, int newPri) {
		name = newName;
        grade = newPri;
        order = ++count;
	}

	public int getGrade() {
		return grade;
	}

	String getName() {
		return name;
	}

    public int getOrder(){
        return order;
    }

	public String toString() {
		return name + " " + grade; 
	}

    @Override
            public int compareTo(Student o) {
                if(grade == o.grade){
                    return this.order - o.grade;
                } else {
                    return (o.grade - this.grade);
                }
            }
            

	//THIS USES BUILT IN PRIORITY QUEUE
			 public static void main(String[] args)
		      {
			 PriorityQueue<Student> pq = new PriorityQueue<Student>();
		      pq.add( new Student("Smith",11));
		      pq.add(new Student("Chen",10));
		      pq.add(new Student("Jones",11));
		      pq.add(new Student("Wong",12));
		      pq.add(new Student("Gupta",12));
		      pq.add(new Student("Garcia",9));
		      pq.add(new Student("Brown",9));
		      pq.add(new Student("Sharma",12));
		      pq.add(new Student("Case",12));
		      pq.add(new Student("Connolly",9));
		      pq.add(new Student("Ye",9));
		      System.out.println("The list is");
		     System.out.println(pq);  
		      while(pq.size()>0) {
		      System.out.println("The queue in order by  Upperclassmen");
		     System.out.println(pq.remove());
		      }
		    // System.out.println( pq.getNaturalOrder());
		}


}