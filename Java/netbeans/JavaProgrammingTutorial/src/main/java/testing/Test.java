/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import ExercisesOnClasses.rectangles.Rectangle;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);
        
        Rectangle r2 = new Rectangle();
        System.out.println(r2);
        
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());
        
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
        
    }

}
