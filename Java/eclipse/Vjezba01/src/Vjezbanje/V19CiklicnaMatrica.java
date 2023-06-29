package Vjezbanje;

import javax.swing.JOptionPane;

public class V19CiklicnaMatrica {

	public static void main(String[] args) {

		boolean dev = false;

		int red = dev ? 10 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int stupac = dev ? 10 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));

		int[][] matrica = new int[red][stupac];

		int b = 1;

		int redmin = 1;
		int stupacmin = 1;

		int redmax = red;
		int stupacmax = stupac;

		while () {
			for (int i = stupacmin; i <= stupacmax; i++) {
				matrica[red - redmin][stupac - i] = b++;
			}

			redmin++;

			for (int i = red - redmin; i >= red - redmax; i--) {
				matrica[i][stupac - stupacmax] = b++;
			}

			stupacmax--;

			for (int i = stupacmin; i <= stupac - stupacmin; i++) {
				matrica[red - redmax][i] = b++;
			}

			redmax--;

			for (int i = red - redmax; i <= red - redmin; i++) {
				matrica[i][stupac - stupacmin] = b++;
			}

			stupacmin++;

		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + "\t");
			}

			System.out.println();

		}

	}

}
