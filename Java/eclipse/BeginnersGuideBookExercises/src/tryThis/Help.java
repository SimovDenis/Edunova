package tryThis;

public class Help {

	void helpOn(int what) {

		switch (what) {

		case '1':
			System.out.println("\nThe if:");
			System.out.println("\nif(condition) statement;");
			System.out.println("else statement;");
			break;

		case '2':
			System.out.println("\nThe Switch:");
			System.out.println("\nswitch(expression) {\n" + "case constant1:\n" + "statement sequence\n" + "break;\n"
					+ "case constant2:\n" + "statement sequence\n" + "break;\r\n" + "case constant3:\n"
					+ "statement sequence\n" + "break;\r\n" + ".\n" + ".\n" + ".\n" + "default:\n"
					+ "statement sequence\n" + "}");
			break;

		case '3':
			System.out.println("\nThe for:\n");
			System.out.println("for(init; condition; iteration) {");
			System.out.println("statement sequence\n}");
			break;

		case '4':
			System.out.println("\nThe while:\n");
			System.out.println("while(condition){");
			System.out.println("statement sequence\n}");
			break;

		case '5':
			System.out.println("\nThe do-while:\n");
			System.out.println("do{");
			System.out.print("statement sequence\n}");
			System.out.println(" while(condition);");
			break;

		case '6':
			System.out.println("\nThe break:\n");
			System.out.println("break; or break label;");
			break;

		case '7':
			System.out.println("\nThe continue\n");
			System.out.println("continue; or continue label;");
			break;

		}

		System.out.println();

	}

	void showMenu() {
		System.out.println("\nHelp on: ");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("3. for");
		System.out.println("4. while");
		System.out.println("5. do-while");
		System.out.println("6. break");
		System.out.println("7. continue");
		System.out.print("Choose one (q to quit): ");
	}

	boolean isValid(int ch) {
		if (ch < '1' | ch > '7' & ch != 'q')
			return false;
		else
			return true;
	}

}
