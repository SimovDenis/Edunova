package Vjezbanje;

import javax.swing.JOptionPane;

public class V21PINCheck {

	public static void main(String[] args) {

//		You have to design the code such that the user has only three tries to guess the correct pin of the account. 
//		You set the pin as a constant with a final attribute. 
//		When correct display “Correct, welcome back.” When incorrect display “Incorrect, try again.”. 
//		When ran out of tries display “Sorry but you have been locked out.”

		int pin = 1234;

		for (int i = 0; i < 3; i++) {

			int check = Integer.parseInt(JOptionPane.showInputDialog("Please enter pin"));

			if (check == pin) {
				System.out.println("Correct, welcome back");
				break;
			} else if (check != pin && i < 2) {
				System.out.println("Incorrect, try again");
			}

			if (i == 2) {
				System.out.println("Sorry but you have been locked out");
			}

		}

	}

}
