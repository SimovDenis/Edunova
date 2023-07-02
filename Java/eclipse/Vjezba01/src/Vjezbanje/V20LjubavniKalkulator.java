package Vjezbanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class V20LjubavniKalkulator {

	public static void main(String[] args) {

		String osoba1 = JOptionPane.showInputDialog("Unesi svoje ime").toLowerCase();
		String osoba2 = JOptionPane.showInputDialog("Unesi ime svoje simpatije").toLowerCase();

		char[] os1 = osoba1.toCharArray();
		char[] os2 = osoba2.toCharArray();

		int[] broj1 = new int[os1.length];
		int[] broj2 = new int[os2.length];

		// za prvu osobu
		for (int i = 0; i <= os1.length - 1; i++) {
			for (int j = 0; j <= os1.length - 1; j++) {
				if (osoba1.charAt(i) == os1[j]) {
					broj1[i] = broj1[i] + 1;
				}
			}
		}

		for (int i = 0; i <= os1.length - 1; i++) {
			for (int j = 0; j <= os2.length - 1; j++) {
				if (osoba1.charAt(i) == os2[j]) {
					broj1[i] = broj1[i] + 1;
				}
			}
		}

		// za drugu osobu
		for (int i = 0; i <= os2.length - 1; i++) {
			for (int j = 0; j <= os2.length - 1; j++) {
				if (osoba2.charAt(i) == os2[j]) {
					broj2[i] = broj2[i] + 1;
				}
			}
		}

		for (int i = 0; i <= os2.length - 1; i++) {
			for (int j = 0; j <= os1.length - 1; j++) {
				if (osoba2.charAt(i) == os1[j]) {
					broj2[i] = broj2[i] + 1;
				}
			}
		}

		System.out.println(Arrays.toString(broj1));
		System.out.println(Arrays.toString(broj2));

		int veci = broj1.length > broj2.length ? broj1.length : broj2.length;

		// Zbroj matrica osobe 1 i osobe 2
		int[] zbrojMatrica = new int[veci];

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
		int[] zbroj = new int[zbrojMatrica.length];

		for (int i = 0; i < zbrojMatrica.length; i++) {

			if (i < zbrojMatrica.length - 1 - i) {
				zbroj[i] = zbrojMatrica[i] + zbrojMatrica[zbrojMatrica.length - 1 - i];
			}

		}

		System.out.println(Arrays.toString(zbroj));

	}

}
