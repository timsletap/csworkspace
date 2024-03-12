package Sets.SAT;

public class SatStudent implements Comparable<SatStudent>{
    
    public String name;
    public int math;
    public int verbal;
    public int writing;
 

    /**
     * Constructor for objects of class SATStudent
     */
    public SatStudent()  {
        this("Connolly", 670,680,700);
    }
    
    public SatStudent(String myName, int myMath,int myVerbal, int myWriting)
    {
       name=myName;
       math=myMath;
       verbal=myVerbal;
       writing = myWriting;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getName()
    
    {
            return name;
        }
    public int getMath()
    {
        return math;
    }

   
    public int total()
    {
        // put your code here
        return math+ verbal+writing;
    }
    
   
    public String toString()
    {
        
        return name+ ": " +  + total();
    }

    public int compareTo(SatStudent o) {
        if(o.total() == this.total()){
            return this.getName().compareTo(o.getName());
        }
       return o.total() - this.total();
    }
}
