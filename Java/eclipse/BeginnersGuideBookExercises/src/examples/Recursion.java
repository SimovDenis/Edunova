package examples;

public class Recursion {

	public static void main(String[] args) {

		System.out.println("Factorial of 5 is: " + factR(5));

	}

	static int factR(int n) {
		int result;

		if (n == 1)
			return 1;
		result = factR(n - 1) * n;
		return result;
	}

}
