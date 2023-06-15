package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi djeljenik"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi djelitelj"));
		
		System.out.println("Rezultat je: " + prvi/(float)drugi);

	}

}
