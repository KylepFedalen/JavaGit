package dpr204;
/*
 * Directions: Create additional classes representing 2D shapes.
 *            Examples of such objects are Circle and Square.
 *            You must add Rectangle and RightTriangle.
 *            
 * Learning Objectives:
 * - Learn difference between no-argument Constructor and Constructor with arguments
 * - Learn why parent class declares a method to be 'abstract'
 * - Learn to extend application with new child classes
 * - See polymorphic behavior between subclasses of Shape2D           
 */
public class MainClass {

	public static void main(String[] args) {
		Shape2D [] objs2D = new Shape2D[4] ;
		
		objs2D[0] = new Circle();
		objs2D[1] = new Square();
		objs2D[2] = new RightTriangle();
		objs2D[3] = new Rectangle();
		// TODO 1: Create a RightTriangle class that extends Shape2D
		//            RightTriangle properties: base, height (double)
		//                          area:  (base*height) / 2.0
		//                          perimeter: base + height + hypoteneuse  where hypoteneuse = Math.sqrt(base*base + height*height)
		// TODO 2: Create a Rectangle class that extends Shape2D
		//            Rectangle properties: width, length (double)
		//                      area: length*width
		//                      perimeter: 2*(length+width)
		// TODO 3: Activate the two lines below that are commented out.
//		objs2D[2] = new RightTriangle();
//		objs2D[3] = new Rectangle();
		
		for (int i=0; i < 4; i++) {
			System.out.printf("\n%s\n", objs2D[i]);
			System.out.printf("Perimeter: %f\n", objs2D[i].perimeter());
			System.out.printf("Area     : %f\n", objs2D[i].area());
		}
		
	}

}
