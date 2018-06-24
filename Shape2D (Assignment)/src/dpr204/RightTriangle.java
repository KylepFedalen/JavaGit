package dpr204;

public class RightTriangle extends Shape2D {
	
	private double base;
	private double height;
	
	public RightTriangle(){
		base = 1.0;
		height = 1.0;
	}
	@Override
	public double perimeter() {
		double per = base+height+Math.sqrt((base*base)+(height*height));
		return per;
	}

	@Override
	public double area() {
		double area = ((base * height)/2);
		return area;
	}
	public String toString() {
		// cannot use printf here.
		return "RightTriangle base: " + base + " RightTriangle height: " + height;
	}
}
