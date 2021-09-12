package exam.flowers;

public class Lily extends Flower {
    private static String name = "lily";
    private static int lifeTime = 6;

    public Lily(Color color, double price) {
        super(name, color, price, lifeTime);
    }
}
