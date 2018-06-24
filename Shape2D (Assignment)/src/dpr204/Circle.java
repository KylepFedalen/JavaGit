package dpr204;
import static java.lang.Math.PI;
/**
 * Circle is a concrete 2D object.  Note its constructors
 * and methods and the use of @Override annotation.
 * @Override is a safety feature that let's the compiler check
 * that the overriding method is spelled correctly.
 */
public class Circle extends Shape2D {

	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double r) {
		if (r <= 0.0) {
			throw new IllegalArgumentException("Radius cannot be <= 0.0. Your value: " + r);
		}
		radius = r;
	}
	
	@Override
	public double perimeter() {
		return PI*2.0*radius;	// pi * 2 * diameter (diameter = 2*radius)
	}

	@Override
	public double area() {
		return PI*radius*radius;  // pi * radius^2
	}
	
	@Override
	public String toString() {
		// cannot use printf here.
		return "Circle radius: " + radius;
	}

}
