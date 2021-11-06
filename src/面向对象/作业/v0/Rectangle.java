package 面向对象.作业.v0;

public class Rectangle extends Point{
    private int l;
    private int w;

    public Rectangle(int x, int y, int l, int w) {
        super(x, y);
        this.l = l;
        this.w = w;
    }

    public Rectangle(Point point, int l, int w) {

        this.l = l;
        this.w = w;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
    public double getArea()
    {
        return l * w;
    }

    public double getC() {
        return (l+w)*2;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Rectangle{" +
                "l=" + l +
                ", w=" + w +
                '}';
    }
}
