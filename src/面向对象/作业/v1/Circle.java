package 面向对象.作业.v1;


import 面向对象.作业.v0.Point;

public class Circle extends Shape{
    private double radius;
    private final double pi = (double) 3.14;
    public Circle(Point point,double radius){
        super(point);
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(Point point){
        super(point);
    }
    public double getArea(){
        return radius * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
