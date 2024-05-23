package java1.day3.transport;

import java1.day3.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String marka, Engine engine, String carClass, Driver driver, double speed) {
        super(marka, engine, carClass, driver);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void razgon() {
        System.out.println("Я ГОНЩИК!");
    }

    @Override
    public void move() {
        System.out.println("IM SPEED");
    }

    @Override
    public void move(int speed) {
        System.out.println("IM SPEED");
    }
}
