package java1.day3;

import java1.day3.transport.Movable;

public class Driver extends Person implements Movable {
    private int experience;

    public Driver(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void loud() {
        System.out.println("!@#&@#&");
    }

    @Override
    public void move() {
        System.out.println("Хожу");
    }

    @Override
    public void move(int speed) {
        System.out.println("Брожу");
    }
}
