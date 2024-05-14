package day1;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Person[] persons = {new Person(),new Person(), new Person()};
        Person[] people = Arrays.copyOf(persons, 5);
        System.out.println(Arrays.toString(persons));
    }
}
