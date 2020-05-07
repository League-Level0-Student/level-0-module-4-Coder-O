package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		int numbOfNickels = Integer.parseInt(JOptionPane.showInputDialog("How many nickels do you have? Please only respond with a number and no extra cheracters."));
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer
		int numbOfDimes = Integer.parseInt(JOptionPane.showInputDialog("How many dimes do you have? Please only respond with a number and no extra cheracters."));
		// Ask the user how many quarters they have, and convert their answer
		int numbOfQuarters = Integer.parseInt(JOptionPane.showInputDialog("How many quarters do you have? Please only respond with a number and no extra cheracters."));
		// Calculate how much money the user has.  Hint: Use a double variable 
		double ammountOfChange = (numbOfNickels * 5) + (numbOfDimes * 10) + (numbOfQuarters * 25);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		if (ammountOfChange % 10 == 0) {
			
				JOptionPane.showMessageDialog(null, "You have "+(ammountOfChange/100)+"0 in change.");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "You have $"+(ammountOfChange/100)+" in change.");
		}
	}
}

