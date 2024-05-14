package Trees;
import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;


public class PhoneBook {
  private BinarySearchTree<PhoneEntry> book;
  private TreeSet<PhoneEntry> phoneSet = new TreeSet<PhoneEntry>(new NumberComparator());
  
  public PhoneBook()
    { 
        book = new BinarySearchTree<PhoneEntry>();
        load();
    }
   
    
//Add entry inOrder
public void add (PhoneEntry a) {
    book.insert(a);
    phoneSet.add(a);
}
  public void load() {
    File one = new File("Trees/phoneBST.txt");
    String name,number;  
 try{
  Scanner in = new Scanner (one);
  while (in.hasNext())
      {  
      name = (in.next());  
     number = (in.next());  
     PhoneEntry temp = new PhoneEntry(name, number);
      this.add(temp);
      phoneSet.add(temp);
     }
  }
      catch (Exception e)
      {System.out.println("File not found");}
  }
    
    
    public void display() {
    	book.inOrder();
    }
      
  //Returns phone number of  Name lookFor
    public String lookUp (String lookFor) {
        PhoneEntry temp = new PhoneEntry(lookFor, "000000");
        TreeNode<PhoneEntry> c = book.find(temp);
        if (c == null) {
            return "Could not locate";
        }
        return ((PhoneEntry)c.getValue()).getNum();
    }
    
    
  
//Returns the Name given phoneNumber  lookFor
  public String reverseLookUp (String lookFor) {
       return reverseLookUp(book.getRoot(),lookFor);
    }
    private String reverseLookUp(TreeNode<PhoneEntry> temp, String lookFor){
        if (temp == null) {
            return "Not found";
        }
        String result = reverseLookUp(temp.getLeft(), lookFor);
        if (!result.equals("Not found")) {
            return result;  
        }
        PhoneEntry entry = (PhoneEntry) temp.getValue();
        if (entry.getNum().equals(lookFor)) {
            return entry.getName(); 
        }
        return reverseLookUp(temp.getRight(), lookFor); 
    }

    public boolean changeNumber( String lookForName, String newNumb) {
        String current = lookUp(lookForName);
        TreeNode<PhoneEntry> t = book.find(new PhoneEntry(lookForName, current));
        PhoneEntry temp = (PhoneEntry) t.getValue();
        if(t != null){
            phoneSet.remove(temp);
            temp.setNum(newNumb);
            phoneSet.add(temp);
            return true;
        } 
        return false;
        
       
    }
    //Displays a list of PhoneEntries Ordered by Phone Number
    public void DisplayEntriesInNumberInOrder() {
        System.out.println(phoneSet);
    }


public static void main(String[] args){
PhoneBook yellow = new PhoneBook();
yellow.display();
System.out.println(yellow.lookUp("Connolly"));
System.out.println(yellow.lookUp("Alvarez"));
System.out.println(yellow.reverseLookUp("9810521"));
System.out.println(yellow.reverseLookUp("98404"));
yellow.DisplayEntriesInNumberInOrder();
yellow.changeNumber("Alvarez", "9999999");
System.out.println(yellow.lookUp("Alvarez"));





}
}





