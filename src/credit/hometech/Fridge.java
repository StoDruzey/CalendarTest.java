package credit.hometech;

public class Fridge extends Appliances {
        public Fridge(double consump, String name) {
        super(consump, name);
    }
    final private String type = "fridge";
    @Override
    public String getType () {
        return type;
    }
    @Override
    public void on() {
        super.on();
        System.out.println("Hello Boss. Fridge " + getName() + " freezes food. Consumption is " + (int)getConsump() + " W");
    }
    @Override
    public void off() {
        super.off();
        System.out.println("Fridge " + getName() + " is OFF. Consumption is " + (int)getConsump() + " W");
    }
}
