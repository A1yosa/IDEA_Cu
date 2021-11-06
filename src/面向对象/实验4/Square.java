package 面向对象.实验4;

import 面向对象.实验4.Shape;

public class Square implements Shape {
    double length;
    double width;

    public Square(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double getPerimeter(){
        return ( length + width ) * 2 ;
    }

    public double getArea(){ return length * width ;}
}