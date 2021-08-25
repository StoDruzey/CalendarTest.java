package credit.hometech;

public class Appliances {
    private final double consump;
    private final String name;
    private boolean status;
    private String type = "type";

    public Appliances(double consump, String name) {
        this.consump = consump;
        this.name = name;
    }

    public void on() {
        status = true;
    }
    public void off() {
        status = false;
    }

    public double getConsump() {
        if(status) {
            return consump;
        } else return 0;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }
}
