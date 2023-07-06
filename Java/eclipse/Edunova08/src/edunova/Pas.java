package edunova;

public class Pas extends Sisavac {
	
	private String pasmina;

	public String getPasmina() {
		return pasmina;
	}

	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}

	public Pas(String kontinentPorijekla, String latinskiNaziv, String pasmina) {
		super(kontinentPorijekla, latinskiNaziv);
		this.pasmina = pasmina;
	}

	public Pas() {
		super();
	}
	
	

}
