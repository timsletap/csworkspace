package polygon;

public  abstract class Polygon
{
    //An abstract class is a class with
    //abstract methods.
    private int sides;
    private String  type;
   
    public Polygon()
    {
        sides = 3;
        type = "Triangle";
    }
      public Polygon(int mySides, String myType )
    {
        sides = mySides;
        type = myType;
    }
   
    public int getSides()
    {
       
        return sides;
    }
   
      public String getType()
    {
       
        return type;
    }
      public void setType(String newType)
      {
          type = newType;
      }
    public String toString()
    {
        return "\nPOLYGON: " + getType() + "\nSIDES: " + getSides()+
                        "\nPERIMETER: " + getPerimeter() +
                                "\nAREA: " + getArea();
    }
   
   
    //abstract methods have no implementation.  
    //Subclasses must implement these methods
    abstract double getPerimeter();
    abstract double getArea();
   
 
   
   
   
   
   
    public static void main (String []args)
    {
    //Abstract classes cannot be instantiated  ERROR
    //Polygon a = new Polygon(4,"rectangle");
    // System.out.println(a);
    }
}
