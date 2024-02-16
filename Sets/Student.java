package Sets;

public class Student {
    private int myIdNum;    
    private String name;    
  
   
    public Student(String name, int i){
      
      myIdNum = i;
      this.name = name;
      
    }
  
    public int getIdNum()
    {
      return myIdNum;
    }
  
   
  
    public void setIdNum(int idNum)
    {
      myIdNum = idNum;
    }

    public String getName()
    {
      return name;
    }

    public int hashCode(){
        return (name.length() * 31) * myIdNum;

    }

    public boolean equals(Object ot){
        if(ot == null){
            return false;
        }
        if(getClass() != ot.getClass()){
            return false;
        } 
        Student other = (Student) ot;
        return myIdNum == other.getIdNum() && name.equals(other.getName());
    }
  
   
  
    public void setName(String name)
    {
      this.name = name;
    }
  
   
  
    public String toString()
    {
      return  "Name: "+ name + " ID Number: " + myIdNum + " ";
    }
    
    
    public static void main (String []args)
    {
    Student one = new Student ("Jon Shiao", 99999999);
    System.out.println(one);
    }
    
}
