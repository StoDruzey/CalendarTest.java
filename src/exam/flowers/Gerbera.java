package exam.flowers;

public class Gerbera extends Flower {
    private static String name = "gerbera";
    private static int lifeTime = 10;
    private Color color;
    private double price;

    public Gerbera(Color color, double price) {
        super(name, color, price, lifeTime);
    }
}
