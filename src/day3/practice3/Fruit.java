package day3.practice3;

/**
 * Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
 * Класс Фрукт содержит:
 * а) переменную вес,
 * б) завершенный метод printManufacturerInfo(){System.out.print("Made in Russia");}
 * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта.
 * Создать несколько объектов разных классов.
 * Подсчитать общую стоимость проданных фруктов.
 * А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */
public abstract class Fruit {
    private final double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void printManufacturerInfo() {
        System.out.print("Made in Russia");
    }

    public abstract double getPrice();

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
