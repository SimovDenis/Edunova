package tryThis;

public class QDemo {

	public static void main(String[] args) {

		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;

		System.out.println("Using bigQ to store the alphabet.");

		for (int i = 0; i < 26; i++) {
			bigQ.put((char) ('A' + i));
		}

		System.out.print("Contents of bigQ: ");
		for (int i = 0; i < 26; i++) {
			ch = bigQ.get();
			if (ch != (char) 0) {
				System.out.print(ch);
			}
		}

		System.out.println("\n");

		System.out.println("Using smallQ to generat errors.\n");
		for (int i = 0; i < 5; i++) {

			System.out.print("Attempting to store " + (char) ('Z' - i));

			smallQ.put((char) ('Z' - i));

			System.out.println();
		}

		System.out.println();

		System.out.print("Contents of samallQ: ");
		for (int i = 0; i < 5; i++) {
			ch = smallQ.get();

			if (ch != (char) 0) {
				System.out.print(ch);
			}

		}

	}

}
