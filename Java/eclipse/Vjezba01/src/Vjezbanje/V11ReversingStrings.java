package Vjezbanje;

// Write a Java program to reverse a string.

import javax.swing.JOptionPane;

public class V11ReversingStrings {

	public static void main(String[] args) {
		
		String bla = JOptionPane.showInputDialog("Input your word/sentence");
		
		char letters[] = bla.toCharArray();
		
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}

	}

}
