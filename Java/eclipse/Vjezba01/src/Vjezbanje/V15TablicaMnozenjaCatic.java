package Vjezbanje;

public class V15TablicaMnozenjaCatic {
	
	public static void main(String[] args) {
		
		
				

				System.out.println("------------------------------");
				System.out.println(":::::::TABLICA MNOZENJA:::::::");
				System.out.println("------------------------------");
				
				for (int i=1;i<10;i++) {
					System.out.print(i==1 ? "* |  1" : "  "+i);
				}
				
				System.out.println();
				System.out.println("------------------------------");
				
				int znamenkeStupca=0;
				
				for (int i=1;i<10;i++) {
					znamenkeStupca=3;
					for (int j=1; j<10;j++) {
						
						if (j==1) {
							System.out.print(i+" |");
							
						}
						System.out.print(i*j<10 ? "  "+i*j : " "+i*j);
						znamenkeStupca+=3;
						
					}
					System.out.println();
				}
				
				String autor="   by    Ana-Marija";
				
				System.out.println("------------------------------");
				
				for (int i=0; i<=(znamenkeStupca-autor.length());i++) {
					System.out.print(i<(znamenkeStupca-autor.length()) ? ":" : autor);
				}
				
				System.out.println();
				System.out.println("------------------------------");
				
			}
		
		
	}


