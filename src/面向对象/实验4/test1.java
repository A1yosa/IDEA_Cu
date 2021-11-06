package 面向对象.实验4;

import 面向对象.实验4.Cuboid;
import 面向对象.实验4.Rectangle;

public class test1 {
    public  static void main(String[] args){
        Rectangle Area = new Rectangle(2,4);
        Cuboid Volume =new Cuboid(8,3);
        System.out.println("面积："+Area.getArea()+"体积:"+Volume.getVolume());
    }
}
