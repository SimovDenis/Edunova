package Vjezbanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class V20LjubavniKalkulator {

	public static void main(String[] args) {

		String osoba1 = JOptionPane.showInputDialog("Unesi svoje ime").toLowerCase();
		String osoba2 = JOptionPane.showInputDialog("Unesi ime svoje simpatije").toLowerCase();

		char[] os1 = osoba1.toCharArray();
		char[] os2 = osoba2.toCharArray();

		char[] manja = os1.length < os2.length ? os1 : os2;
		char[] veca = os1.length > os2.length ? os1 : os2;

		int[] broj1 = new int[manja.length];
		int[] broj2 = new int[veca.length];

		// za prvu osobu
		for (int i = 0; i <= manja.length - 1; i++) {
			for (int j = 0; j <= manja.length - 1; j++) {
				if (manja[i] == manja[j]) {
					broj1[i] = broj1[i] + 1;
				}
			}
		}

		for (int i = 0; i <= manja.length - 1; i++) {
			for (int j = 0; j <= veca.length - 1; j++) {
				if (manja[i] == veca[j]) {
					broj1[i] = broj1[i] + 1;
				}
			}
		}

		// za drugu osobu
		for (int i = 0; i <= veca.length - 1; i++) {
			for (int j = 0; j <= veca.length - 1; j++) {
				if (veca[i] == veca[j]) {
					broj2[i] = broj2[i] + 1;
				}
			}
		}

		for (int i = 0; i <= veca.length - 1; i++) {
			for (int j = 0; j <= manja.length - 1; j++) {
				if (veca[i] == manja[j]) {
					broj2[i] = broj2[i] + 1;
				}
			}
		}

		System.out.println(Arrays.toString(broj1));
		System.out.println(Arrays.toString(broj2));

		// Zbroj matrica osobe 1 i osobe 2
		int[] zbrojMatrica = new int[broj2.length];

		for (int i = 0; i < zbrojMatrica.length; i++) {
			if (broj1.length > i) {
				zbrojMatrica[i] += broj1[i];
			}

			if (broj2.length > i) {
				zbrojMatrica[zbrojMatrica.length - 1 - i] += broj2[i];
			}

		}

		System.out.println(Arrays.toString(zbrojMatrica));

		// Zbroj konačne matrice
		if (zbrojMatrica.length % 2 == 0) {
			int[] zbroj = new int[zbrojMatrica.length / 2];

			for (int i = 0; i < zbrojMatrica.length; i++) {

				if (zbrojMatrica[i] + zbrojMatrica[zbrojMatrica.length - 1 - i] >= 10) {

				}

				if (i < zbrojMatrica.length - 1 - i) {
					zbroj[i] = zbrojMatrica[i] + zbrojMatrica[zbrojMatrica.length - 1 - i];
				}

			}

			System.out.println(Arrays.toString(zbroj));

		}

		if (zbrojMatrica.length % 2 == 1) {
			int[] zbroj = new int[(zbrojMatrica.length / 2) + 1];

			for (int i = 0; i < zbrojMatrica.length; i++) {

				if (i < zbrojMatrica.length - 1 - i) {

					zbroj[i] = zbrojMatrica[i] + zbrojMatrica[zbrojMatrica.length - 1 - i];
				}

				if (zbrojMatrica[i] == zbrojMatrica[zbrojMatrica.length - 1 - i]) {
					zbroj[i] = zbrojMatrica[i];
				}

			}

			System.out.println(Arrays.toString(zbroj));

		}

	}

}
