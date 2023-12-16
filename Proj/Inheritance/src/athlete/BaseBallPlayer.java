package athlete;

public class BaseBallPlayer extends Athlete 
{	// There are only 2 instance variables in this class
	   private double  gamesPlayed; 
	   private String position;
	

//constructor.  Set gamesPlayed to 0  Include Signature line.
public BaseBallPlayer(String fname, String lname, String position){
	super(fname,lname, "Baseball");
	gamesPlayed = 0;
	this.position = position;
	
	
}









//This method changes gamesPlayed based on parameter inningsPerWeek(9 innings = 1 game) 
//and calculates training time. 
 // adds 2 hour of training time if you are a pitcher for every game and 4 hours of training
 //time for all other positions for every game

    public void countGames(int inningsPerWeek)	   
{
	gamesPlayed = inningsPerWeek/9.0;
	
	if(position.equalsIgnoreCase("Pitcher")) {
		train(2*gamesPlayed);
	} else {
		train(4*gamesPlayed);
	}


	   }

//This method returns  gamesPlayed 
	 public double getGamesPlayed()
  
{
	      return gamesPlayed;
	




  } 
  
public String getPosition()
	     
	//This method returns  position 
      	  
	{


return position;


	}
// toString method 
	public String toString () {
		return super.toString() + " Games Played: "+ gamesPlayed + " Position: "+ position;


	}


public static void main (String[]args)
{
BaseBallPlayer d = new BaseBallPlayer("Noah", "Syndergaard", "pitcher");
d.countGames(120);
System.out.println(d);  

BaseBallPlayer e = new BaseBallPlayer("David", "Wright", " 3rd base");
e.countGames(120);
System.out.println(e);
}}


/*Hello, Noah Syndergaard your sport is Baseball and you trained 26.666666666666668 hours.  Your position is 
pitcher, and you played 13.333333333333334 games.
Hello, David Wright your sport is Baseball and you trained 53.333333333333336 hours.  Your position is 
 3rd base, and you played 13.333333333333334 games.
*/

