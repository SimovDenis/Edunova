/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoreExercisesOnClasses.mycomplex;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class MyComplexApp {

    private MyComplex number1;
    private MyComplex number2;
    private Scanner scanner;

    public MyComplexApp() {
        number1 = new MyComplex();
        number2 = new MyComplex();
        scanner = new Scanner(System.in);
        showMenu();
        scanner.close();
    }

    private void showMenu() {
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        number1.setReal(scanner.nextDouble());
        number1.setImag(scanner.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        number2.setReal(scanner.nextDouble());
        number2.setImag(scanner.nextDouble());
        calculations();
    }

    private void calculations() {
        // Number1 checks
        System.out.println("Number 1 is: " + number1);
        System.out.println(number1 + " is " + realCheck(number1) + "a pure real number");
        System.out.println(number1 + " is " + imagCheck(number1) + "a pure imaginary number");
        System.out.println();

        // Number2 checks
        System.out.println("Number 2 is: " + number2);
        System.out.println(number2 + " is " + realCheck(number2) + "a pure real number");
        System.out.println(number2 + " is " + imagCheck(number2) + "a pure imaginary number");
        System.out.println();

        // Equality check and adding numbers
        System.out.println(number1 + " is " + equalCheck(number1, number2) + "equal to " + number2);
        System.out.println(number1 + " + " + number2 + " = " + number1.addNew(number2));
    }

    private String realCheck(MyComplex number) {
        if (number.isReal()) {
            return "";
        }
        return "NOT ";
    }

    private String imagCheck(MyComplex number) {
        if (number.isImaginary()) {
            return "";
        }
        return "NOT ";
    }

    private String equalCheck(MyComplex number1, MyComplex number2) {
        if (number1.equals(number2)) {
            return "";
        }
        return "NOT ";
    }

}
