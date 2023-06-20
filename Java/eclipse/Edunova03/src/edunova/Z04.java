package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	public static void main(String[] args) {
		
		// Korisnik unosi dva cijela broj
		// program ispisuje veći
		// 3 i 5 -> 5
		// 5 i 3 -> 5
		// 5 i 5 ->
		
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		if(prvi > drugi) {
			System.out.println(prvi);
		} else if(drugi > prvi) {
			System.out.println(drugi);
		}
		
	}

}
