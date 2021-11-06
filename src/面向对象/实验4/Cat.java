package 面向对象.实验4;

import 面向对象.实验4.Animal;

public class Cat extends Animal {

    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }

    @Override
    public String getAnimalName() {
        return "Cat";
    }
}
