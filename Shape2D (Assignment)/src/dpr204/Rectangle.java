package dpr204;

public class Rectangle extends Shape2D {
	
	private double length;
	private double width;
	
	public Rectangle(){
		length = 2.0;
		width = 1.0;
	}
	@Override
	public double perimeter() {
		double per = ((length+width)*2);
		return per;
	}

	@Override
	public double area() {
		double area = (length*width);
		return area;
	}
	public String toString() {
		// cannot use printf here.
		return "Rectangle length: " + length + " Rectangle width: " + width;
	}
}
