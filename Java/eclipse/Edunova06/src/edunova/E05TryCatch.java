package edunova;

public class E05TryCatch {
	
	public static void main(String[] args) {
		
		int[] niz = {1, 2};
		

		
		// iznimke se obraduju s try catch finally blokom
		try {
			// ovdje se uvijek dolazi
			System.out.println(niz[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// ovdje se dolazi ako je iznimka bačena
			System.out.println("Ideš na index koji ne postoji");
		} catch (NumberFormatException | StackOverflowError e) {
			// ovdje se dolazi ako je bačena iznimka NumberFormatException ili StackOverflowError
			
		} catch (Exception e) {
			// Ovaj će uhvatiti sve što prethodno nije navedeno
		} finally {
			// ovdje se uvijek dolazi
		}
		
		// u nastavku ću koristiti
		try {
			System.out.println(niz[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
