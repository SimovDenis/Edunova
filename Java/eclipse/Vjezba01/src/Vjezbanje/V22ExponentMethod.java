package Vjezbanje;

import javax.swing.JOptionPane;

public class V22ExponentMethod {

//		Write a method called exponent(int base, int exp) that returns an int value of base raises to the power of exp. The signature of the method is:
//
//		  public static int exponent(int base, int exp);

//		Assume that exp is a non-negative integer and base is an integer. Do not use any Math library functions.
//
//		Also write the main() method that prompts user for the base and exp; and prints the result. For example,
//
//		Enter the base: 3
//		Enter the exponent: 4
//		3 raises to the power of 4 is: 81

	public static void main(String[] args) {

		int base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base"));
		int exp = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent"));

		System.out.println(base + " raises to the power of " + exp + " is " + exponent(base, exp));

	}

	private static int exponent(int base, int exp) {

		int result = 1;

		for (int i = 1; i <= exp; i++) {
			result *= base;
		}

		return result;
	}

}
