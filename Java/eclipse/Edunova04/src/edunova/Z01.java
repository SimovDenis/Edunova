package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		// Korisnik unosi dva cijela broja
		// Program ispisuje
		// zbroj svih neparnih brojeva
		// između dva unesena broja

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int zbroj = 0;

		for (int i = prvi; i <= drugi; i++) {
			if (i % 2 != 0) {
				System.out.println("Zbroj neparnog broja: " + i);
				zbroj += i;
			}
		}

		System.out.print("je " + zbroj);

	}

}
