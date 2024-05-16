package day3.transport;


import day3.Driver;

import java.util.Objects;

public abstract class Car implements Movable{
    private String marka;
    private Engine engine;
    private String carClass;
    private Driver driver;

    public Car(String marka, Engine engine, String carClass, Driver driver) {
        this.marka = marka;
        this.engine = engine;
        this.carClass = carClass;
        this.driver = driver;
    }

    public String getMarka() {
        return marka;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getCarClass() {
        return carClass;
    }

    public Driver getDriver() {
        return driver;
    }


    public void stop() {
        System.out.println("stop");
    }

    public void turnLeft() {
        System.out.println("turnLeft");
    }

    public void turnRight() {
        System.out.println("turnRight");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(marka, car.marka) && Objects.equals(engine, car.engine) && Objects.equals(carClass, car.carClass) && Objects.equals(driver, car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, engine, carClass, driver);
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", engine=" + engine +
                ", carClass='" + carClass + '\'' +
                ", driver=" + driver +
                '}';
    }
}
