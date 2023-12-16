package person;
/**
 * L.A.14.1
 *
 * The root of the Person hierarchy.  All persons have
 * a name and an age and a gender
 */

class Person
{
  private String myName ;   // name of the person
  private int myAge;        // person's age
 

  // constructor
  public Person(String name, int age){
    myName = name;
    myAge = age;
    
  }

  

public String getName()
  {
    return myName;
  }

  public int getAge()
  {
    return myAge;
  }



  public void setName(String name)
  {
    myName = name;
  }

  public void setAge(int age)
  {
    myAge = age;
  }



  public String toString()
  {
    return myName + ", age: " + myAge + ", gender: ";
  }
  



  public static void main (String args[])
  {
    Person bob = new Person("Coach Bob", 27);


	System.out.println(bob);  
  }

  
}