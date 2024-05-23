package java2.day2;


import java.util.List;
import java.util.function.Predicate;

/**
 * Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
 */
public class PrintableTask {
    public static void main(String[] args) {
        Printable p = () -> System.out.println("Its printable message");
        someMethod(() -> System.out.println("Its printable message"));

        Predicate<String> pr = (x) -> x != null;

        boolean test = pr.test("4");
        Predicate<String> pr1 = pr.and(x -> x.isBlank());
        boolean test1 = pr1.test(null);
//        x != null && x.equals("one")
        System.out.println(test1);
    }

    /**
     * Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.
     * Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
     * Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального интерфейса Predicate.
     * @param p
     */
    public static void someMethod(Printable p) {
        p.print();



      List.of(1,2,3)
                .stream()
                .filter((s) -> s % 2 ==0)
                .map((x) -> x*x)
                .forEach(x1 -> System.out.println(x1));
    }
}
