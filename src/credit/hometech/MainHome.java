package credit.hometech;
//        Определить иерархию домашней техники.
//        Включить некоторые в розетку.
//        Посчитать потребляемую мощность.
//        Провести сортировку приборов в квартире на основе одного из параметров.
//        Найти кухонный прибор в квартире, соответствующий заданному диапазону параметров.

import java.util.ArrayList;
import java.util.List;

public class MainHome {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Your home welcomes you Boss!");
        System.out.println();

        Washer washer1 = new Washer(1500,"Siemens");
        Fridge fridge1 = new Fridge(500, "Liebherr");
        CoffeeMachine coffeeMachine1 = new CoffeeMachine(800, "Bosch");
        Iron iron1 = new Iron(2000, "Braun");
        VacuumCleaner vacuumCleaner1 = new VacuumCleaner(1000,"Samsung");
        Microwave microwave1 = new Microwave(900, "Panasonic");

        List<Appliances> smartHome = new ArrayList<>();
        smartHome.add(washer1);
        smartHome.add(fridge1);
        smartHome.add(coffeeMachine1);
        smartHome.add(iron1);
        smartHome.add(vacuumCleaner1);
        smartHome.add(microwave1);

        fridge1.on();
        TotalConsump now = new TotalConsump(smartHome);
        System.out.println("Total home consumption is " + (int)now.getTotalConsump() + " W" + "\n");

        vacuumCleaner1.on();
        microwave1.on();
        coffeeMachine1.on();
        iron1.on();
        System.out.println("Total home consumption is " + (int)now.getTotalConsump() + " W" + "\n");

        microwave1.off();
        coffeeMachine1.off();
        System.out.println("Total home consumption is " + (int)now.getTotalConsump() + " W" + "\n");

        LeaveHome morning = new LeaveHome(smartHome);
        morning.warning();

//        Найти кухонный прибор в квартире, соответствующий заданному диапазону параметров. - в классе LeaveHome
    }
}
