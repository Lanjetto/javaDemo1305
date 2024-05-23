package java1.day3.practice3;

public class Apricot extends Fruit{
    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return getWeight() * 3;
    }
}
