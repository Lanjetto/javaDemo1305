package day3.practice3;

public class FruitShop {
    public static void main(String[] args) {
        Apple apple = new Apple(5.0);
        Apricot apricot = new Apricot(3.0);
        Pear pear = new Pear(9.0);
        Fruit[] fruits = {apple, apricot, pear};
        double totalPrice = 0.0;

        for (Fruit fruit : fruits) {
            System.out.println(fruit.getClass().getSimpleName());
            fruit.printManufacturerInfo();
            System.out.println(" " + fruit.getPrice());

            totalPrice += fruit.getPrice();
        }
        System.out.println("-------------------");
        System.out.println(totalPrice);
    }
}
