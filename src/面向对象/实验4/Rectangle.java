package 面向对象.实验4;

public class Rectangle {
    public int length;
    public int width;

    public Rectangle(){

    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        }

    public int getArea(){return length * width;}
}
