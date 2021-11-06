package 面向对象.实验4;

public class Cuboid {
    public int rectangle;
    public int height;

    public Cuboid(){

    }
    public Cuboid(int rectangle, int height){
        this.rectangle = rectangle;
        this.height = height;
    }
    public int getVolume(){ return rectangle * height; }
}
