package dpr204;
/**
 * Directions:  Add child classes Rectangle and RightTriangle to the
 * application.  Each of these extends the parent class Shape2D.
 */
public abstract class Shape2D {
	
	protected Color fillColor;
	// Methods perimeter() and area() are abstract since 
	// their implementation is dependent on concrete shapes.
	public abstract double perimeter();
	public abstract double area();
	// Method getFillColor is common to all shapes so it
	// is not abstract.
	public Color getFillColor() {
		return fillColor;
	}
	
	public void setFillColor(Color c) {
		fillColor = c;
	}
	

}
