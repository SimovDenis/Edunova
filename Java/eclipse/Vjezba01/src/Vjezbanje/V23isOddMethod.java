package Vjezbanje;

import javax.swing.JOptionPane;

public class V23isOddMethod {

//	Write a boolean method called isOdd() in a class called OddEvenTest, which takes an int as input and returns true if the it is odd. 
//	The signature of the method is as follows:
//
//		public static boolean isOdd(int number);

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

		if (isOdd(number) == true) {
			System.out.println(number + " is an odd number");
		} else {
			System.out.println(number + " is an even number");
		}

	}

	private static boolean isOdd(int number) {

		if (number % 2 == 0) {
			return false;
		} else {
			return true;
		}

	}

}
