package konzolnaAplikacija;

import java.util.ArrayList;
import java.util.List;


import konzolna.model.Djelatnik;
import konzolna.model.Kupac;
import konzolna.model.Proizvod;
import konzolna.model.Racun;

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
		System.out.println("\nIzbornik računi");
		System.out.println("1. Pregled računa");
		System.out.println("2. Unos novog računa");
		System.out.println("3. Izmjena postojećeg računa");
		System.out.println("4. Izbornik brisanje");
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

		case 3:
			izmjenaRacuna();
			prikaziIzbornik();
			break;

		case 4:
			izbornikBrisanje();
			prikaziIzbornik();
			break;

		case 5:
			break;

		}

	}

	private void izbornikBrisanje() {
		System.out.println("\nIzbornik brisanje");
		System.out.println("1. Brisanje postojećeg računa");
		System.out.println("2. Brisanje proizvoda na računu");
		System.out.println("3. Povratak na prethodni izbornik");
		odabirStavkeIzbornikaBrisanje();

	}

	private void odabirStavkeIzbornikaBrisanje() {
		switch (Pomocno.unosBroja("Odaberi stavku iz izbornika: ", "Obavezno 1-3", 1, 3)) {

		case 1:
			brisanjeRacuna();
			break;

		case 2:
			brisanjeProizvod();
			break;

		case 3:
			break;
		}

	}

	private void brisanjeProizvod() {
		boolean upit = Pomocno.unosBoolean(
				"Jeste li sigurni da želite obrisati jedan od proizvoda? (da za nastavak ili bilo što za odustajanje): ");
		if (upit) {
			if (racuni.isEmpty()) {
				System.out.println("\n*** Trenutno nije unesen niti jedan račun ***");
			} else {
				pregledRacuna();
				int indexRacuna = Pomocno.unosBroja("Odaberi račun sa kojeg želiš obrisati proizvod: ", "Greška", 1,
						racuni.size());
				Racun g = racuni.get(indexRacuna - 1);
				if (g.getProizvodi().isEmpty()) {
					System.out.println("\n*** Trenutno nema niti jednog proizvoda na računu ***");
				} else {
					System.out.println("----------------------------");
					System.out.println("---- Trenutni proizvodi ----");
					System.out.println("----------------------------");
					int b = 1;
					for (Proizvod p : g.getProizvodi()) {
						System.out.println(b++ + ". " + p.getNaziv());
					}
					System.out.println("----------------------------");
					int indexProizvoda = Pomocno.unosBroja("Odaberi proizvod koji želiš obrisati: ", "Greška", 1,
							g.getProizvodi().size());
					g.getProizvodi().remove(indexProizvoda - 1);
				}
			}
		}
	}

	private void brisanjeRacuna() {
		boolean upit = Pomocno.unosBoolean(
				"Jeste li sigurni da želite obrisati račun? (da za nastavak ili bilo što za odustajanje): ");
		if (upit) {
			if (racuni.isEmpty()) {
				System.out.println("--------------------");
				System.out.println("*** Nema unesenih računa ***");
				System.out.println("--------------------");
			} else {
				pregledRacuna();
				int index = Pomocno.unosBroja("Odaberi račun koji želite obrisati: ", "Greška", 1, racuni.size());
				racuni.remove(index - 1);
			}
		}
	}

	private void izmjenaRacuna() {
		boolean upit = Pomocno.unosBoolean(
				"Jeste li sigurni da želite izmjeniti račun? (da za nastavak ili bilo što za odustajanje): ");
		if (upit) {
			if (racuni.isEmpty()) {
				System.out.println("--------------------");
				System.out.println("Nema unesenih računa");
				System.out.println("--------------------");
			} else {
				pregledRacuna();
				int index = Pomocno.unosBroja("Odaberi račun za izmjenu: ", "Greška", 1, racuni.size());
				Racun r = racuni.get(index - 1);
				r.setSifra(Pomocno.unosSifreRacuna(racuni));
				r.setVrijemeKupovine(Pomocno.unosDatuma("Unesi vrijeme kupovine u formatu dd.mm.yyyy. : "));
				r.setBrojRacuna(Pomocno.unosString("Unesi broj računa: ", "Greška"));
				r.setNacinPlacanja(Pomocno.unosString("Unesi način plaćanja: ", "Greška"));
				System.out.println("Trenutni kupac: " + r.getKupac().getIme() + " " + r.getKupac().getPrezime());
				r.setKupac(postaviKupca());
				System.out.println(
						"Trenutni djelatnik: " + r.getDjelatnik().getIme() + " " + r.getDjelatnik().getPrezime());
				r.setDjelatnik(postaviDjelatnika());
				System.out.println("-------------------------");
				System.out.println("---- Trenutni Računi ----");
				System.out.println("-------------------------");

				if (r.getProizvodi().isEmpty()) {
					System.out.println("Nema unesenih proizvoda");
					r.setProizvodi(postaviProizvode());
				}

				int b = 1;
				for (Proizvod p : r.getProizvodi()) {
					System.out.println(b++ + ". " + p.getNaziv());
				}
				r.setProizvodi(postaviProizvode());
			}
		}
	}

	private void unosRacuna() {
		Racun r = new Racun();
		r.setSifra(Pomocno.unosSifreRacuna(racuni));
		r.setVrijemeKupovine(Pomocno.unosDatuma("Unesi vrijeme kupovine u formatu dd.mm.yyyy. : "));
		r.setBrojRacuna(Pomocno.unosString("Unesi broj računa: ", "Greška"));
		r.setNacinPlacanja(Pomocno.unosString("Unesi način plaćanja: ", "Greška"));
		r.setKupac(postaviKupca());
		r.setDjelatnik(postaviDjelatnika());
		r.setProizvodi(postaviProizvode());
		racuni.add(r);

	}

	private List<Proizvod> postaviProizvode() {
		List<Proizvod> proizvodi = new ArrayList<>();
		while (Pomocno.unosBoolean("Želite li dodati proizvod? (da ili bilo što za ne: ")) {
			proizvodi.add(postaviProizvod());
		}
		return proizvodi;
	}

	private Proizvod postaviProizvod() {
		izbornik.getObradaProizvod().pregledProizvoda();
		int index = Pomocno.unosBroja("Odaberi željeni proizvod: ", "Greška", 1,
				izbornik.getObradaProizvod().getProizvodi().size());
		return izbornik.getObradaProizvod().getProizvodi().get(index - 1);
	}

	private Djelatnik postaviDjelatnika() {
		izbornik.getObradaDjelatnik().pregledDjelatnika();
		int index = Pomocno.unosBroja("Odaberi željenog djelatnika: ", "Greška", 1,
				izbornik.getObradaDjelatnik().getDjelatnici().size());
		return izbornik.getObradaDjelatnik().getDjelatnici().get(index - 1);
	}

	private Kupac postaviKupca() {
		izbornik.getObradaKupac().pregledKupaca();
		;
		int index = Pomocno.unosBroja("Odaberi željenog kupca: ", "Greška", 1,
				izbornik.getObradaKupac().getKupci().size());
		return izbornik.getObradaKupac().getKupci().get(index - 1);
	}

	private void pregledRacuna() {
		System.out.println("----------------");
		System.out.println("---- Računi ----");
		System.out.println("----------------");

		if (racuni.isEmpty()) {
			System.out.println("\n*** Nema unesenih računa ***");
		}

		int b = 1;
		for (Racun r : racuni) {
			System.out.println(b++ + ". " + r.getBrojRacuna());
		}

		System.out.println("----------------");
	}

}
