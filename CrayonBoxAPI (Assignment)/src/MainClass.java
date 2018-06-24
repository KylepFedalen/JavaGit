

public class MainClass {
	
	
		public static void main(String[] args) {
			// create a box of crayons
			Box b1 = new Box();
			// invoke the toString() method of a box. Note the order of colors.
			System.out.println(b1);
			// remove the blue crayon.
			Crayon c1 = b1.remove(Color.BLUE);
			// draw with the blue crayon.
			c1.draw();
			// now sharpen it. It gets shorter
			b1.sharpen(c1);
			// remove the black crayon.
			Crayon c2 = b1.remove(Color.BLACK);
			// invoke the toString() method of a box. Note the missing colors.
			System.out.println(b1);
			// draw with the black crayon.
			c2.draw();
			// draw some more with it.
			c2.draw();
			// compare the lengths of black and blue crayon (see below). compareCrayons(c1, c2);
			compareCrayons(c1, c2);
			// put the blue crayon back into the box.
			b1.add(c1);
			// put the black crayon back into the box.
			b1.add(c2);
			System.out.println(b1);
			
		}
		public static void compareCrayons(Crayon c1, Crayon c2) {
			double result = c1.compareTo(c2);
			if (result > 0) {
			System.out.println("The " + c1.getColor() +
			" crayon is longer than the " + c2.getColor() + " crayon."+ "\n" );
			} else if (result < 0) {
			System.out.println("The " + c1.getColor() +
			" crayon is shorter than the " + c2.getColor() + " crayon." + "\n");
			} else if (result == 0) {
			System.out.println("The " + c1.getColor() +
			" crayon is equal to the " + c2.getColor() + " crayon." + "\n");
			}
		}
	

}
