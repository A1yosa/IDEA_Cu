package 面向对象.作业.v0;

public class Circle extends Point {
    private int radius;
    private final float Pi = (float) 3.14;
    public Circle(int x, int y, int radius){
        super(x,y);
        this.radius=radius;
    }


    public Circle(Point point, int i) {
        super(point.getX(),point.getY());
        this.radius = i;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getPi() {
        return Pi;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return Pi*radius*radius;
    }
    public double getC() {
        return 2*Pi*radius;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Circle{" +
                "radius=" + radius +
                '}';
    }
}
