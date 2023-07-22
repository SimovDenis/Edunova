package konzolna.model;

public class Proizvod extends Entitet {

	private String naziv;
	private double cijena;
	private double garancija;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCijena() {
		return cijena;
	}

	public void setCijena(double cijena) {
		this.cijena = cijena;
	}

	public double getGarancija() {
		return garancija;
	}

	public void setGarancija(double garancija) {
		this.garancija = garancija;
	}

	public Proizvod() {
	}

	public Proizvod(int sifra, String naziv, double cijena, double garancija) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
		this.garancija = garancija;
	}

}
