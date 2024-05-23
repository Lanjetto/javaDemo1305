package java1.day3.practice4;

public class Drum implements Instrument {

    private double size;

    public Drum(double size) {
        this.size = size;

    }

    public double getSize() {
        return size;
    }

    @Override
    public void play() {
        System.out.println("Играю на " +
                size + " дюймовом барабане");
    }
}
