/**
 * This class contains a main method to test the RecDieRoller class.
 * @author chessicanation
 * CS215
 * Assignment 3.1
 *
 */
public class RecDieRollerDriver 
{

	public static void main(String[] args) 
	{
		RecDieRoller die = new RecDieRoller();
		
		die.roll(1000);	
		die.displayStats(1000);
		
	}//end main
	
}//end class
