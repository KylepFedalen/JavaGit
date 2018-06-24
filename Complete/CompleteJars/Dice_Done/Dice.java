package dpr204;
/**
 * Directions:  Fill in the body of the Dice class.
 * The class should have one or more constructors including a constructor 
 * that takes no parameters.  This constructor should create a pair of die objects.
 * 
 * The class should have these methods specified by their signatures:
 *   public void roll() // roll the die objects of the dice object.
 *   public int [] getFaces()  // get the face values of all of the die objects.
 * 
 */
public class Dice {
	int totalDice = 2;
	
	private int d1;
	private int d2;
	
	public Dice() {	
		Die dice1 = new Die();
		Die dice2 = new Die();
		
		d1 = dice1.getFaceValue();
		d2 = dice2.getFaceValue();
		
	}
	
	public void roll() {		

		d1 = (int) (Math.random()*6)+1;
		d2 = (int) (Math.random()*6)+1;
	}
	
	public int [] getFaceValues() {	
		int[] faceValues = new int[totalDice];
		faceValues[0] = d1;
		faceValues[1] = d2;
		return faceValues;
	}


}
