package Zavrsni;

import java.util.ArrayList;
import java.util.List;

import Zavrsni.model.Djelatnik;

public class ObradaDjelatnik {

	private List<Djelatnik> djelatnici;

	public ObradaDjelatnik() {
		djelatnici = new ArrayList<>();
	}

	public void prikaziIzbornik() {
		System.out.println("Izbornik Djelatnik");
		System.out.println("1. Pregled djelatnika");
		System.out.println("2. Unos novog djelatnika");
		System.out.println("3. Izmjena postojećeg djelatnika");
		System.out.println("4. Brisanje postojećeg djelantika");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {

		switch (Pomocno.unosBroja("Odaberi željenu akciju", "Odabir mora biti 1-5", 1, 5)) {

		case 1:
			pregledDjelatnika();
			prikaziIzbornik();
			break;

		case 2:
			unosDjelatnika();
			prikaziIzbornik();
			break;

		case 5:
			break;
		}

	}

	private void unosDjelatnika() {
		Djelatnik d = new Djelatnik();

		d.setSifra(Pomocno.unosBroja("Unesi sifru djelatnika: ", "Unesi pozitivan broj", 1, Integer.MAX_VALUE));
		d.setIme(Pomocno.unosString("Unesi ime djelatnika: ", "Obavezno unijeti ime"));
		d.setPrezime(Pomocno.unosString("Unesi prezime djelatnika: ", "Obavezno unijeti prezime"));
//		d.setBrojUgovora(Pomocno.unosString("Unesi broj ugovora djelatnika", "Obavezno unijeti broj ugovora"));
//		d.setIban(Pomocno.unosString("Unesi iban djelatnika", "Obavezno unijeti iban djelatnika"));
//		d.setKontakt(Pomocno.unosString("Unesi kontakt korisnika", "Obavezno unijeti kontakt"));
		djelatnici.add(d);

	}

	private void pregledDjelatnika() {

		if (djelatnici.isEmpty()) {
			System.out.println("Nema unesenog djelatnika");
		}

		for (Djelatnik d : djelatnici) {
			System.out.println(d.getIme() + " " + d.getPrezime());

		}

	}

}
