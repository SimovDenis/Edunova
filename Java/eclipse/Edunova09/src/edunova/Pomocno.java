package edunova;

import java.util.Scanner;

import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Pomocno {

	public static Scanner ulaz;
	public static boolean dev;
	// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
	public static final String FORMAT_DATUMA = "dd. MM. yyyy.";
	public static SimpleDateFormat df = new SimpleDateFormat(FORMAT_DATUMA);

	public static int unosRasponBroja(String poruka, String greska, int min, int max) {
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
	
	public static int unosSifreSmjera(List<Smjer> smjerovi) {
		while (true) {
			int sifra = Pomocno.unosRasponBroja("Unesi šifru smjera: ", "Greška", 1, Integer.MAX_VALUE);
			boolean provjera = true;
			for (int i = 0; i < smjerovi.size(); i++) {
				if (smjerovi.get(i).getSifra() == sifra) {
					System.out.println("Šifra " + sifra + " već postoji. Unesite drugu šifru.");
					provjera = false;
				}
			}
			if (provjera) {
				return sifra;				
			}
		}	
	}
	
	public static int unosSifreGrupe(List<Grupa> grupe) {
		while (true) {
			int sifra = Pomocno.unosRasponBroja("Unesi šifru grupe: ", "Greška", 1, Integer.MAX_VALUE);
			boolean provjera = true;
			for (int i = 0; i < grupe.size(); i++) {
				if (grupe.get(i).getSifra() == sifra) {
					System.out.println("Šifra " + sifra + " već postoji. Unesite drugu šifru.");
					provjera = false;
				}
			}
			if (provjera) {
				return sifra;				
			}
		}	
	}
	
	public static int unosSifrePolaznika(List<Polaznik> polaznici) {
		while (true) {
			int sifra = Pomocno.unosRasponBroja("Unesi šifru polaznika: ", "Greška", 1, Integer.MAX_VALUE);
			boolean provjera = true;
			for (int i = 0; i < polaznici.size(); i++) {
				if (polaznici.get(i).getSifra() == sifra) {
					System.out.println("Šifra " + sifra + " već postoji. Unesite drugu šifru.");
					provjera = false;
				}
			}
			if (provjera) {
				return sifra;				
			}
		}	
	}
	
	public static int unosSifrePredavac(List<Predavac> predavaci) {
		while (true) {
			int sifra = Pomocno.unosRasponBroja("Unesi šifru predavača: ", "Greška", 1, Integer.MAX_VALUE);
			boolean provjera = true;
			for (int i = 0; i < predavaci.size(); i++) {
				if (predavaci.get(i).getSifra() == sifra) {
					System.out.println("Šifra " + sifra + " već postoji. Unesite drugu šifru.");
					provjera = false;
				}
			}
			if (provjera) {
				return sifra;				
			}
		}	
	}

	public static String unosString(String poruka, String greska) {
		String s = "";
		while (true) {
			System.out.print(poruka);
			s = ulaz.nextLine();
			if (s.trim().length() > 0) {
				return s;
			}
			System.out.println(greska);
		}
	}

	public static float unosFloat(String poruka, String greska) {
		while (true) {
			try {
				System.out.print(poruka);
				return Float.parseFloat(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println(greska);
			}
		}

	}

	public static boolean unosBoolean(String poruka) {

		System.out.print(poruka);
		return ulaz.nextLine().trim().toLowerCase().equals("da") ? true : false;

	}

	public static Date unosDatum(String poruka) {
		while (true) {
			try {
				System.out.print(poruka);
				return df.parse(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Obavezan unos datuma u formatu " + FORMAT_DATUMA + ", npr. " + df.format(new Date())
						+ " za danas.");
			}
		}

	}

}
