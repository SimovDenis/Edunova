package konzolnaAplikacija;

import java.util.ArrayList;
import java.util.List;

import konzolna.model.Proizvod;

public class ObradaProizvod {

	private List<Proizvod> proizvodi;

	public List<Proizvod> getProizvodi() {
		return proizvodi;
	}

	public ObradaProizvod() {
		proizvodi = new ArrayList<>();
		if (Pomocno.dev) {
			testniPodaci();
		}
	}

	private void testniPodaci() {
		proizvodi.add(new Proizvod(1, "BMW R1250GS", 20832.16, 10));
		proizvodi.add(new Proizvod(2, "Dainese kožne rukavice", 69.99, 2));
		proizvodi.add(new Proizvod(3, "Kawasaki Vulcan 900 Classic", 10429.99, 3));
	}

	public void prikaziIzbornik() {
		System.out.println("\nIzbornik proizvodi");
		System.out.println("1. Prikaži proizvode");
		System.out.println("2. Unesi novi proizvod");
		System.out.println("3. Izmjeni postjeći proizvod");
		System.out.println("4. Obriši proizvod");
		System.out.println("5. Povratak na prethodni izbornik");
		odabirStavkeIzbornika();

	}

	private void odabirStavkeIzbornika() {
		switch (Pomocno.unosBroja("Udaberi stavku izbornika: ", "Obavezno 1-5", 1, 5)) {

		case 1:
			pregledProizvoda();
			prikaziIzbornik();
			break;

		case 2:
			unosProizvoda();
			prikaziIzbornik();
			break;

		case 3:
			izmjenaProizvoda();
			prikaziIzbornik();
			break;

		case 4:
			brisanjeProizvoda();
			prikaziIzbornik();
			break;

		case 5:
			break;

		}

	}

	private void brisanjeProizvoda() {
		if (proizvodi.isEmpty()) {
			System.out.println("\n*** Trenutno nije unesen niti jedan proizvod ***");
		} else {
			boolean upit = Pomocno.unosBoolean(
					"Jeste li sigurni da želite obrisati proizvod? (da za nastavak ili bilo što za odustajanje): ");
			if (upit) {
				pregledProizvoda();
				int index = Pomocno.unosBroja("Odaberi proizvod za brisanje: ", "Greška", 1, proizvodi.size());
				proizvodi.remove(index - 1);
			}
		}				
	}

	private void izmjenaProizvoda() {
		if (proizvodi.isEmpty()) {
			System.out.println("\n*** Trenutno nije unesen niti jedan proizvod ***");
		} else {
			boolean upit = Pomocno.unosBoolean(
					"Jeste li sigurni da želite izmjeniti proizvod? (da za nastavak ili bilo što za odustajanje): ");
			if (upit) {
				pregledProizvoda();
				int index = Pomocno.unosBroja("Odaberi proizvod za izmjenu: ", "Greška", 1, proizvodi.size());
				Proizvod p = proizvodi.get(index - 1);
				p.setSifra(Pomocno.unosSifreProizvoda(proizvodi));
				p.setNaziv(Pomocno.unosString("Unesi naziv proizvoda(trenutni naziv proizvoda: " + p.getNaziv() + "): ","Greška"));
				p.setCijena(Pomocno.unosDouble("Unesi cijenu proizvoda(trenutna cijena proizvoda: " + p.getCijena() + "): ","Greška", 1, Double.MAX_VALUE));
				p.setGarancija(Pomocno.unosDouble("Unesi duljinu trajanja garancije(trenutno trajanje garnacije: " + p.getGarancija() + "): ", "Greška",0,Double.MAX_VALUE));
			}
		}				
	}

	private void unosProizvoda() {
		Proizvod p = new Proizvod();
		p.setSifra(Pomocno.unosSifreProizvoda(proizvodi));
		p.setNaziv(Pomocno.unosString("Unesi ime proizvoda: ", "Greška"));
		p.setCijena(Pomocno.unosDouble("Unesi cijenu proizvoda: ", "Greška", 1, Double.MAX_VALUE));
		p.setGarancija(Pomocno.unosDouble("Unesi duljinu trajanja garancije: ", "Greška", 0, Double.MAX_VALUE));
		proizvodi.add(p);

	}

	public void pregledProizvoda() {
		System.out.println("---------------------");
		System.out.println("----- Proizvodi -----");
		System.out.println("---------------------");
		if (proizvodi.isEmpty()) {
			System.out.println("\n *** Nema unesenih proizvoda ***");
		}

		int b = 1;
		for (Proizvod p : proizvodi) {
			System.out.println(b++ + ". " + p.getNaziv());
		}

		System.out.println("---------------------");

	}

}
