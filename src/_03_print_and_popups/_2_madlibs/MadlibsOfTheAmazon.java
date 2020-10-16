package _03_print_and_popups._2_madlibs;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "If you ever yes";
	JOptionPane.showMessageDialog(null, prompt);
		// Get the player to enter an adjective
String noun = JOptionPane.showInputDialog(null, "NOUN");

		// Get the player to enter a type of liquid
String food = JOptionPane.showInputDialog(null,"FOOD");
		// Get the player to enter a body part
String clothing = JOptionPane.showInputDialog(null,"CLOTHES");
		// Get the player to enter a verb
String verb = JOptionPane.showInputDialog(null,"gib verbe");
		// Get the player to enter a place
String place = JOptionPane.showInputDialog(null,"GIB PLAKE");
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		String story = 
		"If you ever come across a "+noun+" during the day, never go near it,\n"  +
		"because it really like to eat alot of "+food+" and will most\n"  +
		"likely take all your "+clothing+". If you ever "+verb+",make sure to\n"  +
		"run back to the "+place+" where you belong.";
		
		
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		JOptionPane.showMessageDialog(null,story);
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	}
}