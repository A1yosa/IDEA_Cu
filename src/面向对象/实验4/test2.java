package 面向对象.实验4;

import 面向对象.实验4.Circle;
import 面向对象.实验4.Square;

public class test2 {
    public static void main(String[ ] args){
        int r = (int) (Math.random() * 100);
        if(r % 2 == 0){
            Circle c = new Circle(3);
            System.out.println("长方形周长：" + c.getPerimeter() + "长方形面积：" + c.getArea());
        }else{
            Square s = new Square(3, 4);
            System.out.println("圆的周长：" + s.getPerimeter() + "圆的面积:" + s.getArea());
        }
    }
}
