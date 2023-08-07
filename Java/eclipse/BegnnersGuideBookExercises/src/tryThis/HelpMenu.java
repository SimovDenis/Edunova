package tryThis;

import java.util.Scanner;

public class HelpMenu {

	private static Scanner sc;

	public HelpMenu() {
		sc = new Scanner(System.in);
		showOptions();
		sc.close();

	}

	private static void showOptions() {
		System.out.println("\nHelp on: ");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("3. for");
		System.out.println("4. while");
		System.out.println("5. do-while");
		System.out.println("6. break");
		System.out.println("7. continue");
		System.out.println("8. Exit the program");
		System.out.print("Choose one: ");
		choosingOption();

	}

	private static void choosingOption() {

		int ch;

		for (;;) {

			ch = sc.nextInt();

			if (ch > 0 && ch <= 8) {
				break;
			}

			System.out.println("\nYour number must be between 1 and 8");

		}

		switch (ch) {

		case 1:
			System.out.println("\nThe if:");
			System.out.println("\nif(condition) statement;");
			System.out.println("else statement;");
			showOptions();
			break;

		case 2:
			System.out.println("\nThe Switch:");
			System.out.println("\nswitch(expression) {\n" + "case constant1:\n" + "statement sequence\n" + "break;\n"
					+ "case constant2:\n" + "statement sequence\n" + "break;\r\n" + "case constant3:\n"
					+ "statement sequence\n" + "break;\r\n" + ".\n" + ".\n" + ".\n" + "default:\n"
					+ "statement sequence\n" + "}");
			showOptions();
			break;

		case 3:
			System.out.println("\nThe for:\n");
			System.out.println("for(init; condition; iteration) {");
			System.out.println("statement sequence\n}");
			showOptions();
			break;

		case 4:
			System.out.println("\nThe while:\n");
			System.out.println("while(condition){");
			System.out.println("statement sequence\n}");
			showOptions();
			break;

		case 5:
			System.out.println("\nThe do-while:\n");
			System.out.println("do{");
			System.out.print("statement sequence\n}");
			System.out.println(" while(condition);");
			showOptions();
			break;

		case 6:
			System.out.println("\nThe break:\n");
			System.out.println("break; or break label;");
			showOptions();
			break;

		case 7:
			System.out.println("\nThe continue\n");
			System.out.println("continue; or continue label;");
			showOptions();
			break;

		case 8:
			System.out.println("Goodbye!");
			break;
		}
	}

}
