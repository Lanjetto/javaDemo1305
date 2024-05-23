package java2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Univer {
    private final List<Studen> studens;
    public Univer() {
        this.studens = new ArrayList<>();
        studens.add(new Studen(4, "Alex"));
        studens.add(new Studen(3, "Stas"));
        studens.add(new Studen(2, "Misha"));
        studens.add(new Studen(4, "Gosha"));
    }




    public static void main(String[] args) {
        Univer univer = new Univer();
        System.out.println(univer.studens);
        double[] collect = univer.studens
                .stream()
                .mapToDouble(x -> x.getGrades().average().orElseThrow())
                .toArray();
        System.out.println(Arrays.toString(collect));



    }
}
