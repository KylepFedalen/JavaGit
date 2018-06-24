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
	
	
	public Dice() {	
		roll();	
	}
	
	
	public void roll() {
		getFaceValues();
		
	}
	public int newDie(){
		Die d1 = new Die();
		int newDie = d1.getFaceValue();
		return newDie;
	}
	public int [] getFaceValues() {
	
		int[] faceValues = new int[totalDice];
		for(int i = 0; i<totalDice; i++){
			faceValues[i] = newDie();;
		}
		
		return faceValues;
	}


}
