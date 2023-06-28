package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
		
		// Program unosi broj elemenata niza cijelih brojeva
		// Unose se brojevi s while petljom u niz
		// ispisuju se uneseni brojevi iz niza s foreach petljom
		
		int brojElemenata = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj elemenata niza"));
		
		int niz[] = new int [brojElemenata];
		
		int i = 0;
		
		while(i < brojElemenata) {
			
			int element = Integer.parseInt(JOptionPane.showInputDialog("Unesi element niza"));
			
			niz[i] = element;
			
			++i;
			
		}
		
		for(int en : niz) {
			System.out.println(en);
			
		}
	}

}
