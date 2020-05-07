package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class _0_4_2__Test_Scores_Code {
	
	public static void main(String[] args) {
		
		double testScore = Double.parseDouble(JOptionPane.showInputDialog("What percent did you get on your test? Please only awnser in the form of a whole number or decimal, with no extra cheracters. "));
		
		if(testScore<0) {
			JOptionPane.showMessageDialog(null, "How did you even... You know what, I'm not going to ask. I'll just asume your teacher is evil.");
		} else if(testScore<=50) {
			JOptionPane.showMessageDialog(null, "I know you can do better than that! Study hard for the next one, you'll ace it.");
		} else if(testScore<=75) {
			JOptionPane.showMessageDialog(null, "It's alright, but you can do better, I know you can!");
		} else if(testScore<90) {
			JOptionPane.showMessageDialog(null, "You're getting there, but you're not there yet. Keep at it!");
		} else if(testScore<100) {
			JOptionPane.showMessageDialog(null, "Pretty good, but not perfect. You can settle if you'd like, but I'd pearsonly like you to strive for that 100%!");
		} else if(testScore==100) {
			JOptionPane.showMessageDialog(null, "Great job! A perfect score! Now you just have to keep that up for the rest of your tests forever. Can't be too hard.");
		} else {
			JOptionPane.showMessageDialog(null, "You've certainly exceded expectations. For a challenge, try and get your overal grade to be above a 100% in this class by the end of the year.");
		}
		
	}
	
	
}
