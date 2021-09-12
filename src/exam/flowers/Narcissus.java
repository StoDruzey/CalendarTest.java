package exam.flowers;

public class Narcissus extends Flower {
    private static String name = "narcissus";
    private static int lifeTime = 9;

    public Narcissus(Color color, double price) {
        super(name, color, price, lifeTime);
    }
}
