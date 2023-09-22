/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercisesOnComposition.authorbook;

/**
 *
 * @author Denis
 */
public class Book2 {

    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book2(String name, Author[] author, double price) {
        this.name = name;
        this.authors = author;
        this.price = price;
    }

    public Book2(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ",authors={" + getAuthorNames()
                + "},price=" + price + ",qty=" + qty + "]";
    }

    public String getAuthorNames() {
        String aut = "";
        for (int i = 0; i < authors.length; i++) {
            if (i < authors.length - 1) {
                aut += authors[i].getName() + ",";
            }

            if (i == authors.length - 1) {
                aut += authors[i].getName();
            }

        }

        return aut;
    }

}
