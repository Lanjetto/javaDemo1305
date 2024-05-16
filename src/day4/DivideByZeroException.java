package day4;

import java.time.LocalDateTime;

public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("Все плохо");
        LocalDateTime timestamp = LocalDateTime.now();
        System.out.println(timestamp);
    }
}
