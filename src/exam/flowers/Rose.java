package exam.flowers;

public class Rose extends Flower {
    private static String name = "rose";
    private static int lifeTime = 5;
    private Color color;
    private double price;


    public Rose(Color color, double price) {
        super(name, color, price, lifeTime);
    }
}
