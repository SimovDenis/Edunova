package examples;

class Block {

	private int a, b, c;
	int volume;

	public Block(int i, int j, int k) {
		this.a = i;
		this.b = j;
		this.c = k;
		volume = a * b * c;
	}

	public boolean sameBlock(Block ob) {
		if ((ob.a == a) && (ob.b == b) && (ob.c == c))
			return true;
		else
			return false;
	}

	public boolean sameVolume(Block ob) {
		if (ob.volume == volume)
			return true;
		else
			return false;
	}

}
