package java2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Studen {
    private int course;
    private final String name;
    private List<Integer> grades;

    public Studen(int course, String name) {
        this.course = course;
        this.name = name;
        this.grades = randomGrades();
    }

    private static List<Integer> randomGrades() {
        ArrayList<Integer> randGrades = new ArrayList<>();

        IntStream.range(0, 10)
                .forEach(s -> randGrades.add(new Random().nextInt(2, 6)));

        return randGrades;
    }

    public IntStream getGrades() {
        return grades
                .stream()
                .mapToInt(Integer::intValue);

    }

    @Override
    public String toString() {
        return name + ": " + course + "; " + grades + "; \n";

        }


}
