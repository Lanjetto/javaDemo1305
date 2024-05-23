package java2.day1;

import java1.day3.Person;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
//        List<Object> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(new Person());
//        arrayList.add("asdfsd");
//        System.out.println(arrayList);
//        Person p = (Person) arrayList.get(2);
//        p.getName();
//        Deque<Person> people = new LinkedList<>();
//        people.addFirst(new Person());


        PriorityQueue<Person> people = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int ageComparison = Integer.compare(o1.getAge(), o2.getAge());
                if (ageComparison != 0) {
                    return ageComparison;
                } else {
                    return o2.getName().compareTo(o1.getName());
                }
            }
        });

        Person person1 = new Person("Boris", 12);
        Person person2 = new Person("Alex", 20);
        Person person3 = new Person("Cercei", 20);
        Person person4 = new Person("Dirk", 11);

        people.offer(person1);
        people.offer(person2);
        people.offer(person3);
        people.offer(person4);

        System.out.println(people);


        TreeSet<Person> people1 = new TreeSet<>(Comparator.comparing(Person::getName));
        people1.addAll(people);
        System.out.println(people1);


        Map<String, Integer> stringIntegerHashMap = Person.toMap(person1, person2, person3, person4);
        Collection<Integer> values = stringIntegerHashMap.values();
        Set<String> keySet = stringIntegerHashMap.keySet();
        Integer integer = stringIntegerHashMap.get("Alex");
        for (Map.Entry<String, Integer> stringIntegerEntry: stringIntegerHashMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " "  + stringIntegerEntry.getValue());
        }
        System.out.println(values);



    }
}
