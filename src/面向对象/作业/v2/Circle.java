package 面向对象.作业.v2;

import 面向对象.作业.v0.Point;

public class Circle extends Shape{
    private double radius;
    private final double pi = (double) 3.14;
    public Circle(Point point,double radius){
        super(point);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()+ "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }

    @Override
    public double getArea() {
        return radius * radius * pi;
    }
}
