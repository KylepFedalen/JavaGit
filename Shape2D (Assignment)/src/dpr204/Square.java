package dpr204;
/**
 * Square is a concrete 2D object.  Note its constructors
 * and methods and the use of @Override annotation.
 * @Override is a safety feature that let's the compiler check
 * that the overriding method is spelled correctly.
 */

public class Square extends Shape2D {
	
	private double side;
	
	public Square() {
		side = 1.0;
	}

	public Square(double s) {
		if (s <= 0.0) {
			throw new IllegalArgumentException("Side cannot be <= 0.0. Your value: " + s);
		}
		side = s;
	}
	
	@Override
	public double perimeter() {
		return 4*side;
	}

	@Override
	public double area() {
		return side*side; // side^2 
	}

	@Override
	public String toString() {
		// cannot use printf here.
		return "Square side: " + side;
	}

}
