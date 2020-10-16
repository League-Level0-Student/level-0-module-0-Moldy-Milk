package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("helloworld");
	String Retort= JOptionPane.showInputDialog("What is 231255+23523523");
	JOptionPane.showMessageDialog(null,Retort + " is incorrect!");
}
}
