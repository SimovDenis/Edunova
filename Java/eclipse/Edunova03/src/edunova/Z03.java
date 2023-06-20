package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {

		// Korisnik unosi ime mjesta iz jedne od 4 slavonske županije
		// Za uneseno ime mjesta program ispisuje ime županije

		String mjesto = JOptionPane.showInputDialog("Unesi mjesto za provjeru županije");

		switch (mjesto) {
		
		case "Osijek":
			System.out.println("Osječko-baranjska županija");
			break;
			
		case "Požega":
			System.out.println("Požeško-slavonska županija");
			break;
			
		case "Virovitica":
			System.out.println("Virovitičko-podravska županija");
			break;
			
		case "Vukovar":
			System.out.println("Vukovarsko-srijemska županija");

		}

	}

}
