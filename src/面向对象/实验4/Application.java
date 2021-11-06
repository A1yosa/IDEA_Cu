package 面向对象.实验4;

import 面向对象.实验4.Cat;
import 面向对象.实验4.Dog;
import 面向对象.实验4.Simulator;

public class Application {
    public static void main(String[] args){
        Simulator si = new Simulator();
        si.playSound(new Dog());
        si.playSound(new Cat());
    }
}
