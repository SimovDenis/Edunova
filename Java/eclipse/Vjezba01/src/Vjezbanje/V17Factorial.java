package Vjezbanje;

import javax.swing.JOptionPane;

public class V17Factorial {

	public static void main(String[] args) {

		// Write a java program to calculate the factorial value of given number.
		// Factorial x –> x * x-1 * x-2…x*1

		int num = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));
		int factorial = 1;

		for (int i = num; i > 1; i--) {
			if (i == num) {
				factorial = num;
			}

			factorial *= (i - 1);

		}

		System.out.println(factorial);

	}

}
