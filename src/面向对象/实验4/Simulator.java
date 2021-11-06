package 面向对象.实验4;

import 面向对象.实验4.Animal;

public class Simulator {
    public void playSound(Animal animal){
        animal.cry();
        System.out.println("现在播放" + animal.getAnimalName() + "的声音");
    }
}
