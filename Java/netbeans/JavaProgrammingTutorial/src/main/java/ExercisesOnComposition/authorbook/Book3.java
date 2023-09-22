/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercisesOnComposition.authorbook;

/**
 *
 * @author Denis
 */
public class Book3 {
    
    private String isbn;
    private String name;
    private Author2 author;
    private double price;
    private int qty = 0;

    public Book3(String isbn, String name, Author2 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    public Book3(String isbn, String name, Author2 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author2 getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String getAuthorName(){
        return author.getName();
    }
    
    @Override
    public String toString() {
        return "Book[name=" + name + "," + author.toString()
                + ",price=" + price + ",qty=" + qty + "]";
    }
    
}
