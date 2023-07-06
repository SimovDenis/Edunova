package edunova;

public class Sisavac extends Zivotinja {

	private String latinskiNaziv;

	public String getLatinskiNaziv() {
		return latinskiNaziv;
	}

	public void setLatinskiNaziv(String latinskiNaziv) {
		this.latinskiNaziv = latinskiNaziv;
	}

	public Sisavac(String kontinentPorijekla, String latinskiNaziv) {
		super(kontinentPorijekla);
		this.latinskiNaziv = latinskiNaziv;
	}

	public Sisavac() {
		super();
	}
	
	
	
}
