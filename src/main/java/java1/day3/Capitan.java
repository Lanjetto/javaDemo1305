package java1.day3;

import java1.day3.transport.Boat;
import java1.day3.transport.Movable;

public class Capitan extends Driver implements Movable {
    private Boat boat;

    public Capitan(int ex, Boat boat) {
        super(ex);
        this.boat = boat;
    }

    @Override
    public void move() {
        System.out.println("Хожу по морям");
    }

    public void swim() {
        System.out.println("Купаюся");
    }

    @Override
    public void move(int speed) {
        System.out.println("Брожу по волнам");
    }
}
