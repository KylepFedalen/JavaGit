package dpr204;
/**
 * Directions: First right-click on MainNoObjects.java and Run As => Java Application.
 * Analyze the output and the code that produced the output.  You must convert this
 * non object-oriented code to object-oriented code.
 * 
 * Next, fill in the methods of the Pitcher class as per its directions.
 * 
 * Next, fill in the body of main() with the proper object method calls 
 * on the two pitcher objects: p5 and p8. You can use the sequence from MainNoObjects.java.
 * 
 * To see your program working you MUST call display() method below after each pitcher operation.
 * To verify your program, right click on TestMain.java and Run As => JUnit Test.
 */
public class MainObjects {
		
	/**
	 * You MUST call this method after every pitcher method call in main().
	 * @param p5 five ounce pitcher
	 * @param p8 eight ounce pitcher
	 */
	static void display(Pitcher p5, Pitcher p8) {
		// uncomment the next line after you have implemented the getOunces() method.
		System.out.printf("(%d,%d)\n", p5.getOunces(), p8.getOunces());
	}
	
	public static void main(String[] args) {
		// uncomment these lines after you have implemented the Pitcher constructor.
		Pitcher p5 = new Pitcher(5);
		Pitcher p8 = new Pitcher(8);
		
		
				
		p8.fill();
		p8.transfer(p5);
		display(p5,p8);
		System.out.println("------------");
		p5.empty();
		p8.transfer(p5);
		p8.fill();
		p8.transfer(p5);
		display(p5,p8);
		System.out.println("------------");
		p5.empty();
		p8.transfer(p5);
		display(p5,p8);
		System.out.println("------------");
		p5.empty();
		p8.transfer(p5);
		p8.fill();
		p8.transfer(p5);
		display(p5,p8);
		System.out.println("------------");
		p5.empty();
		p8.transfer(p5);
		p8.fill();
		p8.transfer(p5);
		display(p5,p8);
		System.out.println("------------");
		p5.empty();
		p8.transfer(p5);
		display(p5,p8);
		System.out.println("------------");
		
	}	

}
