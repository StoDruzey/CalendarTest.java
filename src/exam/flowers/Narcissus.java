package exam.flowers;

public class Narcissus extends Flower {
    private static String name = "narcissus";
    private static int lifeTime = 9;
    private Color color;
    private double price;

    public Narcissus(Color color, double price) {
        super(name, color, price, lifeTime);
    }
}
