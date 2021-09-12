package exam.flowers;

public class Flower {
    private String name;
    private Color color;
    private double price;
    private int lifetime;

    public Flower(String name, Color color, double price, int lifetime) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.lifetime = lifetime;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public int getLifetime() {
        return lifetime;
    }
}

