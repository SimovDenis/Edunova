package tryThis;

public class SpaceCount {

	public static void main(String[] args) throws java.io.IOException {

//		 Write a program that reads characters from the keyboard until a period is received.
//		 Have the program count the number of spaces. Report the total at the end of the
//		 program.

		char choice, ignore;
		int count = 0;

		do {
			System.out.println("Input any key and press enter, exit with q: ");
			System.out.print("Your input: ");

			choice = (char) System.in.read();
			if (choice == ' ') count++;
			
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');

		} while (choice != '.');

		System.out.println("\nNumber of spaces is " + count);
		System.out.println("Program ended");

	}

}
