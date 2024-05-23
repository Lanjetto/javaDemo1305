package java1.day3.practice3;

public class Apple extends Fruit{
    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return getWeight() * 2.5;
    }
}
