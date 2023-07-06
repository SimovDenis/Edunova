package edunova;

public class Som extends Riba {

	private int duljinaBrkova;

	public int getDuljinaBrkova() {
		return duljinaBrkova;
	}

	public void setDuljinaBrkova(int duljinaBrkova) {
		this.duljinaBrkova = duljinaBrkova;
	}

	public Som(String kontinentPorijekla, int dubinaZarona, int duljinaBrkova) {
		super(kontinentPorijekla, dubinaZarona);
		this.duljinaBrkova = duljinaBrkova;
	}

	public Som() {
		super();
	}	
	
	
}
