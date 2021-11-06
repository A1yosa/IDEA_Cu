package 面向对象.作业.factor;

import 面向对象.作业.v0.Circle;
import 面向对象.作业.v0.Rectangle;

public class testv {
    public static void main(String[] args) {
        Circle c = new Circle(1,2,3);
        Rectangle r = new Rectangle(3,4,5,6);
        System.out.println(c);
        System.out.println(r);
        System.out.println("圆的面积"+c.getArea());
        System.out.println("长方形面积:"+r.getArea());

    }
}
