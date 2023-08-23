package tryThis;

public class InchesToMeters {

	public static void main(String[] args) {
		
		// Display 12 feet of conversions, inch by inch. Output a blank line every 12 inches. 

		int b = 1;

		for (int feet = 1; feet <= 12; feet++) {
			for (int inch = 0; inch < 12; inch++) {

				if (inch == 0) {
					System.out.println(b++ + ". " + feet + " feet " + inch + " equals " + feet * 0.3048 + " meters");
				} else {
					System.out.println(b++ + ". " + feet + " feet " + inch + " equals " + (feet * 0.3048 + inch * 0.0254) + " meters");
				}
				
			}

			System.out.println();

		}

	}

}
