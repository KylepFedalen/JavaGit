package dpr204;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Main {		
	
	public static void main(String[] args) {
		// You can put whatever code you want here.
		// Good place to put debugging code.
		
		Die d1 = new Die();
		System.out.println("1 die rolled: "+d1.getFaceValue());
		d1.roll();
		System.out.println("1 die rolled: "+d1.getFaceValue());
		
		Dice dice = new Dice();		
		int [] startFaces;
		startFaces = dice.getFaceValues();
		for (int i = 1; i <= 10; i++) {
			dice.roll();
			int [] newFaces;
			newFaces = dice.getFaceValues();
			if (startFaces.equals(newFaces)) {
				System.out.println(startFaces[0]+"&"+startFaces[1]+ " and "+ newFaces[0] + "&" + newFaces[1]);
				System.out.println("failure");  // pass
			}else{
				System.out.println(startFaces[0]+"&"+startFaces[1]+ " and "+ newFaces[0] + "&" + newFaces[1]);
				System.out.println("success");
			}
		}
		
	
		
		/*
		Dice dice = new Dice();
		int[] faces = dice.getFaceValues();
		//System.out.println(dice.getFaceValues());
		System.out.println(faces.length +" dice rolled: "+faces[0]+" and "+faces[1]);
		dice.roll();
		System.out.println(faces.length +" dice rolled: "+faces[0]+" and "+faces[1]);
		*/
	}
	
}
