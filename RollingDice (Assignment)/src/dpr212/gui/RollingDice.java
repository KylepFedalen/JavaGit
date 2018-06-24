package dpr212.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.*;

import dpr212.model.*;

public class RollingDice extends Panel {
	
	Dice dice = new Dice();	// this is the model
	static boolean [] isChecked;// stores the bool value of the check boxes
	JLabel [] savedRoll;
	JCheckBox [] holdRoll;
	JButton rollButton;
	// emptyIcon is a die with no dots!
	final static ImageIcon emptyIcon = new ImageIcon("images/Dice/empty.jpg");
	// dieIcons is an array initialized to the images of die with 1 dot, 2 dots, ..., 6 dots.
	final static ImageIcon [] dieIcons = {new ImageIcon("images/Dice/one.jpg"),
									 new ImageIcon("images/Dice/two.jpg"),
									 new ImageIcon("images/Dice/three.jpg"),
									 new ImageIcon("images/Dice/four.jpg"),
									 new ImageIcon("images/Dice/five.jpg"),
									 new ImageIcon("images/Dice/six.jpg")};
	
	public RollingDice() {
		
//  1. Create needed JComponents for the GUI
		//savedRoll = new JLabel[Constants.MAX_DICE];
		//holdRoll = new JCheckBox[Constants.MAX_DICE];
		
		
//  2. Hook up event listeners to the components
//  3. Add the components to the panel on which they display
//      TODO: Create the proper JComponents here (use initSavedRoll() and initHoldRoll() below)
//	          Don't forget to create the roll button (hint: new JButton("label");
		rollButton = new JButton("Roll");
		initSavedRoll();
		initHoldRoll();
//      TODO: Hook up the Roll button ActionListener here.
//			  Hint: need to create an ActionListener object and add it to the rollButton
//                  new ActionListener()  creates an anonymous ActionListenter
//                  and every JComponent has an addActionListener() method.
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setChecked();//sets the curent bool value of the checked boxes
				doRoll();	
			}
		};
		rollButton.addActionListener(listener);
//		TODO: Add all of JComponent objects to the RollingDice panel like this.				
        add(rollButton);
//			  Do this for all the components.
	}
	
	private void initSavedRoll() {
		savedRoll = new JLabel[Constants.MAX_DICE];
		for (int i=0; i<Constants.MAX_DICE; i++) {
			savedRoll[i] = new JLabel(emptyIcon);
			add(savedRoll[i]);
		}
	}
	
	private void initHoldRoll() {
		holdRoll = new JCheckBox[Constants.MAX_DICE];
		for (int i=0; i<Constants.MAX_DICE; i++) {
			holdRoll[i] = new JCheckBox();
			add(holdRoll[i]);
		}
	}
	
	public void displayRoll(int faces[]) {
		for (int i=0; i<Constants.MAX_DICE; i++) {
			if (!holdRoll[i].isSelected()) {
				savedRoll[i].setIcon(dieIcons[faces[i]-1]);
			}
			System.out.printf("At %d show value %d \n",i, faces[i]);
		}
	}
	
	public void setChecked() { //sets the curent bool value of the checked boxes
		isChecked = new boolean[Constants.MAX_DICE];
		for (int i=0; i<Constants.MAX_DICE; i++){
			if (holdRoll[i].isSelected()){
				isChecked[i] = true;
			}else{
				isChecked[i] = false;
			}
		}
	}
	public static boolean[] getChecked(){ //returns the bool list of checked boxes
		return isChecked;
	}

	public void doRoll() {
		System.out.println("New Roll:");
		dice.roll();
		displayRoll(dice.getRoll());
	}

}

