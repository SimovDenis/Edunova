package edunova;

public class E03Rekurzija {
	
	public static void main(String[] args) {
		
		//metoda();
		System.out.println(faktorijel(5));
		
	}

	
	// Exception in thread "main" java.lang.StackOverflowError
//	private static void metoda() {
//		
//		metoda();
//		
//	}
//	
	// Rekurzija je kada metoda poziva samu sebe
	// uz uvijet prekida rekurzije
	static int faktorijel(int broj) {
		
		if (broj == 1) {
			return broj;
		}
		
		return broj * faktorijel(broj-1);
		
	}

}
