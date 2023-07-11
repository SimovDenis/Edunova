package Vjezbanje;

import javax.swing.JOptionPane;

public class V24MagicSum {

//	Write a boolean method called hasEight(), which takes an int as input and returns true if the number contains the digit 8 (e.g., 18, 168, 1288).
//	
//	The signature of the method is as follows:
//
//		public static boolean hasEight(int number);
//		
//	Write a program called MagicSum, which prompts user for integers (or -1 to end), and produce the sum of numbers containing the digit 8. 
//	Your program should use the above methods.

	public static void main(String[] args) {

		int sum = 0;

		for (;;) {
			int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive integer (or -1 to end)"));
			if (number == -1) {
				break;
			}
			if (hasEight(number)) {
				sum += number;
			}
		}
		System.out.println(sum);
	}
	private static boolean hasEight(int number) {
		String num = Integer.toString(number);
		int counter = 0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '8') {
				counter += 1;
			}
		}
		if (counter > 0) {
			return true;
		} else {
			return false;
		}
	}

}
