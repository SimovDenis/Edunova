package Vjezbanje;

public class V27_2DArraySum {

	public static void main(String[] args) {

		int sum = 0;

		int[][] arr = { { 2, 3, 4 }, { 3, 3, 3 }, { 2, 2, 2 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		System.out.println(sum);

	}

}
