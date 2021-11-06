package 面向对象.实验4;

import 面向对象.实验4.Shape;

public class Circle implements Shape {
    double radius;
    final double Pi = 3.14;
    public Circle(double radius){ this.radius = radius ;}


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Pi=" + Pi +
                '}';
    }

    public double getPerimeter(){ return 2 * radius * Pi;}


    public double getArea(){ return Pi * radius * radius;}
}
