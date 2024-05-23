package java1.day4;

import java.io.IOException;
import java.io.PrintWriter;

public class Calculator {
    public void divide(int a, int b) throws IOException {
        try (PrintWriter pw = new PrintWriter("1.txt")) {
            try {
                pw.println(a / b);
            } catch (ArithmeticException e) {
                DivideByZeroException ex = new DivideByZeroException();
                ex.initCause(e);
                throw ex;
            }

        }
    }
}
