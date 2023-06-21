package Vjezbanje;

import javax.swing.JOptionPane;

public class V14BoxOfHashtags {

	public static void main(String[] args) {

		// Write a program that will print a box of #’s taking from user the height and
		// width values.

		int height = Integer.parseInt(JOptionPane.showInputDialog("Inupt height"));
		int width = Integer.parseInt(JOptionPane.showInputDialog("Inupt width"));

		for (int j = height; j > 0; j--) {
			for (int i = width; i > 0; i--) {
				System.out.print("#");
			}

			System.out.println();

		}
	}

}
