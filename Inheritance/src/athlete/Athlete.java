package athlete;


public class Athlete
{
private String firstName;
private String lastName;
private String sport;
private double hoursTraining;
/**
Constructs an athlete with a specified name and sport;
hoursTraining is initialized to 0.
@param fname first name of athlete
@param lname last name of athlete
@param sportPlayed sport in which athlete participates
*/
public Athlete(String fname, String lname, String sportPlayed)
{
firstName = fname;
lastName = lname;
sport = sportPlayed;
hoursTraining = 0;
}

public String toString ()
{
return this.getName() + " Sport: "+ this.getSport() + " Hours Trained: " + this.getHoursTraining();
}
/**
Updates hours of training and is specific about type of training.
@param hours number of hours athlete trained
*/
public void train(double hours)
{
hoursTraining += hours;
}
/**
gets athlete name
@return name of athlete
*/
public String getName()
{
    return (firstName + " " + lastName);
}
/**
gets sport of athlete
@return sport participated in
*/  
public String getSport()
{
	return sport;
}
/**
gets hours trained by athlete
@return hoursTraining
*/
public double getHoursTraining()
{
	return hoursTraining;
}
}