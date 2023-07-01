package Vjezbanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class V20LjubavniKalkulator {

	public static void main(String[] args) {

		String osoba1 = JOptionPane.showInputDialog("Unesi svoje ime");
		String osoba2 = JOptionPane.showInputDialog("Unesi ime svoje simpatije");

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

	}

}
