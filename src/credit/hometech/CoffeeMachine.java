package credit.hometech;

public class CoffeeMachine extends Appliances {
    public CoffeeMachine(double consump, String name) {
        super(consump, name);
    }
    final private String type = "coffee machine";
    @Override
    public String getType () {
        return type;
    }
    @Override
    public void on() {
        super.on();
        System.out.println("Hello Boss. Coffee machine " + getName() + " makes coffee. Consumption is " + (int)getConsump() + " W");
    }
    @Override
    public void off() {
        super.off();
        System.out.println("Coffee machine " + getName() + " is OFF. Consumption is " + (int)getConsump() + " W");
    }
}
