/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import ExercisesOnComposition.mypoint.MyLine;
import ExercisesOnComposition.mypoint.MyPoint;
import java.util.Arrays;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {

        MyLine myLine = new MyLine(new MyPoint(2, 3), new MyPoint(4, 5));
        System.out.println(myLine);

        System.out.println(myLine.getBegin());
        myLine.setBegin(new MyPoint(1, 2));
        System.out.println(Arrays.toString(myLine.getBeginXY()));
        System.out.println(myLine.getGradient());
        System.out.println(myLine.getLength());

    }

}
