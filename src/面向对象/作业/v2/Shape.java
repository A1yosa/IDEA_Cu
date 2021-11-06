package 面向对象.作业.v2;

import 面向对象.作业.v0.Point;

public abstract class Shape {
    private Point point;
    public Shape(Point point){
        this.point=point;
    }

    public Shape() {
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "point=" + point +
                '}';
    }
}
