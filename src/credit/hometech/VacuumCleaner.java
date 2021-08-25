package credit.hometech;

public class VacuumCleaner extends Appliances {
    public VacuumCleaner(double consump, String name) {
        super(consump, name);
    }
    final private String type = "vacuum cleaner";
    @Override
    public String getType () {
        return type;
    }
    @Override
    public void on() {
        super.on();
        System.out.println("Hello Boss. Vacuum cleaner " + getName() + " cleans room. Consumption is " + (int)getConsump() + " W");
    }
    @Override
    public void off() {
        super.off();
        System.out.println("Vacuum cleaner " + getName() + " is OFF. Consumption is " + (int)getConsump() + " W");
    }
}
