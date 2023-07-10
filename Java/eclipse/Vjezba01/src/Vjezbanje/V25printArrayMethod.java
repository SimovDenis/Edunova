package Vjezbanje;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class V25printArrayMethod {

//	Write a method called print(), which takes an int array and print its contents in the form of [a1, a2, ..., an]. 
//	Take note that there is no comma after the last element. 
//	
//	The method's signature is as follows:
//
//	public static void print(int[] array);
//	
//	Also write a test driver to test this method (you should test on empty array, one-element array, and n-element array).

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (;;) {

			numbers.add(Integer.parseInt(JOptionPane.showInputDialog("Input your array elements(or 00 to end)")));

			if (numbers.contains(Integer.valueOf(00)) == true) {
				numbers.remove(Integer.valueOf(00));
				break;
			}
		}

		print(numbers);

	}

	private static void print(ArrayList<Integer> array) {

		if (array.isEmpty() == true) {
			System.out.println("Your array is empty");
		} else if (array.size() == 1) {
			System.out.println(array.get(0));
		} else {
			System.out.println(array.toString());
		}

	}

}
