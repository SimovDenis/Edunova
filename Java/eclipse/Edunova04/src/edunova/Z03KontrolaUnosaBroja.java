package edunova;

import javax.swing.JOptionPane;

public class Z03KontrolaUnosaBroja {
	
	public static void main(String[] args) {
		
		// program traži od korisnika unos broja
		// između 1 i 10
		
		for(;;) {
			int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
			if (broj >= 1 && broj <= 10) {
				System.out.println("Unijeli ste: " + broj);
				break;
				
			}
			
			System.out.println("Nije dobar");
			
		}
		
		
	}

}
