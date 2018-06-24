package dpr212;

/* 
 * RollingDice application.
 * 
 * Learning objectives:
 * - Basics of GUI programming including events and handlers
 * - Use of AWT and Swing Components
 * - Use of private inner classes
 * - Value of separate packages within an application
 * - Introduction to the Model/View/Controller pattern
 */

import javax.swing.JFrame;

import dpr212.gui.*;

public class MainClass {

	public static void main(String[] args) {
		JFrame display = new JFrame("Rolling Dice");
		RollingDice panel = new RollingDice();
		display.getContentPane().add(panel);
		display.pack();
		display.setSize(500, 100);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setVisible(true);
	}

}
