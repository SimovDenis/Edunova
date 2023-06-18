package Vjezbanje;

import javax.swing.JOptionPane;

public class Z03Predavanje {

	public static void main(String[] args) {
		
		String ime = JOptionPane.showInputDialog("Unesi svoje ime");
		
		String grad = JOptionPane.showInputDialog("Unesi rodni grad");
		
		int godine = Integer.parseInt(JOptionPane.showInputDialog("Unesi svoje godine"));
		
		System.out.println("Moje ime je " + ime + ". Dolazim iz mjesta " + grad + " i imam " + godine + "g.");

	}

}
