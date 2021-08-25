package credit.hometech;

import java.util.List;

public class LeaveHome extends TotalConsump {
    public LeaveHome(List<Appliances> smartHome) {
        super(smartHome);
    }

    double total = new TotalConsump(smartHome).getTotalConsump();
    public void warning() {
        if (total != 0) {
            System.out.println("You are going to leave home, Boss. Total home consumption is " + (int) total + " W");
            System.out.println("Don't forget to take OFF all home appliances (except fridge :))\n");
        }
        // поиск по критерию "включен - выключен". Здесь решил не создавать новый класс для упрощения
        for (Appliances c : smartHome) {
            if (c.getStatus()) System.out.println(c.getType() + " " + c.getName() + " is ON");
        }
    }
}
