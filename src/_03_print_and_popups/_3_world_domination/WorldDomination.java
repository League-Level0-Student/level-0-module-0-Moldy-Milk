package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		
String coder = JOptionPane.showInputDialog(null, "Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if (coder .equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "YOU ARE THE DOMINATOR");
}
else if (coder .equalsIgnoreCase("possibly")) {
	String possibly = JOptionPane.showInputDialog("Are you signed up for Amazing League lessons? I heard they are pretty great.");
	
	if (possibly .equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, "Sign up for Amazing League Lessons");
	}
	else {
		JOptionPane.showMessageDialog(null, "YOU ARE THE DOMINATOR");
	}
}
		// 3. Otherwise, tell them to sign up for classes at The League.
else {
	JOptionPane.showMessageDialog(null, "Sign up for Amazing League Lessons");
}
	}
}

