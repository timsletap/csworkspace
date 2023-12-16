import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Data {
	private int[] myData = new int[1000];
	  private int myHowMany;

	  public Data(String fileName)
	  {
	    myHowMany = 0;
	    loadFile(fileName);
	  }
	  public void loadFile (String fileName)
	  /* Loads text file numbers.txt into vector data.  Values are stored from
	  positions 0..howMany-1.  Returns the number of data as howMany */
	  {
		  int index = 0;
	        File file = new File(fileName);
	        try { 
	        	Scanner inFile = new Scanner(file);
	       
	        	while (inFile.hasNext()) 
	        	{         
	        		myData[index] = inFile.nextInt(); 
	        		index++;
				myHowMany++;
				
	        	}
	        } 
	        catch (FileNotFoundException e) {        
	        //e.printStackTrace(); 
	        System.out.println("File is in the wrong directory");
	}
	  }
	  public double average ()
	  // returns average of values in vector data
	  {
		  double avg = 0;
		  for(int i = 0; i < myData.length; i++) {
			  avg+=myData[i];
		  }
		  avg/=myHowMany;
	    return avg;
	  }

	  public double stdDev ()
	   // finds standard deviation of values in vector data
	  {
		  double sumSquares = 0;
		  double avg = this.average();
		  for(int i = 0; i < myData.length-1; i++) {
			  sumSquares += Math.pow(myData[i]-avg, 2);
		  }
		  
		  return Math.sqrt(sumSquares/(myHowMany-1));
	  }
	  private int findLargest (int[] numbers)
	  {
		  int num = numbers[0];
		  for(int i = 1; i < numbers.length;i++) {
			  num = Math.max(num, numbers[i]);
		  }
		  return num;
	  }
	  public void findMode ()
	  /* The vector data is analyzed and transferred into a smaller vector
	    smallList (0..100).  For each occurrence of n in vector data,
	    smallList[n] is incremented +1.  function Largest is then called
	    to find the largest quantity in vector smallList.  The mode(s)
	    is/are printed out. */
	  {
	  System.out.print("The mode is -->  ");
	  int[] tally = new int[findLargest(this.myData)+1];
	  for(int i = 0;i < myData.length;i++) {
		 tally[myData[i]]++;
	  }
	  int mode = findLargest(tally);
	  for(int i = 1; i < tally.length; i++) {
		  if(tally[i] == mode) {
		  System.out.print(i + "  ");
		  }
	  }

	  }
	
	

public static void main (String[] args)
	  {
	    Data fileStats = new Data("numbers.txt");
	    //fileStats.display();
	   System.out.println("Average: " +fileStats.average());
	   System.out.println("Standard Deviation: " +(fileStats.stdDev()));
	   fileStats.findMode();
	  
	  }
	  
	  //Average: 49.92292292292292
	  //Standard Deviation: 29.445970784743658
	  //The mode is(are) --> 10   48   
	}
