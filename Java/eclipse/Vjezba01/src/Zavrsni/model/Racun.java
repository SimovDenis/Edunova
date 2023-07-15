package Zavrsni.model;

import java.util.Date;
import java.util.List;

public class Racun extends Entitet {

	private Date vrijemeKupovine;
	private String brojRacuna;
	private String nacinPlacanja;
	private List<Kupac> kupci;
	private List<Djelatnik> djelatnik;
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

	public List<Kupac> getKupac() {
		return kupci;
	}

	public void setKupac(List<Kupac> kupac) {
		this.kupci = kupac;
	}

	public List<Djelatnik> getDjelatnik() {
		return djelatnik;
	}

	public void setDjelatnik(List<Djelatnik> djelatnik) {
		this.djelatnik = djelatnik;
	}

	public List<Proizvod> getProizvodi() {
		return proizvodi;
	}

	public void setProizvodi(List<Proizvod> proizvodi) {
		this.proizvodi = proizvodi;
	}

}
