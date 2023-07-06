package edunova;

public class Z01 {
	
	public static void main(String[] args) {
		
		// Kreirajte klase Zivotinja, Sisavac, Riba, Pas i Som
	    // U svakoj klasi definirajte jedno svojstvo koje je "na pravom mjestu"

	    // Kreirati za Psa i Soma po jednu instancu te dodjeliti vrijednosti 
	    // za sva svojtva
		
		Pas pas = new Pas("Europa", "labōrātorem", "Labrador");
		Som som = new Som("Europa", 15, 4);
		
		System.out.println(pas.getKontinentPorijekla());
		System.out.println(som.getDubinaZarona());
		
	}
	

	
	
	
	

}
