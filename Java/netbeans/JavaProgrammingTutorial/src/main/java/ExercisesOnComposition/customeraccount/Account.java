/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercisesOnComposition.customeraccount;

import java.text.DecimalFormat;

/**
 *
 * @author Denis
 */
public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        DecimalFormat decfor = new DecimalFormat("0.00");
        return customer.toString() + " balance=$" + decfor.format(balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amonunt) {
        balance += amonunt;
        return this;
    }

    public Account withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }

        return this;
    }

}
