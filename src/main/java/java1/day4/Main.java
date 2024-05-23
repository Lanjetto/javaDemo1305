package java1.day4;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Calculator calculator = new Calculator();
//        try {
//            calculator.divide(5, 0);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getCause());
//            System.err.println(e.getMessage());
//        } catch (IOException e) {
//            e.printStackTrace(new PrintStream("2.txt"));
//        }
        boolean isValid = LoginPasswordChecker.checkLoginAndPassword(
                "mylogin123",
                "mypassword456",
                "mypassword456");
        System.out.println("Is valid: " + isValid);

    }
}
