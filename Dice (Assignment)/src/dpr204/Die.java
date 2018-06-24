package dpr204;
/**
 * Directions:  Fill in the body of the Die class.
 * The class should have one or more constructors including a constructor 
 * that takes no parameters.
 * 
 * The class should have these methods specified by their signatures:
 *   public void roll() // roll the die object so that it's face value is changed to a random valid value.
 *   public int getFaceValue()  // get the face value of the die object.
 *   public void setFaceValue(int val)  // set the face value of the die object.
 *   
 * JUnit test is TestDie.java.  Right click on the file and Run As => JUnit Test.
 * 
 */
public class Die{
	int faces = 6;
	int faceNum = 0;
	/*
	 * Constructor sets the initial face value.
	 */
	public Die() {
		roll();
	}
		
	/**
	 * Roll the die by assigning a random value to the face value.
	 */
	public void roll() {
		faceNum = (int) (Math.random()*faces)+1;
	}
		
	/**
	 * Set the face value of the die.  This is like picking up a
	 * physical die and setting it down so that parametric face
	 * value is on top.
	 * @param value to set the face to.
	 * @return 
	 */
	public void setFaceValue(int value) {
		faceNum = value;
	}

	/**
	 * Get the current face value of the die.
	 * @return current face value
	 */
	public int getFaceValue() {
		return faceNum;
	}

	/**
	 * Every custom class should have a toString method that returns 
	 * a readable representation of the object as a string for printing.
	 * @return string representing this die.
	 */
}
