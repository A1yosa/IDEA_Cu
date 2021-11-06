package 面向对象.作业.v3;

import 面向对象.作业.v0.Point;

public class Circle implements Shape{
    private Point point;
    private double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return radius * radius * pi;
    }

    @Override
    public double getC() {
        return 2 *pi *radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }
}
