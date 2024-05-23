package java1.day3;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        System.out.println("Hello im person!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Map<String, Integer> toMap(Person...people) {
        Map<String, Integer> map = new HashMap<>();
        for (Person person : people) {
            map.put(person.getName(), person.getAge());
        }
        return map;
    }


    @Override
    public String toString() {
        return name + ": " + age;
    }
}
