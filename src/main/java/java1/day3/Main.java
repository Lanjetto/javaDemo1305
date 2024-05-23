package java1.day3;

import java1.day3.transport.Car;
import java1.day3.transport.Engine;
import java1.day3.transport.Lorry;
import java1.day3.transport.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(12);
        Engine engine = new Engine(220, "Mazda");
        Engine engine1 = new Engine(220, "Mazda");
        Car lorry = new Lorry(
                "Mazda",
                engine,
                "Lorry",
                driver,
                500);
//        lorry.move();
//        lorry.stop();


//        lorry.razgruzka();

        SportCar sportCar = new SportCar("Lamba", engine, "sportCar", driver, 300.0);
        SportCar sportCar1 = new SportCar("Lamba", engine1, "sportCar", driver, 300.0);

//          sportCar1.move();
//          lorry.move();



        Driver driver1 = newDriver();
//        driver.loud();
//        driver1.drive();


//        carTest(lorry, sportCar);

//        Helicopter helicopter = new Helicopter(12.0);
//        Helicopter helicopter1 = new Helicopter(12.0);
//        System.out.println(helicopter1.equals(helicopter));


//        System.out.println(sportCar.equals(sportCar1));
//        System.out.println(engine.equals(engine1));
//
//        Boat boat = new Boat(30.0);
//        Boat boat1 = new Boat(30.0);
//        System.out.println(boat1.equals(boat));

        Cities[] name = Cities.values();

        System.out.println(name);


    }

    public static void carTest(Car... car) {
        for (Car car1 : car) {
            car1.move();
        }
    }

    public static Driver newDriver() {
        return new Driver(20) {
           @Override
            public void loud() {
               System.out.println("Nice!");
            }

            public void drive() {
                System.out.println("WRRR!");
            }
        };
    }



}
