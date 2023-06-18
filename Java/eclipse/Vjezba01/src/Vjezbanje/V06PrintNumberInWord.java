package Vjezbanje;

import javax.swing.JOptionPane;

//Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. 
//Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.

public class V06PrintNumberInWord {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Your number in word, 1-10"));

		switch (num) {

		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;

		case 4:
			System.out.println("Four");
			break;

		case 5:
			System.out.println("Five");
			break;

		case 6:
			System.out.println("Six");
			break;

		case 7:
			System.out.println("Seven");
			break;

		case 8:
			System.out.println("Eight");
			break;

		case 9:
			System.out.println("Nine");
			break;

		default:
			System.out.println("Other");
			break;
		}

	}

}
