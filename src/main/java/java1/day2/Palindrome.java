package java1.day2;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panama"; // Пример палиндрома
        String str2 = "Hello, World!"; // Пример не палиндрома

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        // Приводим строку к нижнему регистру и оставляем только буквы и цифры
        String filteredStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Проверяем, равна ли строка своему обратному порядку
        return filteredStr.equals(new StringBuilder(filteredStr).reverse().toString());
    }
}
