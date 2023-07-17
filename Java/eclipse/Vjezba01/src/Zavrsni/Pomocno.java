package Zavrsni;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;
	public static boolean dev;
	private static final String FORMAT_DATUMA = "dd.MM.yyyy.";
	private static SimpleDateFormat df = new SimpleDateFormat(FORMAT_DATUMA);

	public static int unosBroja(String poruka, String greska, int min, int max) {

		int i;

		while (true) {
			try {

				System.out.print(poruka);
				i = Integer.parseInt(ulaz.nextLine());
				if (i >= min && i <= max) {
					return i;
				}

				System.out.println(greska);

			} catch (Exception e) {
				System.out.println(greska);
			}

		}

	}

	public static String unosString(String poruka, String greska) {
		String s = "";
		while (true) {
			System.out.println(poruka);
			s = ulaz.nextLine();
			if (s.trim().length() > 0) {
				return s;
			}
			System.out.println(greska);

		}

	}

	public static double unosDouble(String poruka, String greska, double min, double max) {
		double i;
		while (true) {
			try {
				System.out.println(poruka);
				i = Double.parseDouble(ulaz.nextLine());
				if (i >= min && i < max) {
					return i;
				}
				System.out.println(greska);

			} catch (Exception e) {
				System.out.println(greska);
			}

		}

	}

	public static Date unosDatuma(String poruka) {
		while (true) {
			System.out.println(poruka);
			try {
				return df.parse(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println(
						"Datum unijeti na slijedeći način u formatu dd.mm.yyyy. npr. " + df.format(new Date()));
			}
		}
	}

	public static boolean unosBoolean(String poruka) {
		System.out.println(poruka);
		return ulaz.nextLine().trim().toLowerCase().equals("da") ? true : false;
	}

}
