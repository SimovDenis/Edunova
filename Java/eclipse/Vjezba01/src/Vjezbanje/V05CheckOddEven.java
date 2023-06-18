package Vjezbanje;

import javax.swing.JOptionPane;

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
