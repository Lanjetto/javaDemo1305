package java2.day2;

import java1.day3.Capitan;
import java1.day3.Person;
import java1.day3.transport.Boat;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo {

    static int one = 1;
    static String two = "Two";
    public static Person makeSomePerson(FunInterface<? extends Person> p) {
        return p.doSmth(one, two);
    }

    public static Integer add(int a, int b, Calulate c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        Person person = makeSomePerson((age, name) -> new Person(name, age));
        System.out.println(person);

        Person person1 = makeSomePerson((a, b) -> new Capitan(a, new Boat(a)));

        Integer multiply = add(4, 5, ((a, b) -> {
            int c = 0;
            for (int i = a; i < b; i++) {
                c+=i;
            }
            return c;
        }));
        Integer minus = add(4, 5, ((a, b) -> a - b));

        String[] persons = {"Fedor", "Alex", "Xenomoph", "Yan"};
        Arrays.sort(persons, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(persons));



    }
}
