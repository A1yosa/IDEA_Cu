package 面向对象.作业.v1;

import 面向对象.作业.v0.Point;

public class Shape {
    private Point point;
    public  Shape(Point Point){
        this.point=Point;
    }
    public Shape(){

    }
    public Point getPoint(){
        return point;
    }
    public void setPoint(Point point){
        this.point=point;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "point=" + point +
                '}';
    }
}
