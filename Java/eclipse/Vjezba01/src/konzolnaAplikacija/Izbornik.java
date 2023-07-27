package konzolnaAplikacija;

import java.util.Scanner;

public class Izbornik {

	private ObradaDjelatnik obradaDjelatnik;
	private ObradaKupac obradaKupac;
	private ObradaProizvod obradaProizvod;
	private ObradaRacun obradaRacun;

	public Izbornik() {
		obradaDjelatnik = new ObradaDjelatnik();
		obradaKupac = new ObradaKupac();
		obradaProizvod = new ObradaProizvod();
		obradaRacun = new ObradaRacun(this);
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

		System.out.println("\nGlavni izbornik");
		System.out.println("1. Djelatnici");
		System.out.println("2. Kupci");
		System.out.println("3. Proizvodi");
		System.out.println("4. Računi");
		System.out.println("5. Izlaz");
		odabirStavkeIzbornika();

	}

	private void odabirStavkeIzbornika() {

		switch (Pomocno.unosBroja("Odaberi željenu opciju: ", "Odabir mora biti 1-5", 1, 5)) {

		case 1:
			obradaDjelatnik.prikaziIzbornik();
			prikaziIzbornik();
			break;

		case 2:
			obradaKupac.prikaziIzbornik();
			prikaziIzbornik();
			break;

		case 3:
			obradaProizvod.prikaziIzbornik();
			prikaziIzbornik();
			break;

		case 4:
			obradaRacun.prikaziIzbornik();
			prikaziIzbornik();
			break;

		case 5:
			System.out.println("Doviđenja!");
			break;

		}

	}

	public ObradaDjelatnik getObradaDjelatnik() {
		return obradaDjelatnik;
	}

	public ObradaKupac getObradaKupac() {
		return obradaKupac;
	}

	public ObradaProizvod getObradaProizvod() {
		return obradaProizvod;
	}

}
