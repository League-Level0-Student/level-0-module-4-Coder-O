package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.
		String pi = "3.14159265358979323846";
		String guessed_pi = "3.";
		String[] options = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1
		System.out.print(pi.charAt(0));
		System.out.print(pi.charAt(1));
		System.out.print(pi.charAt(2)+"\n");
	// 4. Print ALL the digits of of the Pi String (hint: use a loop)
		for(int i = 0; i < pi.length(); i++) {
			//System.out.print(pi.charAt(i));
			
			//speak(pi.charAt(i));
			if (i > 1)	{
				int user_input = JOptionPane.showOptionDialog(null, "Pi starts with:\n"+guessed_pi+"\nWhat is the next digit of pi?                                                                                                                                                                      ",
						" ", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, 9);
				System.out.println(user_input);
				if (user_input == Integer.parseInt(String.valueOf(pi.charAt(i)))) {
					JOptionPane.showMessageDialog(null, "Correct!");
					guessed_pi = guessed_pi + pi.charAt(i);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect! The correct digit was "+pi.charAt(i));
					i = pi.length();
				}
			}
		}
	// 5. Use the speak() method below to speak each digit of Pi.
		
	// [CHALLENGE]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" 
	}
	
	
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


