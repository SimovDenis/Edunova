package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {

		// Korisnik unosi cijeli broj
		// Program ispisuje da li je
		// paran ili nije

		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj za provjeru"));

		// rješenje zadatka uvjetnim grananjem if
		if (broj % 2 == 0) {
			System.out.println("Broj je paran");
		} else {
			System.out.println("Broj je neparan");
		}

		// inline rješenje zadatka
		System.out.println("Broj je " + (broj % 2 != 0 ? "ne" : "") + "paran");

	}

}
