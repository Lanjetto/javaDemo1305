package main.java;

public class Hello {

    /**
     *8.	Числом Армстронга считается натуральное число, сумма цифр которого, возведенных в N-ную степень (N – количество цифр в числе) равна самому числу. Например, 153 = 1.txt^3 + 5^3 + 3^3. Найдите все 3х значные числа Армстронга
     */



    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {

//            boolean b = String.valueOf(i)
//                    .chars()
//                    .map(c -> (int) Math.pow(Character.getNumericValue(c), 3))
//                    .sum() == i;
//            if (b) System.out.println(i);

            int number = i;
            int armstrong = 0;
            int digits = String.valueOf(i).length();

//            for (int i = 0; i < n; i++) {
//                int digit = Character.getNumericValue(numStr.charAt(i));
//                sum += Math.pow(digit, n);
//            }

            while (number != 0) {
                int digit = number % 10;
                armstrong += Math.pow(digit, digits);
                number /= 10;
            }

            if (armstrong == i) {
                System.out.println(i);
            }
        }
    }
}
