package konzolna.model;

import java.util.Date;
import java.util.List;

public class Racun extends Entitet {

	private Date vrijemeKupovine;
	private String brojRacuna;
	private String nacinPlacanja;
	private Kupac kupac;
	private Djelatnik djelatnik;
	private List<Proizvod> proizvodi;

	public Date getVrijemeKupovine() {
		return vrijemeKupovine;
	}

	public void setVrijemeKupovine(Date vrijemeKupovine) {
		this.vrijemeKupovine = vrijemeKupovine;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getNacinPlacanja() {
		return nacinPlacanja;
	}

	public void setNacinPlacanja(String nacinPlacanja) {
		this.nacinPlacanja = nacinPlacanja;
	}

	public List<Proizvod> getProizvodi() {
		return proizvodi;
	}

	public void setProizvodi(List<Proizvod> proizvodi) {
		this.proizvodi = proizvodi;
	}

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

	public Djelatnik getDjelatnik() {
		return djelatnik;
	}

	public void setDjelatnik(Djelatnik djelatnik) {
		this.djelatnik = djelatnik;
	}

}
