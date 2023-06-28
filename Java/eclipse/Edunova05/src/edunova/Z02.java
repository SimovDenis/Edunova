package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {

		// Program unosi od korisnika dva broja
		// između 20 i 80
		// Program ispisuje sve neparne brojeve
		// između unesenih brojeva unazad (od većeg prema manjem)
		// koristiti do while petlju

		int prvi;
		int drugi;

		do {

			prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj izmedu 20 i 80"));

			if (prvi >= 20 && prvi <= 80) {
				break;
			}
			
			JOptionPane.showMessageDialog(null, "Probaj ponovno");

		} while (true);

		do {

			drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj izmedu 20 i 80"));

			if (drugi >= 20 && drugi <= 80) {
				break;
			}
			
			JOptionPane.showMessageDialog(null, "Probaj ponovno");

		} while (true);
		
		int manji;
		int veci;
		int broj;
		
		if (prvi > drugi) {
			 manji = drugi;
			 veci = prvi;
			 broj = veci;
		} else {
			manji = prvi;
			veci = drugi;
			broj = veci;
		}
		
		
//		int manji = prvi < drugi ? prvi : drugi;
//		int veci = prvi < drugi ? drugi : prvi;
//		
//		int broj = veci;
		
		do {
			
			 if (broj % 2 == 1) {
				 System.out.println(broj);
			 }
			
		}while(--broj >= manji);
		

	}

}
