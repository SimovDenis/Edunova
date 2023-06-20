package edunova;

import javax.swing.JOptionPane;

public class Z06 {
	
	public static void main(String[] args) {
		
		// program unosi broj između 
				// 1 i 999
				// U slučaju da je izvan tog raspona
				// ispisati grešku i prekinuti program
				// Program ispisuje 1. znamenku upisanog broja
		
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj izmedu 1 i 999"));
		
		if(broj < 1 || broj > 999) {
			System.out.println(broj + " greška");
		} else {
			String brojevi = Integer.toString(broj);
			char br[] = brojevi.toCharArray();
			System.out.println(br[0]);
		}
		
		
		
	}

}
