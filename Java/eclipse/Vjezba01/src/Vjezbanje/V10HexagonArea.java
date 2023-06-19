package Vjezbanje;

//Write a Java program to compute hexagon area.

import javax.swing.JOptionPane;

public class V10HexagonArea {

	public static void main(String[] args) {
		
		double side = Double.parseDouble(JOptionPane.showInputDialog("Input side lenght"));
		
		double area = (6*(side*side))/(4*Math.tan(Math.PI/6));
		
		System.out.printf("Area of a hexagon with %f side length is " + area + ".", side);
		

	}

}
