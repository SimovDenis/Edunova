package edunova;

import javax.swing.JOptionPane;

public class Z07 {

	public static void main(String[] args) {

		// Program unosi 2 broja
		// Ako su oba broja parni
		// ispisuje njihov zbroj
		// inače ispisuje njihovu razliku

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		// rješenje zadatka uvjetnim grananjem if
		if (prvi % 2 == 0 && drugi % 2 == 0) {
			System.out.println(prvi + drugi);
		} else {
			System.out.println(prvi - drugi);
		}

		// inline rješenje
		System.out.println((prvi % 2 == 0 && drugi % 2 == 0) ? prvi + drugi : prvi - drugi);

	}

}
