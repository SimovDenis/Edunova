package edunova;

public class Z01 {
	
	// Kreirati klasu Grad s minimalno 5 različitih svojstava (različitih tipova podataka)
	// Ovhjed u main metodi napraviti instancu klase Grad, dodjeliti vrijednosti za sva svojstva
	// te po želji ispisati jedno svojstvo
	
	public static void main(String[] args) {
		
		Grad grad = new Grad();
		
		grad.setBrojStanovnika(10825);
		grad.setEnergetskiCertifikat('B');
		grad.setGradonacelnik("Burić");
		grad.setNaziv("Belišće");
		grad.setProsjecnaPlaca(900);
		
		System.out.println(grad.getBrojStanovnika());
		
	}

}
