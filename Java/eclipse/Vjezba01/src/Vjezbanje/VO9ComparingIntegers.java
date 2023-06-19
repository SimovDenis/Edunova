package Vjezbanje;

import javax.swing.JOptionPane;

// Write a Java program to compare two numbers.

public class VO9ComparingIntegers {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Input first integer"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Input secnod integer"));
		
		if (num1 != num2) {
			if (num1 < num2) {
				System.out.printf("%d has lower value than %d", num1, num2);
			} else if (num1 > num2) {
				System.out.printf("%d has higher value than %d", num1, num2);
			}
			
		} 	else {
			System.out.println("Numbers are equal.");
		}

	}

}
