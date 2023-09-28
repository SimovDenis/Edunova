package Vjezbanje;

public class V28TwoSum {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 6, 11, 23 };
		int sum = 9;

		TwoSum(array, sum);

	}

	static void TwoSum(int[] arr, int sum) {
		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				res = arr[i] + arr[j];
				if (i == j) {
					continue;
				} else if (res == sum) {
					System.out.println("Numbers are: " + arr[i] + ", " + arr[j]);
				}

			}

		}

	}
}
