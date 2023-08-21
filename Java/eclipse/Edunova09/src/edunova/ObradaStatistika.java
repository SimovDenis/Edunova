package edunova;

import edunova.model.Grupa;

public class ObradaStatistika {
	
	private ObradaGrupa obradaGrupa;
	

	public ObradaStatistika(ObradaGrupa obradaGrupa) {
	super();
	this.obradaGrupa = obradaGrupa;
	}

	public ObradaStatistika() {
		super();
	}

	public void prikaziIzbornik() {
		System.out.println("\nStatistika izbornik");
		System.out.println("1. Ukupno polaznika na grupi");
//		System.out.println("2. Prosječan broj polaznika u grupi");
//		System.out.println("3. Ukupan iznos prihoda po smjerovima");
//		System.out.println("4. Prosječan iznos prihoda po polazniku");
//		System.out.println("5. Najraniji i najkasniji početak grupe uz ispis razlike broja dana između ta dva datuma");
		System.out.println("6. Povratak na prehodni izbornik");
		ucitajStavkuIzbornika();		
	}

	private void ucitajStavkuIzbornika() {
		switch(Pomocno.unosRasponBroja("Odaberi stavku izbornika: ", "Obavezno 1-6", 1, 6)) {
		case 1:
			ukupnoPolaznika();
			prikaziIzbornik();
			break;
			
//		case 2:
//			prosjecnoPolaznika();
//			prikaziIzbornik();
//			break;
			
		case 6:
			break;
		}
		
	}

//	private void prosjecnoPolaznika() {
//		if (obradaGrupa.getGrupe().isEmpty()) {
//			System.out.println("\n*** Trenutno nije unesena niti jedna grupa ***");
//		} else {
//			int brojGrupa = obradaGrupa.getGrupe().size();
//			int brojPolanika = obradaPolaznik.getPolaznici().size();
//			System.out.println("Prosječan broj polaznika po grupama je " + brojPolanika/brojGrupa);
//		}
//		
//	}

	private void ukupnoPolaznika() {
		if (obradaGrupa.getGrupe().isEmpty()) {
			System.out.println("\n*** Trenutno nije unesena niti jedna grupa ***");
		} else {
			System.out.println("\nTrenutno polaznika na odabranoj grupi je " + odabirGrupe().getPolaznici().size());
		}
		
	}

	private Grupa odabirGrupe() {	
			obradaGrupa.pregledGrupa();
			int index = Pomocno.unosRasponBroja("Odaberi grupu: ", "Greška", 1, obradaGrupa.getGrupe().size());
			return obradaGrupa.getGrupe().get(index - 1);
		}				
	}
