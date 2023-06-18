package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		String grad = JOptionPane.showInputDialog("Unesi grad iz kojeg dolaziš");
		int godine = Integer.parseInt(JOptionPane.showInputDialog("Unesi svoje godine"));
		
		System.out.println("Imam " + godine + "g i dolazim iz mjesta " + grad + "!");

	}

}
