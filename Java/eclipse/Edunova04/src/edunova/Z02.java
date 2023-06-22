package edunova;

public class Z02 {
	
	public static void main(String[] args) {
		
		// Program ispisuje brojeve od 100 do 1
		// u istom redu odvojeno zarezom
		
		
		// inline rješenje
		for(int i = 100; i >= 1; i--) {
			System.out.print(i + (i == 1 ? "" : ","));
		}
		
		System.out.println(); //novi red
		
		
		// rješenje if/else grananjem
		for(int i = 100; i >= 1; i--) {
			if (i != 1) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
			
			
			
		}
		
		
	}

}
