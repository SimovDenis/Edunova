package edunova;

import javax.swing.JOptionPane;

public class E04CiklicnaMatrica {
	
	public static void main(String[] args) {
		
		boolean dev = false;
		
		int red =dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int stupac =dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		
		
		int[][] matrica = new int [red][stupac];
		
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			
			System.out.println();
			
		}
		
		System.out.println("******************************");
		
		int b = 1;
		
		for (int i = 1; i <= stupac; i++) {
			matrica[red - 1][stupac - i] = b++;
		}
				
//		matrica[red - 1][stupac - 1] = b++;
//		matrica[red - 1][stupac - 2] = b++;
//		matrica[red - 1][stupac - 3] = b++;
//		matrica[red - 1][stupac - 4] = b++;
//		matrica[red - 1][stupac - 5] = b++;
		
		for (int i = 2; i <= red; i++) {
			matrica[red - i][0] = b++;
		}
		
//		matrica[red - 2][0] = b++;
//		matrica[red - 3][0] = b++;
//		matrica[red - 4][0] = b++;
//		matrica[red - 5][0] = b++;
		
		for (int i = 1; i < stupac; i++) {
			matrica[0][i] = b++;
		}
		
//		matrica[0][1] = b++;
//		matrica[0][2] = b++;
//		matrica[0][3] = b++;
//		matrica[0][4] = b++;
		
		for (int i = red - 1; i > red - (red - 1); i--) {
			matrica[red - i][stupac - 1] = b++;
		}
		
//		matrica[red - 4][stupac - 1] = b++;
//		matrica[red - 3][stupac - 1] = b++;
//		matrica[red - 2][stupac - 1] = b++;
		
		for (int i = stupac - 2; i > 0; i--) {
			matrica[red - 2][i] = b++;
		}
		
//		matrica[3][3] = b++;
//		matrica[3][2] = b++;
//		matrica[3][1] = b++;
		
		for (int i = red - 3; i > 0; i--) {
			matrica[i][1] = b++;
		}
		
//		matrica[2][1] = b++;
//		matrica[1][1] = b++;
		
		for (int i = 2; i < stupac - 1; i++) {
			matrica[1][i] = b++;
		}
		
//		matrica[1][2] = b++;
//		matrica[1][3] = b++;
		
		for (int i = 2; i < red - 2; i++) {
			matrica[i][stupac - 2] = b++;
		}
		
//		matrica[2][3] = b++;
		
		for (int i = stupac - 3; i > 1 ; i--) {
			matrica[red - 3][i] = b++;
		}

//		matrica[2][2] = b++;
		
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < stupac; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			
			System.out.println();
			
		}
		
		System.out.println("******************************");
		
	}

}
