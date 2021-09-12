package exam.flowers;

public class Iris extends Flower {
    private static String name = "iris";
    private static int lifeTime = 7;

    public Iris(Color color, double price) {
        super(name, color, price, lifeTime);
    }
}
