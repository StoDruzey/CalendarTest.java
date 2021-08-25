package credit.hometech;

import java.util.List;

public class TotalConsump {
    List<Appliances> smartHome;
    public TotalConsump(List<Appliances> smartHome) {
        this.smartHome = smartHome;
    }
    public double getTotalConsump() {
        double totalConsump = 0;
        for (Appliances tech : smartHome) {
            if (tech.getStatus()) totalConsump += tech.getConsump();
        }
        return totalConsump;
    }
}
