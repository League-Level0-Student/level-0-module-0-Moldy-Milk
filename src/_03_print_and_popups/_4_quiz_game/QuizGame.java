package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String Qustion1 = JOptionPane.showInputDialog("About how long is a full cycle of the moon?");
				// 2.  Ask the user a question 
				if (Qustion1 .equalsIgnoreCase("30")) {
					JOptionPane.showMessageDialog(null, "Correct!");
					score +=1;
					JOptionPane.showMessageDialog(null, "score= " + score );
				}
				else {
					JOptionPane.showMessageDialog(null, "Trash not correct");
					score -=1;
					JOptionPane.showMessageDialog(null, "Score= " + score);
				}
				Object[] Options = {"The Power House of the CELLLLLL","IDK"};

					int choice = JOptionPane.showOptionDialog(null,"WHat is the MITOChonDira", "Pick an answer", JOptionPane.YES_NO_OPTION,0, null,Options , "Metric");

					if (choice ==0) {
						JOptionPane.showMessageDialog(null, "Correct!");
						score +=1;
						JOptionPane.showMessageDialog(null, "score= " + score );
					}
					else {
						JOptionPane.showMessageDialog(null, "Trash not correct");
						score -=1;
						JOptionPane.showMessageDialog(null, "Score= " + score);
				}
					String Qustion3 = JOptionPane.showInputDialog("Triangle ABC has side lengths 3(sqrt2),9(sqrt5) and 2(sqrt6). What is the area of the triangle?");
					// 2.  Ask the user a question 
					if (Qustion3 .equalsIgnoreCase("HALF BASE TIMES HEIGHT")) {
						JOptionPane.showMessageDialog(null, "Correct!");
						score +=1;
						JOptionPane.showMessageDialog(null, "score= " + score );
					}
					else {
						JOptionPane.showMessageDialog(null, "YOU ARE TOO LAZY FOR THIS");
						score -=1;
						JOptionPane.showMessageDialog(null, "Score= " + score);
					}
					Object[] Optionsz = {"True","False"};

					int choices = JOptionPane.showOptionDialog(null,"Is Switzerland the most chocolate consuming country?", "Pick an answer", JOptionPane.YES_NO_OPTION,0, null,Optionsz , "Metric");

					if (choices ==0) {
						JOptionPane.showMessageDialog(null, "Correct!");
						score +=1;
						JOptionPane.showMessageDialog(null, "score= " + score );
					}
					else {
						JOptionPane.showMessageDialog(null, "Trash not correct");
						score -=1;
						JOptionPane.showMessageDialog(null, "Score= " + score);
				}
					Object[] Optionszz = {"True","False"};

					int choicess = JOptionPane.showOptionDialog(null,"Does BMW stand for Bavarian Motor Works?","choose an option", JOptionPane.YES_NO_OPTION,0, null,Optionszz , "Metric");

					if (choicess ==0) {
						JOptionPane.showMessageDialog(null, "Correct!");
						score +=1;
						JOptionPane.showMessageDialog(null, "score= " + score );
					}
					else {
						JOptionPane.showMessageDialog(null, "Trash not correct");
						score -=1;
						JOptionPane.showMessageDialog(null, "Score= " + score);
				}
					
					JOptionPane.showMessageDialog(null, "Your FINAL SCORE IS A WHOPPING " + score);
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
