package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Smjer;

public class ObradaSmjer {

	private List<Smjer> smjerovi;

	public ObradaSmjer() {
		smjerovi = new ArrayList<>();
		if (Pomocno.dev) {
			testniPodaci();
		}
	}

	private void testniPodaci() {
		smjerovi.add(new Smjer(1, "Java programiranje", 100, 100, 100, true));
		smjerovi.add(new Smjer(2, "Web programiranje", 100, 100, 100, true));
		smjerovi.add(new Smjer(3, "Web dizajn", 100, 100, 100, true));

	}

	public void prikaziIzbornik() {
		System.out.println("Smjerovi");
		System.out.println("1. Pregled postojećih smjerova");
		System.out.println("2. Unos novog smjera");
		System.out.println("3. Promjena postojećeg smjera");
		System.out.println("4. Brisanje postojećeg smjera");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();

	}

	private void ucitajStavkuIzbornika() {

		switch (Pomocno.unosRasponBroja("Odaberi stavku smjer izbornika: ", "Obavezno 1-5", 1, 5)) {

		case 1:
			pregledSmjerova();
			prikaziIzbornik();
			break;

		case 2:
			dodavanjeSmjera();
			prikaziIzbornik();

		case 5:
			break;

		}

	}

	private void dodavanjeSmjera() {
		Smjer s = new Smjer();

		s.setSifra(Pomocno.unosRasponBroja("Unesi sifru smjera: ", "Unesi pozitivan broj", 1, Integer.MAX_VALUE));
		s.setNaziv(Pomocno.unosString("Unesi naziv smjera: ", "Naziv obavezan"));
		s.setTrajanje(Pomocno.unosRasponBroja("Unesi trajanje smjera: ", "Trajanje između 30 i 300", 30, 300));
		smjerovi.add(s);

	}

	private void pregledSmjerova() {
		for (Smjer s : smjerovi) {
			System.out.println(s.getNaziv());
		}

	}

}
