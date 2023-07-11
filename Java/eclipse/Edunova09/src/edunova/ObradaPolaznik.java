package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Polaznik;

public class ObradaPolaznik {
	
	private List<Polaznik> polaznici;
	
	public ObradaPolaznik() {
		polaznici = new ArrayList<>();
	}
	

	public void prikaziIzbornik() {
		System.out.println("Polaznici");
		System.out.println("1. Pregled postojećih polaznika");
		System.out.println("2. Unos novog polaznika");
		System.out.println("3. Promjena postojećeg polaznika");
		System.out.println("4. Brisanje postojećeg polaznika");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
		
	}


	private void ucitajStavkuIzbornika() {
		switch(Pomocno.unosRasponBroja("Odaberi stavku polaznik izbornika", "Obavezno 1-5", 1, 5)) {
		
		case 1:
			pregledPolaznika();
			prikaziIzbornik();
			break;
			
		case 2:
			unosPolaznika();
			prikaziIzbornik();
			break;
		
		case 5:
			break;
		}
		
	}


	private void unosPolaznika() {
		Polaznik p = new Polaznik();
		
		p.setIme(Pomocno.unosString("Unesi ime polaznika", "Ime obavezno"));
		p.setPrezime(Pomocno.unosString("Unesi prezime polaznika", "Prezime obavezno"));
		polaznici.add(p);
		
	}


	private void pregledPolaznika() {
		for (Polaznik p : polaznici) {
			System.out.println(p);
		}
		
	}
	

}
