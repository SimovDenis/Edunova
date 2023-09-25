/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercisesOnComposition.mycircle;

import ExercisesOnComposition.mypoint.MyPoint;
import java.text.DecimalFormat;
import java.text.ParseException;

/**
 *
 * @author Denis
 */
public class MyCircle {

    private MyPoint center;
    private int radius = 1;

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center + "]";
    }

    public double getArea() throws Exception {
        double area = radius * radius * Math.PI;
        DecimalFormat df = new DecimalFormat("##.####");
        String s = df.format(area);
        try {
            return (double) df.parse(s);
        } catch (ParseException ex) {
            throw new Exception("Error");
        }
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }

}
