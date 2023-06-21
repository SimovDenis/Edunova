package Vjezbanje;

import javax.swing.JOptionPane;

public class V13NumberOfALetters {

	public static void main(String[] args) {

		// Determine and print the number of times the character ‘a’ appears in the
		// input entered by the user.

		String line = JOptionPane.showInputDialog("Input a word");

		char ln[] = line.toCharArray();

		int num = 0;

		for (int i = ln.length - 1; i >= 0; i--) {
			if (ln[i] == 'A' || ln[i] == 'a') {
				num += 1;
			}

		}

		System.out.println(num);

	}

}
