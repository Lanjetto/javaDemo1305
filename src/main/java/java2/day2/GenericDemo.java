package java2.day2;

import java1.day3.Capitan;
import java1.day3.Driver;
import java1.day3.transport.Boat;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
//        Pair<Person, Person> alex = new Pair<>(4, "Alex");
//        Pair<String, Integer> alex1 = new Pair<>("Alex", 34);
//        Pair<Person> pairOne = new Pair<>(new Person("Alex", 20),
//                                new Person("Stas", 45));

        Pair<Driver> pairTwo = new Pair<>(new Driver(20),
                                new Capitan(4, new Boat(20.2)));


//        pairTwo.getSecond().swim();
        pairTwo.getFirst().move();


        boolean contain = Pair.isContain("a", new String[]{"s", "g", "v", "b"});
        System.out.println(contain);

        movePerson(pairTwo);


        String[] strArr = {"a", "b", "c"};
        Object[] objArr = strArr;

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("b");

        List<? super String> objList = strList;
//        String s = objList.get(0);
//        objList.add(s);


    }

    public static void movePerson(Pair<?> pair) {
        pair.getSecond().move();
        pair.getFirst().move();
    }
}
