package tryThis;

public class GalToLit {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 10 == 0) {
				System.out.println();
			}
			
			System.out.println(i + ". " + i + " gallons equals " + i * 3.7854 + " liters");
			
		}
		
	}	 

}
