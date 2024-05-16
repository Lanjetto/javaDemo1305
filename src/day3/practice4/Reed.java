package day3.practice4;

public class Reed implements Instrument {

    private double diameter;

    public Reed(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Играю на " +
                diameter + "  трубе");
    }
}
