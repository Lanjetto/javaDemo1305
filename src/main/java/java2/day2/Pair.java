package java2.day2;

import java1.day3.Person;
import java1.day3.transport.Movable;

public class Pair<T extends Person & Movable> {
    private final T first;
    private final T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }


    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second='" + second + '\'' +
                '}';
    }

    public static <V,S> boolean isContain(S obj, V[] arr) {


        for (V v : arr) {
            if (obj.equals(v)) {
                return true;
            }
        }
        return false;
    }
}
