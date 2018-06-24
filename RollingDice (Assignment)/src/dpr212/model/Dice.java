package dpr212.model;

import dpr212.gui.RollingDice;

public class Dice {

	Die [] dice = new Die [Constants.MAX_DICE];
	
	
	public Dice() {
		for (int i=0; i<Constants.MAX_DICE; i++) {
			dice[i] = new Die();
		}		
	}
	
	public void roll() {
		boolean[] checked = RollingDice.getChecked();
		for (int i=0; i<Constants.MAX_DICE; i++) {
			if(checked[i]==false){//rerolls only the dice without checked boxes
			dice[i].roll();	
			}
		}
	}
	
	public int[] getRoll() {
		int [] faces = new int[Constants.MAX_DICE];
		for (int i=0; i<Constants.MAX_DICE; i++) {
			faces[i]= dice[i].getFaceValue();
		}
		return faces;
	}
	
}
