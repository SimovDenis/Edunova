package edunova;

import javax.swing.JOptionPane;

public class Z04PrimBroj {

	public static void main(String[] args) {

		// Ispisati sve proste brojeve između dva unesena broja

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi manji broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi veći broj"));

		if (prvi > drugi) {
			int zamjenski = prvi;
			prvi = drugi;
			drugi = zamjenski;
		}

		boolean prim = true;

		for (int i = prvi; i <= drugi; i++) {
			prim = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prim = false;

				}
			}
			if (prim)
				System.out.println(i);

		}

	}

}
