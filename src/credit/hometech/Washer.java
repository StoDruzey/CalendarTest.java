package credit.hometech;

public class Washer extends Appliances {
    public Washer(double consump, String name) {
        super(consump, name);
    }
    final private String type = "washer";
    @Override
    public String getType () {
        return type;
    }
    @Override
    public void on() {
        super.on();
        System.out.println("Hello Boss. Washing machine " + getName() + " washes clothes. Consumption is " + (int)getConsump() + " W");
    }
    @Override
    public void off() {
        super.off();
        System.out.println("Washing machine " + getName() + " is OFF. Consumption is " + (int)getConsump() + " W");
    }
}
