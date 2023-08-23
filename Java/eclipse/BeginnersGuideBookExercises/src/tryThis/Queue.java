package tryThis;

public class Queue {

	private char[] q;
	private int putloc, getloc;

	public Queue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	public Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		for(int i = getloc; i < putloc; i++) {
			q[i] = ob.q[i];
		}
	}
	
	public Queue(char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		
		for(int i = 0; i < a.length; i++) put(a[i]);
	}

	public void put(char ch) {

		if (putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}

		q[putloc++] = ch;

	}

	public char get() {

		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}

		return q[getloc++];

	}

}
