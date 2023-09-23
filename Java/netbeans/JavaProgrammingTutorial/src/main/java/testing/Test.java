/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import ExercisesOnComposition.customeraccount.Account;
import ExercisesOnComposition.customeraccount.Customer;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {

        Customer c1 = new Customer(23, "Michael Jordan", 'm');
        System.out.println(c1.toString());

        Account a1 = new Account(11, c1, 22.2);
        System.out.println(a1);

        a1.deposit(33.45);
        System.out.println(a1);

        a1.withdraw(60);
        System.out.println(a1);

    }

}
