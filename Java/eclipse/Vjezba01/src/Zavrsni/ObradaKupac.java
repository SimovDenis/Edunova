package Zavrsni;

import java.util.ArrayList;
import java.util.List;

import Zavrsni.model.Kupac;

public class ObradaKupac {
	
	private List<Kupac> kupci;
	
	public ObradaKupac(){
		kupci = new ArrayList<>();
		if(Pomocno.dev) {
			testniPodaci();
		}
	}

	private void testniPodaci() {
		kupci.add(new Kupac(1, "Indira", "Sopnik", "indira2023@gmail.com"));
		kupci.add(new Kupac(2, "Martin", "Anzek", "01/555-286"));
		kupci.add(new Kupac(3, "Anita", "Zima", "zima.22@yahoo.com"));
		
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
			
		case 3:
			izmjenaKupca();
			prikaziIzbornik();
			break;
			
		case 4:
			brisanjeKupca();
			prikaziIzbornik();
			break;
			
		case 5:
			break;
		
		}
		
	}

	private void brisanjeKupca() {
		pregledKupaca();
		int index = Pomocno.unosBroja("Odaberi kupca za brisanje", "Greska", 1, kupci.size());
		kupci.remove(index-1);
		
	}

	private void izmjenaKupca() {
		pregledKupaca();
		int index = Pomocno.unosBroja("Odaberi kupca za izmjenu", "Odabrani kupac ne postoji", 1, kupci.size());
		Kupac k = kupci.get(index - 1);
		k.setSifra(Pomocno.unosBroja("Unesi šifru kupca(trenutna šifra: " + k.getSifra() + "): ", "Greška", 1, Integer.MAX_VALUE));
		k.setIme(Pomocno.unosString("Unesi ime kupca(trenutno ime kupca: " + k.getIme() + "): ", "Greška"));
		k.setPrezime(Pomocno.unosString("Unesi ime kupca(trenutno prezime kupca: " + k.getPrezime() + "): ", "Greška"));
		k.setKontakt(Pomocno.unosString("Unesi ime kupca(trenutni kontakt kupca: " + k.getKontakt() + "): ", "Greška"));
		
		
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
		System.out.println("-----------------");
		System.out.println("----- Kupci -----");
		System.out.println("-----------------");
		if (kupci.isEmpty()) {
			System.out.println("Nema unesenog kupca");
		}
		
		int b = 1;
		for(Kupac k : kupci) {
			
			System.out.println(b++ + ". " + k.getIme() + " " + k.getPrezime());
		}
		
		System.out.println("-----------------");
		
	}	

}
