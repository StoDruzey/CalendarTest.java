package credit.hometech;

public class Iron extends Appliances {
    public Iron(double consump, String name) {
        super(consump, name);
    }
    final private String type = "iron";
    @Override
    public String getType () {
        return type;
    }
    @Override
    public void on() {
        super.on();
        System.out.println("Hello Boss. Iron " + getName() + " irons clothes. Consumption is " + (int)getConsump() + " W");
    }
    @Override
    public void off() {
        super.off();
        System.out.println("Iron " + getName() + " is OFF. Consumption is " + (int)getConsump() + " W");
    }
}
