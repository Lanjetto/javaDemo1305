package day4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
