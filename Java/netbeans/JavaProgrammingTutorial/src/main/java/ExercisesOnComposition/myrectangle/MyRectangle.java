/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercisesOnComposition.myrectangle;

import ExercisesOnComposition.mypoint.MyPoint;

/**
 *
 * @author Denis
 */
public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopRight() {
        return new MyPoint(bottomRight.getX(), topLeft.getY());
    }

    public MyPoint getBottomLeft() {
        return new MyPoint(topLeft.getX(), bottomRight.getY());
    }

    public String getAllPoints() {
        return "MyRectanglePoints=[bottomLeft=" + getBottomLeft() + ",topLeft=" + topLeft
                + ",topRight=" + getTopRight() + ",bottomRight=" + bottomRight + "]";
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }

    public double getArea() {
        double length = getBottomLeft().distance(getBottomRight());
        double width = getBottomLeft().distance(getTopLeft());
        return width * length;
    }

    public double getPerimeter() {
        double length = getBottomLeft().distance(getBottomRight());
        double width = getBottomLeft().distance(getTopLeft());
        return 2 * (width + length);
    }

}
