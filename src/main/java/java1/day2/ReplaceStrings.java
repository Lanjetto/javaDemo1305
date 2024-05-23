package java1.day2;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *3.	Заменить каждое второе вхождение строки
 * Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP». Например, строка
 * "Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
 * должна быть преобразована в
 * "Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."
 *
 *
 */
public class ReplaceStrings {
    public static void main(String[] args) {
        String input = """
                Object-oriented programming is a programming language model organized around objects
                rather than "actions" and data rather than logic.
                Object-oriented programming blabla.
                Object-oriented programming bla.
                Object-oriented programming blabla.
                """;
        String target = "object-oriented programming";
        String replacement = "OOP";
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile(target, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        int lastEnd = 0;

        while (matcher.find()) {
            count++;
            sb.append(input, lastEnd, matcher.start());
            if (count %2 == 0) {
                sb.append(replacement);
            } else {
                sb.append(matcher.group());
            }
            lastEnd = matcher.end();
        }

        sb.append(input.substring(lastEnd));
        System.out.println(sb);
    }
}
