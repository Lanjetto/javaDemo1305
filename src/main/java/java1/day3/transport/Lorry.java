package java1.day3.transport;

import java1.day3.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String marka, Engine engine, String carClass, Driver driver, int carrying) {
        super(marka, engine, carClass, driver);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void razgruzka(){
        System.out.println("Разгружаю!");
    }

    @Override
    public void move() {
        System.out.println("MOVE HARD");
    }

    @Override
    public void move(int speed) {
        System.out.println("MOVE HARD WITH " + speed);
    }
}
