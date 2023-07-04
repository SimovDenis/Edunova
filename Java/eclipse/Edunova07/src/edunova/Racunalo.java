package edunova;

public class Racunalo {
	
	private String proizvodac;
	private int brojMonitora;
	private char energestkiCertifikat;
	
	public Racunalo() {
		super();
	}

	public Racunalo(String proizvodac, int brojMonitora, char energestkiCertifikat) {
		super();
		this.proizvodac = proizvodac;
		this.brojMonitora = brojMonitora;
		this.energestkiCertifikat = energestkiCertifikat;
	}
	
	public String getProizvodac() {
		return proizvodac;
	}
	public void setProizvodac(String proizvodac) {
		this.proizvodac = proizvodac;
	}
	public int getBrojMonitora() {
		return brojMonitora;
	}
	public void setBrojMonitora(int brojMonitora) {
		this.brojMonitora = brojMonitora;
	}
	public char getEnergestkiCertifikat() {
		return energestkiCertifikat;
	}
	public void setEnergestkiCertifikat(char energestkiCertifikat) {
		this.energestkiCertifikat = energestkiCertifikat;
	}
	
	

}
