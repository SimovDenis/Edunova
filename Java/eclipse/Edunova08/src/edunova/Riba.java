package edunova;

public class Riba extends Zivotinja {

	private int dubinaZarona;

	public int getDubinaZarona() {
		return dubinaZarona;
	}

	public void setDubinaZarona(int dubinaZarona) {
		this.dubinaZarona = dubinaZarona;
	}

	public Riba(String kontinentPorijekla, int dubinaZarona) {
		super(kontinentPorijekla);
		this.dubinaZarona = dubinaZarona;
	}

	public Riba() {
		super();
	}
	
	
	
}
