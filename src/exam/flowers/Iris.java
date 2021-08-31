package exam.flowers;

public class Iris extends Flower {
    private static String name = "iris";
    private static int lifeTime = 7;
    private Color color;
    private double price;

    public Iris(Color color, double price) {
        super(name, color, price, lifeTime);
    }
}
