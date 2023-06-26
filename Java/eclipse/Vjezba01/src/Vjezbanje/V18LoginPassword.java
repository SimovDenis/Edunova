package Vjezbanje;

import javax.swing.JOptionPane;

public class V18LoginPassword {

	public static void main(String[] args) {

//		Suppose we have a database composed of two fields or columns (arrays), the first field is for the username (user[]) and the other one is for the password(pass[]) .
//
//		This is how it looks like:
//
//		user[0] = “Hassan” ;
//
//		user[1] =”Idris”;
//
//		 user[2]=”Trevor” ;
//
//		And their passwords correspond with their indexes.
//
//		pass[0] = “homecomingking”;
//
//		pass[1] = “turnupcharlie”;
//
//		pass[2] = “afraidofthedark”;
//
//		Then if one of them had successfully login, the output should be:
//
//		Enter username: Hassan
//
//		Enter password: homecomingking
//
//		Hello Hassan!
//
//		But if not, “Incorrect Login!”//
//		
//		You can ignore case for the username but not for the password.

		String user[] = { "Hassan", "Idris", "Trevor" };
		String pass[] = { "homecomingking", "turnupcharlie", "afraidofthedark" };

		for (;;) {
			String userid = JOptionPane.showInputDialog("Enter username");
			if (userid.equalsIgnoreCase(user[0])) {
				String password = JOptionPane.showInputDialog("Enter password");
				if (password.equals(pass[0])) {
					System.out.println("Hello Hassan!");
					break;
				} else {
					System.out.println("Incorrect login!");
				}
			} else if (userid.equalsIgnoreCase(user[1])) {
				String password = JOptionPane.showInputDialog("Enter password");
				if (password.equals(pass[1])) {
					System.out.println("Hello Idris!");
					break;
				} else {
					System.out.println("Incorrect login!");
				}

			} else if (userid.equalsIgnoreCase(user[2])) {
				String password = JOptionPane.showInputDialog("Enter password");
				if (password.equals(pass[2])) {
					System.out.println("Hello Trevor!");
					break;
				} else {
					System.out.println("Incorrect login!");
				}

			} else {
				System.out.println("Incorrect login!");
			}
		}

	}

}
