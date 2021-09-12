package exam.flowers;

public class Rose extends Flower {
    private static String name = "rose";
    private static int lifeTime = 5;

    public Rose(Color color, double price) {
        super(name, color, price, lifeTime);
    }
}
