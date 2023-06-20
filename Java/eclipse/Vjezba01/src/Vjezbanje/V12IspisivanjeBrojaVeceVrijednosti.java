package Vjezbanje;

import javax.swing.JOptionPane;

public class V12IspisivanjeBrojaVeceVrijednosti {
	
	public static void main(String[] args) {
		
		// Ispiši najveći od tri unesena cijela broja
		
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int treci = Integer.parseInt(JOptionPane.showInputDialog("Unesi treći broj"));
		
		if(prvi > drugi && prvi > treci) {
			System.out.println(prvi);
		} else if (drugi > prvi && drugi > treci) {
			System.out.println(drugi);
		} else {
			System.out.println(treci);
		}
		
	}

}
