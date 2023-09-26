/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import ExercisesOnComposition.mypoint.MyPoint;
import ExercisesOnComposition.myrectangle.MyRectangle;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {

        MyRectangle r1 = new MyRectangle(new MyPoint(3, 5), new MyPoint(6, 2));
        System.out.println(r1);

        System.out.println(r1.getArea());
        System.out.println(r1.getAllPoints());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getBottomLeft());
        System.out.println(r1.getTopRight());

    }

}
