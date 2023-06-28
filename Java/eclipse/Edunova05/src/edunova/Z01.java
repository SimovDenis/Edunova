package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		// Program osigurava učitanje broja od korisnika
		// broj je u rasponu 20 do 50 i nije 30
		// koristiti while petlju

		int broj;

		while (true) {
			broj = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

			if (broj >= 20 && broj <= 50 && broj != 30) {
				break;
			}
			
			System.out.println("Probaj ponovno");

		}

		System.out.println(broj);

	}

}
