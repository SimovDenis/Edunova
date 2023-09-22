/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import ExercisesOnComposition.authorbook.Author;
import ExercisesOnComposition.authorbook.Book;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {

        Author ahTeck = new Author("Tah Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Aurhor's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somehwere.com", 'm'), 29.95);

        System.out.println(anotherBook);

        System.out.println(anotherBook.getAuthorName());
        System.out.println(anotherBook.getEmail());
        System.out.println(anotherBook.getGender());

    }

}
