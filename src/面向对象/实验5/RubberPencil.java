package 面向对象.实验5;

public class RubberPencil extends Pencil{
    private int price;
    private String color;

    public RubberPencil(String type, int price, String color) {
        super(type);
        this.price = price;
        this.color = color;
    }

    public RubberPencil() {
    }

    @Override
    public String toString() {
        return "RubberPencil{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
