package dpr204;
/**
 * Directions: Pitcher class represents the abstraction of a water pitcher.
 * A water pitcher is characterized by its CAPACITY and current OUNCES (these are int values).
 * 
 * The capacity should be set by the constructor.  It should never change.
 * 
 * The amount should be accurately maintained by the pitcher operations.
 * The pitcher operations are:
 *   fill() // fills the pitcher to its capacity.
 *   empty() // sets the current ounces to zero (empties the pitcher)
 *   transfer(Pitcher p2)  // transfer from the source pitcher to the destination pitcher w/o spilling.
 *                         // the invoking object is the source pitcher,
 *                         // the p2 pitcher is the destination pitcher.
 *   getCapacity() // returns the capacity of the pitcher.
 *   getOunces()   // returns the amount in the pitcher.  
 *   
 * Write code for each of these operations.  It's okay to use the logic from MainNoObjects, but you will
 * have to make some modifications.
 */
public class Pitcher {
	
	private int capacity;
	private int ounces;
	
	public Pitcher(int cap){
		capacity = cap;
	}
	public void fill(){
		ounces = capacity;
	}
	public void empty(){
		ounces = 0;
	}
	public void transfer(Pitcher p2){
			if(p2.capacity == 8){
				int addP8 = Math.min(8 - p2.getOunces(), ounces);
				p2.ounces = p2.getOunces() + addP8;
				ounces = ounces - addP8;
			}
			if(p2.capacity == 5){
				int addP5 = Math.min(5 - p2.getOunces(), ounces);
				p2.ounces = p2.getOunces() + addP5;
				ounces = ounces - addP5;
			}
	}
	public int getCapacity(){
		return capacity;
	}
	public int getOunces(){
		return ounces;
	}
}
