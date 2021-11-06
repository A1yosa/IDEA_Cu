package 面向对象.作业.factor;

import 面向对象.作业.v0.Circle;
import 面向对象.作业.v0.Point;
import 面向对象.作业.v0.Rectangle;

public class testv2 {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(1, 2), 3);
        Rectangle r = new Rectangle(new Point(1, 3), 3, 4);
        System.out.println(c);
        System.out.println(r);
        System.out.println("圆的面积:"+c.getArea());
        System.out.println("长方形的面积:"+r.getArea());
    }
}
