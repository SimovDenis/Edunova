package edunova;

import javax.swing.JOptionPane;

public class Z05TablicaMnozenja {

	public static void main(String[] args) {

		String ime = JOptionPane.showInputDialog("Unesi svoje ime");

		for (int i = 1; i <= 30; i++) {
			System.out.print("-");
		}

		System.out.println();
		System.out.println(": : :  TABLICA MNOZENJA  : : :");

		for (int i = 1; i <= 30; i++) {
			System.out.print("-");
		}

		System.out.println();
		System.out.print(" * |");

		for (int i = 1; i < 10; i++) {
			System.out.print(" " + i + " ");
		}

		System.out.println();

		for (int i = 1; i <= 30; i++) {
			System.out.print("-");
		}

		System.out.println();

		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i + " " + "|");
			for (int j = 1; j <= 9; j++) {
				String br = Integer.toString(i * j);
				char brojevi[] = br.toCharArray();
				if (brojevi.length > 1) {
					System.out.print(i * j + " ");
				} else {
					System.out.print(" " + i * j + " ");
				}

			}
			System.out.println();
		}

		for (int i = 1; i <= 30; i++) {
			System.out.print("-");
		}

		System.out.println();

		if (ime.length() <= 7) {
			System.out.print(":  :  :  :  :  :   :by ");
			int raz = 7 - ime.length() - 1;
			for (int i = 0; i <= raz; i++) {
				System.out.print(" ");
			}
			System.out.println(ime);
		}

		switch (ime.length()) {
		case 8:
			System.out.println(":  :  :  :  :  :  :by " + ime);
			break;

		case 9:
			System.out.println(":  :  :  :  :  : :by " + ime);
			break;

		case 10:
			System.out.println(":  :  :  :  :   :by " + ime);
			break;

		case 11:
			System.out.println(":  :  :  :  :  :by " + ime);
			break;

		case 12:
			System.out.println(":  :  :  :  : :by " + ime);
			break;

		case 13:
			System.out.println(":  :  :  :   :by " + ime);
			break;

		case 14:
			System.out.println(":  :  :  :  :by " + ime);
			break;

		case 15:
			System.out.println(":  :  :  : :by " + ime);
			break;

		case 16:
			System.out.println(":  :  :   :by " + ime);
			break;

		case 17:
			System.out.println(":  :  :  :by " + ime);

		}

		for (int i = 1; i <= 30; i++) {
			System.out.print("-");
		}

	}

}
