package Zavrsni;

import java.util.ArrayList;
import java.util.List;

import Zavrsni.model.Kupac;

public class ObradaKupac {
	
	private List<Kupac> kupci;
	
	public ObradaKupac(){
		kupci = new ArrayList<>();
	}

	public void prikaziIzbornik() {
		System.out.println("Izbornik Kupci");
		System.out.println("1. Pregled postojećih kupaca");
		System.out.println("2. Unos novog kupca");
		System.out.println("3. Izmjena postojećeg kupca");
		System.out.println("4. Brisanje kupca");
		System.out.println("5. Povratak na prethodni izbornik");
		odabirStavkeIzbornika();		
	}

	private void odabirStavkeIzbornika() {
		
		switch(Pomocno.unosBroja("Unesi željenu stavku izbornika", "Obavezno 1-5", 1, 5)) {
		
		case 1:
			pregledKupaca();
			prikaziIzbornik();
			break;
			
		case 2:
			unosKupca();
			prikaziIzbornik();
			break;
		
		}
		
	}

	private void unosKupca() {
		Kupac k = new Kupac();
		
		k.setSifra(Pomocno.unosBroja("Unesi sifru kupca", "Sifra obavzna", 1, Integer.MAX_VALUE));
		k.setIme(Pomocno.unosString("Unesi ime kupca", "Ime obavezno"));
		k.setPrezime(Pomocno.unosString("Unesi prezime kupca", "Prezime obavezno"));
		k.setKontakt(Pomocno.unosString("Unesi kontakt kupca", "Kontakt obavezan"));
		kupci.add(k);
		
	}

	private void pregledKupaca() {
		if (kupci.isEmpty()) {
			System.out.println("Nema unesenog kupca");
		}
		
		for(Kupac k : kupci) {
			System.out.println(k.getIme() + " " + k.getPrezime());
		}
		
	}	

}
