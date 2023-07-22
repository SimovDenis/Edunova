package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Smjer;

public class ObradaSmjer {

	private List<Smjer> smjerovi;

	public List<Smjer> getSmjerovi() {
		return smjerovi;
	}

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
		System.out.println("\nSmjer izbornik");
		System.out.println("1. Pregled postojećih smjerova");
		System.out.println("2. Dodavanje novog smjera");
		System.out.println("3. Promjena postojećeg smjera");
		System.out.println("4. Brisanje postojećeg smjera");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		switch (Pomocno.unosRasponBroja("Odaberi stavku smjer izbornika: ", "Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledSmjerova();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjeSmjera();
			prikaziIzbornik();
			break;
		case 3:
			promjenaSmjera();
			prikaziIzbornik();
			break;
		case 4:
			brisanjeSmjera();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
	}

	public void pregledSmjerova() {
		System.out.println("------------------");
		System.out.println("---- Smjerovi ----");
		System.out.println("------------------");
		int b = 1;
		for (Smjer s : smjerovi) {
			System.out.println(b++ + ". " + s.getNaziv());
		}
		System.out.println("------------------");

	}

	private void dodavanjeSmjera() {
		Smjer s = new Smjer();
		s.setSifra(Pomocno.unosSifreSmjera(smjerovi));
		s.setNaziv(Pomocno.unosString("Unesi naziv smjera: ", "Naziv obavezan"));
		s.setTrajanje(Pomocno.unosRasponBroja("Unesi trajanje smjera: ", "Broj između 30 i 360", 30, 360));
		s.setCijena(Pomocno.unosFloat("Unesi cijenu smjera (. za decimalni dio): ", "Greška kod unosa"));
		s.setUpisnina(Pomocno.unosFloat("Unesi upisninu smjera (. za decimalni dio): ", "Greška kod unosa"));
		s.setVerificiran(Pomocno.unosBoolean("Smjer verificiran (da) ili bilo što drugo za ne"));
		smjerovi.add(s);

	}

	private void promjenaSmjera() {
		boolean upit = Pomocno.unosBoolean(
				"Jeste li sigurni da želite promijeniti jedan od smjerova? (da za nastavak ili bilo što za odustajanje): ");
		if (upit) {
			if (smjerovi.isEmpty()) {
				System.out.println("\n*** Trenutno nije unesen niti jedan smjer ***");
			} else {
				pregledSmjerova();
				int index = Pomocno.unosRasponBroja("Odaberi redni broj smjera: ", "Nije dobar odabir", 1, smjerovi.size());
				Smjer s = smjerovi.get(index - 1);
				s.setSifra(Pomocno.unosSifreSmjera(smjerovi));
				s.setNaziv(Pomocno.unosString("Unesi naziv smjera (" + s.getNaziv() + "): ", "Naziv obavezan"));
				s.setTrajanje(Pomocno.unosRasponBroja("Unesi trajanje smjera (" + s.getTrajanje() + "): ",
						"Broj između 30 i 360", 30, 360));
				s.setCijena(Pomocno.unosFloat("Unesi cijenu smjera (. za decimalni dio) (" + s.getCijena() + "): ",
						"Greška kod unosa"));
				s.setUpisnina(Pomocno.unosFloat("Unesi upisninu smjera (. za decimalni dio) (" + s.getUpisnina() + "): ",
						"Greška kod unosa"));
				s.setVerificiran(Pomocno.unosBoolean(
						"Smjer verificiran (da) ili bilo što drugo za ne (" + (s.isVerificiran() ? "da" : "ne") + "): "));
			}
		}		
	}

	private void brisanjeSmjera() {
		boolean upit = Pomocno.unosBoolean(
				"Jeste li sigurni da želite obrisati jedan od smjerova? (da za nastavak ili bilo što za odustajanje): ");
		if (upit) {
			if (smjerovi.isEmpty()) {
				System.out.println("\n*** Trenutno nije unesen niti jedan smjer ***");
			} else {
				pregledSmjerova();
				int index = Pomocno.unosRasponBroja("Odaberi redni broj smjera: ", "Nije dobar odabir", 1, smjerovi.size());
				smjerovi.remove(index - 1);
			}
		}
	}
}
