
public class Crayon implements Comparable<Box> {
	
	private Color color;
	private double length;
	
	public Crayon(double len, Color col) {
		color = col;
		length = len;
	}
	@Override
	public String toString() {
		String col = color.toString();
		String len = Double.toString(getLength());
		return " Color:" + col + " Length:"+ len;
	}
	public Color getColor(){
		return color;
	}
	
	public double getLength(){
		return length;
	}
	public void setLength(double x){
		length = x;
	}
	public void draw(){
		System.out.println("Drawing with " + color + " crayon");
		setLength(length - .5);
		System.out.println("The " + color + " crayon is now " + length + "long"+"\n");
	}

	public double compareTo(Crayon c2) {		
		return c2.getLength() - length;
	}
	@Override
	public int compareTo(Box o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
