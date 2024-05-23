package java2.day3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRef {
    public Integer method(Integer a, Integer b) {
        if (b > a)
            return a + b;
        else return a - b;
    }

    public static void main(String[] args) {
        MethodRef methodRef = new MethodRef();
        BiFunction<Integer, Integer, Integer> fun =
                methodRef::method;
    }
}
