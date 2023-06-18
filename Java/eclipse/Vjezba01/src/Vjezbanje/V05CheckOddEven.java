package Vjezbanje;

import javax.swing.JOptionPane;

//Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. 
//The program shall always print “bye!” before exiting.

public class V05CheckOddEven {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Odd/Even check"));

		if (num % 2 == 0) {
			System.out.println(num + " = even number\n");
		} else {
			System.out.println(num + " = odd number\n");
		}

		System.out.println("Bye!");

	}

}
