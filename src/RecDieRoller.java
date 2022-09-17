/**
 * This class represents a six-sided die that can be rolled.
 * @author chessicanation 
 * CS215
 * Assignment 3.1
 */

import java.util.Random;

public class RecDieRoller 
{
	private int counter;
	
	/**
	 * Empty-argument constructor
	 */
	public RecDieRoller() 
	{
		counter = 0;
	}//end empty-argument constructor

	/**
	 * This method uses a Random number generator to simulate the roll of a dice.
	 * The method prints out the number rolled and increments the counter, which tracks
	 * the total number of rolls. If the number is not a 2, the method calls itself
	 * recursively to roll again until it gets a 2. The method will also call itself
	 * recursively to run as many times as the parameter that is passed in. 
	 * @param numRolls
	 */
	public void roll(int numRolls)
	{
		Random rand = new Random();
		int number = rand.nextInt(6) + 1;

		System.out.println(number);

		counter++;
		
		if(number != 2)
		{
			roll(1);

		}//end if

		if(numRolls>1)
		{
			roll(numRolls-1);
			
		}//end if
		
	}//end roll
	
	/**
	 * This method displays the stats of the roll method, including the total number of rolls, 
	 * the number of times the roll method was called (the parameter passed in), and the mean number 
	 * of rolls needed to land on a 2.
	 * @param runs
	 */
	public void displayStats(int runs)
	{
		System.out.println("The total number of rolls it took to land on a 2 was: " + counter + "\nThe total "
				+ "number of times the roll method was called: " + runs + "\nThe mean number of die "
				+ "rolls it took to land on a 2 is: " + (counter/runs)); 
	}//end displayStats

	/**
	 * Getter for counter
	 * @return
	 */
	public int getCounter() 
	{
		return counter;
	
	}//end getCounter

	/**
	 * Setter for counter
	 * @param counter
	 */
	public void setCounter(int counter) 
	{
		this.counter = counter;
	
	}//end setCounter
	
}//end class
