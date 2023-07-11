package Zavrsni;

import java.util.Scanner;

public class Izbornik {

	private ObradaDjelatnik obradadjelatnik;

	public Izbornik() {
		obradadjelatnik = new ObradaDjelatnik();
		Pomocno.ulaz = new Scanner(System.in);
		pozdravnaPoruka();
		prikaziIzbornik();
		Pomocno.ulaz.close();
	}

	private void pozdravnaPoruka() {
		System.out.println("*************************************");
		System.out.println("*** Moto trgovina Console OOP APP ***");
		System.out.println("*************************************");
	}

	private void prikaziIzbornik() {

		System.out.println("Glavni izbornik");
		System.out.println("1. Djelatnici");
		System.out.println("2. Kupci");
		System.out.println("3. Proizvodi");
		System.out.println("4. Racuni");
		System.out.println("5. Izlaz");
		odabirStavkeIzbornika();

	}

	private void odabirStavkeIzbornika() {

		switch (Pomocno.unosBroja("Odaberi željenu opciju", "Odabir mora biti 1-5", 1, 5)) {

		case 1:
			obradadjelatnik.prikaziIzbornik();
			prikaziIzbornik();
			break;

		case 2:
			System.out.println("Kupci");
			prikaziIzbornik();
			break;

		case 3:
			System.out.println("Proizvodi");
			prikaziIzbornik();
			break;

		case 4:
			System.out.println("Racuni");
			prikaziIzbornik();
			break;

		case 5:
			System.out.println("Doviđenja!");
			break;

		}

	}

}
