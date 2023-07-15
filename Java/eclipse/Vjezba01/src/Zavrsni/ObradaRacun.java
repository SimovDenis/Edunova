package Zavrsni;

import java.util.ArrayList;
import java.util.List;

import Zavrsni.model.Kupac;
import Zavrsni.model.Racun;

public class ObradaRacun {

	private List<Racun> racuni;
	private Izbornik izbornik;

	public ObradaRacun() {
		racuni = new ArrayList<>();
	}

	public ObradaRacun(Izbornik izbornik) {
		this();
		this.izbornik = izbornik;
	}

	public void prikaziIzbornik() {
		System.out.println("Izbornik računi");
		System.out.println("1. Pregled računa");
		System.out.println("2. Unos novog računa");
		System.out.println("3. Izmjena postojećeg računa");
		System.out.println("4. Brisanje računa");
		System.out.println("5. Povratak na prethodni izbornik");
		odabirStavkeIzbornika();

	}

	private void odabirStavkeIzbornika() {
		switch (Pomocno.unosBroja("Odaberi stavku izbornika: ", "Greška", 1, 5)) {

		case 1:
			pregledRacuna();
			prikaziIzbornik();
			break;

		case 2:
			unosRacuna();
			prikaziIzbornik();
			break;

		}

	}

	private void unosRacuna() {
		Racun r = new Racun();
		r.setSifra(Pomocno.unosBroja("Unesi šifru računa: ", "Mora biti cijeli pozitivan broj", 1, Integer.MAX_VALUE));
		r.setVrijemeKupovine(Pomocno.unosDatuma("Unesi vrijeme kupovine u formatu dd.mm.yyyy. : "));
		r.setBrojRacuna(Pomocno.unosString("Unesi broj računa: ", "Greška"));
		r.setNacinPlacanja(Pomocno.unosString("Unesi način plaćanja: ", "Greška"));
//		r.setKupac(postaviKupca());
//		racuni.add(r);

	}

	private void pregledRacuna() {
		System.out.println("----------------");
		System.out.println("---- Računi ----");
		System.out.println("----------------");

		if (racuni.isEmpty()) {
			System.out.println("Nema unesenih računa");
		}

		int b = 1;
		for (Racun r : racuni) {
			System.out.println(b++ + ". " + r.getBrojRacuna());
		}

		System.out.println("----------------");
	}

}
