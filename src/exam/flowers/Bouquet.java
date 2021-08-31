package exam.flowers;

import java.util.*;

public class Bouquet {
    private double bouquetPrice = 0;
    List<Flower> bouquet = new ArrayList<>();
    HashSet<Color> colors = new HashSet<>();
    List<Integer> flowersLifeTime = new ArrayList<>();

    public double getBouquetPrice(){
        return bouquetPrice;
    }

    public Bouquet addFlower(Flower flower){
        bouquet.add(flower);
        bouquetPrice += flower.getPrice();
        colors.add(flower.getColor());
        flowersLifeTime.add(flower.getLifetime());
        return this;
    }

    public void getBouquetColors(){
        System.out.print("Colors in bouquet are: ");
        for(Color c : colors) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public void getBouquetLifeTime(){
        System.out.println("Bouquet lifetime is: " + Collections.max(flowersLifeTime) + " day(s)");

    }
}
