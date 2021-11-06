package 面向对象.实验4;

import 面向对象.实验4.Animal;

public class Dog extends Animal {

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }

    @Override
    public String getAnimalName() {
        return "Dog";
    }
}
