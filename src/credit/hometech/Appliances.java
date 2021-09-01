package credit.hometech;

public class Appliances {
    private final int consump;
    private final String name;
    private boolean status;
    private String type = "type";

    public Appliances(int consump, String name) {
        this.consump = consump;
        this.name = name;
    }

    public void on() {
        status = true;
    }
    public void off() {
        status = false;
    }

    public Integer getConsump() {
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
