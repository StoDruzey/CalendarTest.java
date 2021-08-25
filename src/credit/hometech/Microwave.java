package credit.hometech;

public class Microwave extends Appliances {
    public Microwave(double consump, String name) {
        super(consump, name);
    }
    final private String type = "microvawe";
    @Override
    public String getType () {
        return type;
    }
    @Override
    public void on() {
        super.on();
        System.out.println("Hello Boss. Microwave owen " + getName() + " cooks food. Consumption is " + (int)getConsump() + " W");
    }
    @Override
    public void off() {
        super.off();
        System.out.println("Microwave owen " + getName() + " is OFF. Consumption is " + (int)getConsump() + " W");
    }
}
