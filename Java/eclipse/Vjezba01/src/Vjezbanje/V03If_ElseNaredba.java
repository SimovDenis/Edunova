package Vjezbanje;

import javax.swing.JOptionPane;

public class V03If_ElseNaredba {

	public static void main(String[] args) {

		float rezultat;
		float prviBroj = Float.parseFloat(JOptionPane.showInputDialog("Unesite prvi broj za vasu operaciju"));
		float drugiBroj = Float.parseFloat(JOptionPane.showInputDialog("Unesite drugi broj za vasu operaciju"));

		String operacija = JOptionPane.showInputDialog("Unesite znak vase operacije (npr. +, -, *, /)");

		if (operacija.equals("+")) {
			rezultat = prviBroj + drugiBroj;
			System.out.println("Rezultat vase operacije je " + rezultat);

		} else if (operacija.equals("-") ) {
			rezultat = prviBroj - drugiBroj;
			System.out.println("Rezultat vase operacije je " + rezultat);

		} else if (operacija.equals("*")) {
			rezultat = prviBroj * drugiBroj;
			System.out.println("Rezultat vase operacije je " + rezultat);
			
		} else if (operacija.equals("/")) {
			rezultat = prviBroj / drugiBroj;
			System.out.println("Rezultat vase operacije je " + rezultat);
			
		} else {
			System.out.println("Niste unijeli jednu od 4 ponudene opcije operacije!");
		}

	}

}
