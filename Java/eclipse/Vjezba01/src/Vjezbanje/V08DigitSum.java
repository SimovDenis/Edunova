package Vjezbanje;

import javax.swing.JOptionPane;

// Write a Java program and compute the sum of an integer's digits.

public class V08DigitSum {

	public static void main(String[] args) {

		int sum, fin = 0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));

		while (num != 0) {
			sum = num % 10;
			fin += sum;
			num /= 10;
		}

		System.out.println(fin);

	}

}
