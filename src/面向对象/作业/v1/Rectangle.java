package 面向对象.作业.v1;

import 面向对象.作业.v0.Point;

public class Rectangle extends Shape{
    private double l;
    private double w;
    public Rectangle(Point point,double l,double w){
        super(point);
        this.l = l;
        this.w = w;
    }
    public  Rectangle(double l,double w){
        this.l = l;
        this.w = w;
    }
    public Rectangle(Point point){
        super(point);
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
    public double getArea(){
        return l * w;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", w=" + w +
                '}';
    }
}
