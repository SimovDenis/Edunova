package examples;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int sample[] = new int[10];
		
		for (int i = 0; i <= 9; i++) {
			sample[i] = i;
			System.out.println("This is sample [" + i + "]: " + sample[i]);
		}
		
	}

}
