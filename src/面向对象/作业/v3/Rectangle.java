package 面向对象.作业.v3;

import 面向对象.作业.v0.Point;

public class Rectangle implements Shape{
    private Point point;
    private double l;
    private double w;

    public Rectangle(Point point, double l, double w) {
        this.point = point;
        this.l = l;
        this.w = w;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return l * w;
    }

    @Override
    public double getC() {
        return 2 * (l+w);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "point=" + point +
                ", l=" + l +
                ", w=" + w +
                '}';
    }
}
