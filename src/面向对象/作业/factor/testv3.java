package 面向对象.作业.factor;

import 面向对象.作业.v0.Circle;
import 面向对象.作业.v0.Point;
import 面向对象.作业.v0.Rectangle;

public class testv3 {
    public static void main(String[] args) {
        Circle c = new Circle(12,23, 322);
        Rectangle r = new Rectangle(new Point(111, 222), 333, 444);
        System.out.println(c);
        System.out.println(r);
        System.out.println("圆的面积:"+c.getArea());
        System.out.println("圆的周长:"+c.getC());
        System.out.println("长方形的面积:"+r.getArea());
        System.out.println("长方形的周长："+r.getC());
    }
}
