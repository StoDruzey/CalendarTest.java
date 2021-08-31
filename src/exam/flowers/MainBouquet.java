package exam.flowers;
//        Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).
//        Создать несколько объектов-цветов.
//        Собрать букет и определить его стоимость.
//        Определить все цвета, используемые в букете.
//        Определить когда весь букет завянет. - определим по самому долгому времени жизни цветка.
//        В букет может входить несколько цветов одного типа.
public class MainBouquet {
    public static void main(String[] args) {
        //Создать несколько объектов-цветов
        Flower rose1 = new Rose(Color.RED, 4);
        Flower rose2 = new Rose(Color.RED, 4);
        Flower rose3 = new Rose(Color.RED, 4);
        Flower rose4 = new Rose(Color.WHITE, 4.5);
        Flower rose5 = new Rose(Color.WHITE, 4.5);
        Flower lily1 = new Lily(Color.WHITE, 8);
        Flower lily2 = new Lily(Color.WHITE, 8);
        Flower iris1 = new Iris(Color.VIOLET, 1.5);
        Flower iris2 = new Iris(Color.VIOLET, 1.5);
        Flower iris3 = new Iris(Color.VIOLET, 1.5);
        Flower gerbera1 = new Gerbera(Color.YELLOW, 6);
        Flower gerbera2 = new Gerbera(Color.ROSE, 6);
        Flower gerbera3 = new Gerbera(Color.WHITE, 5);

        // Собрать букет и определить его стоимость.
        Bouquet bouquet1 = new Bouquet();
        bouquet1.addFlower(rose1).addFlower(rose2).addFlower(rose3).addFlower(rose4).addFlower(rose5);
        bouquet1.addFlower(lily1).addFlower(lily2);
        bouquet1.addFlower(iris1).addFlower(iris2).addFlower(iris3);
        bouquet1.addFlower(gerbera1).addFlower(gerbera2).addFlower(gerbera3);

        System.out.println("Bouquet price is " + bouquet1.getBouquetPrice() + " RUB");
        // Определить все цвета, используемые в букете.
        bouquet1.getBouquetColors();
        //Определить когда весь букет завянет. - определим по самому долгому времени жизни цветка.
        bouquet1.getBouquetLifeTime();

    }

}