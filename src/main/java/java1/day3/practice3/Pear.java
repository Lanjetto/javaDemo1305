package java1.day3.practice3;

public class Pear extends Fruit{
    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return getWeight() * 2.8;
    }
}
