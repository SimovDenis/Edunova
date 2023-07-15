package Zavrsni;

import java.util.ArrayList;
import java.util.List;

import Zavrsni.model.Djelatnik;

public class ObradaDjelatnik {

	private List<Djelatnik> djelatnici;

	public List<Djelatnik> getDjelatnici() {
		return djelatnici;
	}

	public ObradaDjelatnik() {
		djelatnici = new ArrayList<>();
		if (Pomocno.dev) {
			testniPodaci();
		}
	}

	private void testniPodaci() {
		djelatnici.add(new Djelatnik(1, "Matija", "Ivić", "5433/2020", "HR7023600004786996737", "031/662-884"));
		djelatnici.add(new Djelatnik(2, "Andreja", "Gan", "2490/2019", "HR5624020067519674536", "099 455 8900"));
		djelatnici.add(new Djelatnik(3, "Ingrid", "Jurić", "1227/2014", "HR6925000091988982169", "ijuric88@gmail.com"));

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

		case 3:
			izmjenaDjelatnika();
			prikaziIzbornik();
			break;

		case 4:
			brisanjeDjelatnika();
			prikaziIzbornik();
			break;

		case 5:
			break;
		}

	}

	private void brisanjeDjelatnika() {
		pregledDjelatnika();
		int index = Pomocno.unosBroja("Unesite šifru djelatnika kojeg želite obrisati: ", "Neispravna šifra", 1, djelatnici.size());
		djelatnici.remove(index - 1);

	}

	private void izmjenaDjelatnika() {
		pregledDjelatnika();
		int index = Pomocno.unosBroja("Unesi šifru djelatnika kojeg želite izmjeniti: ", "Šifra nije dobra, pokušaj ponovno", 1, djelatnici.size());
		Djelatnik d = djelatnici.get(index - 1);
		d.setSifra(Pomocno.unosBroja("Unesi šifru djelatnika (trenutna šifra: " + d.getSifra() + "): ", "Greška", 1, Integer.MAX_VALUE));
		d.setIme(Pomocno.unosString("Unesi ime djelatnika" + "(trenutno ime: " + d.getIme() + "): ", "Ime obavezno"));
		d.setPrezime(Pomocno.unosString("Unesi prezime djelatnika(trenutno prezime: " + d.getPrezime() + "): ", "Obavezno unijeti prezime"));
		d.setBrojUgovora(Pomocno.unosString("Unesi broj ugovora djelatnika(trenutni broj ugovora: " + d.getBrojUgovora() + "): ", "Obavezno unijeti broj ugovora"));
		d.setIban(Pomocno.unosString("Unesi iban djelatnika(trenutni iban: " + d.getIban() + "): ", "Obavezno unijeti iban djelatnika"));
		d.setKontakt(Pomocno.unosString("Unesi kontakt djelatnika(trenutni kontakt: " + d.getKontakt() + "): ", "Obavezno unijeti kontakt"));
	}

	private void unosDjelatnika() {
		Djelatnik d = new Djelatnik();

		d.setSifra(Pomocno.unosBroja("Unesi sifru djelatnika: ", "Unesi pozitivan broj", 1, Integer.MAX_VALUE));
		d.setIme(Pomocno.unosString("Unesi ime djelatnika: ", "Obavezno unijeti ime"));
		d.setPrezime(Pomocno.unosString("Unesi prezime djelatnika: ", "Obavezno unijeti prezime"));
		d.setBrojUgovora(Pomocno.unosString("Unesi broj ugovora djelatnika", "Obavezno unijeti broj ugovora"));
		d.setIban(Pomocno.unosString("Unesi iban djelatnika", "Obavezno unijeti iban djelatnika"));
		d.setKontakt(Pomocno.unosString("Unesi kontakt korisnika", "Obavezno unijeti kontakt"));
		djelatnici.add(d);

	}

	private void pregledDjelatnika() {
		System.out.println("----------------------");
		System.out.println("----- Djelatnici -----");
		System.out.println("----------------------");

		if (djelatnici.isEmpty()) {
			System.out.println("Nema unesenog djelatnika");
		}

		int b = 1;
		for (Djelatnik d : djelatnici) {
			System.out.println(b++ + ". " + d.getIme() + " " + d.getPrezime());

		}

		System.out.println("----------------------");

	}

}
