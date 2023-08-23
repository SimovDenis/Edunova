package tryThis;

public class QDemo2 {

	public static void main(String[] args) {

		Queue q1 = new Queue(10);

		char name[] = { 'T', 'o', 'm' };

		Queue q2 = new Queue(name);

		char ch;

		for (int i = 0; i < 10; i++) {
			q1.put((char) ('A' + i));
		}

		Queue q3 = new Queue(q1);

		System.out.print("Contents of q1: ");
		for (int i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Contents of q2: ");
		for (int i = 0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Contents of q3: ");
		for (int i = 0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}

	}

}
