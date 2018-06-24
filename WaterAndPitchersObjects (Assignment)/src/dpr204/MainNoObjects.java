package dpr204;
/**
 * MainNoObjects is the solution to the water and pitchers puzzle when no objects/classes
 * are used.  X5 is the variable that represents the 5 ounce pitcher.
 * Y8 is the variable that represents the 8 ounce pitcher.
 * 
 * The static methods represent the operations that are allowed.
 *   fillX5() method fills the 5 ounce pitcher with water.
 *   emptyX5() method discards the contents of the 5 ounce pitcher. 
 *   transferX5toY8() method pours the contents of 5 to 8 without any spilling.
 *   etc.
 *   
 * The complete solution to the problem is in the sequence of operations (method calls)
 * in the main() method.  You should run main and look at the output.
 * 
 */
public class MainNoObjects {
	
	static int X5 = 0; // five ounce pitcher
	static int Y8 = 0; // eight ounce pitcher
	
	static void fillX5() {
		X5 = 5; 
		displayX5andY8();
	}
	
	static void fillY8() {
		Y8 = 8; 
		displayX5andY8();
	}
	
	static void emptyX5() {
		X5 = 0; 
		displayX5andY8(); 
	}
	
	static void emptyY8() {
		Y8 = 0; 
		displayX5andY8();
	}
	
	static void transferX5toY8() {
		int additionY8 = Math.min(8 - Y8, X5);
		Y8 = Y8 + additionY8;
		X5 = X5 - additionY8;
		displayX5andY8(); 
	}
	
	static void transferY8toX5() {
		int additionX5 = Math.min(5 - X5, Y8);
		X5 = X5 + additionX5;
		Y8 = Y8 - additionX5;
		displayX5andY8(); 
	}

	static void displayX5andY8() {
		System.out.printf("(%d,%d)\n", X5, Y8);
	}
	
	
	public static void main(String[] args) {
		fillY8();
		transferY8toX5();
		System.out.println("---*-");  // (5,3)
	// ...more operations to produce the other amounts
		emptyX5();
		transferY8toX5();
		fillY8();
		transferY8toX5();
		System.out.println("---*-");  // (5,6)
		emptyX5();
		transferY8toX5();
		System.out.println("---*-");  // (5,1)
		emptyX5();
		transferY8toX5();
		fillY8();
		transferY8toX5();
		System.out.println("---*-");  // (5,4)
		emptyX5();
		transferY8toX5();
		fillY8();
		transferY8toX5();
		System.out.println("---*-");  // (5,7)
		emptyX5();
		transferY8toX5();
		System.out.println("---*-");  // (5,2)
	}

}
