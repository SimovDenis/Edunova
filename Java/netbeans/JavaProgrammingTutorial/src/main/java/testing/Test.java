/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import ExercisesOnComposition.mycircle.MyCircle;
import ExercisesOnComposition.mypoint.MyPoint;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {

        MyCircle c1 = new MyCircle(new MyPoint(2, 3), 4);
        try {
            System.out.println(c1.getArea());
        } catch (Exception ex) {
            ex.getMessage();
        }

        System.out.println(c1.getCircumference());
        System.out.println(c1);

        System.out.println(c1.distance(new MyCircle(3, 5, 8)));

    }

}
