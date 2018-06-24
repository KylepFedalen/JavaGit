package dpr204;

public class Main {		
	
	public static void main(String[] args) {
		// You can put whatever code you want here.
		// Good place to put debugging code.
		
		Die d1 = new Die();
		System.out.println("1 die rolled: "+d1.getFaceValue());
		
		Dice dice = new Dice();
		int[] faces = dice.getFaceValues();
		System.out.println(faces.length +" dice rolled: "+faces[0]+" and "+faces[1]);
	}

}
