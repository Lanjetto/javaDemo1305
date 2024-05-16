package day4;

import java.util.regex.Pattern;

public class LoginPasswordChecker {
    private static final int MAX_LENGTH = 20;
    private static final String ALLOWED_CHARS = "^[a-zA-Z0-9_]+$";

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (login == null
                || login.length() >= MAX_LENGTH
                || !Pattern.matches(ALLOWED_CHARS, login)) {
            throw new WrongLoginException("Invalid login format.");
        }
    }
    private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null
                || password.length() >= MAX_LENGTH
                || !Pattern.matches(ALLOWED_CHARS, password)
                || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password format or mismatch.");
        }
    }
}
