package 面向对象.实验5;

public class Pencil implements Erase {

    private String type;

    public Pencil(String type) {
        this.type = type;
    }

    public Pencil() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void erase(String s) {

    }

    @Override
    public String toString() {
        return "Pencil{" +
                "type='" + type + '\'' +
                '}';
    }
}
