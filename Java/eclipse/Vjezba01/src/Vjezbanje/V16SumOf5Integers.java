package Vjezbanje;

import javax.swing.JOptionPane;

public class V16SumOf5Integers {
	
	public static void main(String[] args) {
		
		// Write a program to find the sum of 5 integers.
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Input number"));	
			sum += num;
		}
		
		System.out.println(sum);
		
		
	}

}
