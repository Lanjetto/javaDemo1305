package java1.day2;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5};
        int[] compressedArray = compressArray(inputArray);
        int[] decompressedArray = decompressArray(compressedArray);

        System.out.println("Исходный массив: " + Arrays.toString(inputArray));
        System.out.println("Сжатый массив: " + Arrays.toString(compressedArray));
        System.out.println("Распакованный массив: " + Arrays.toString(decompressedArray));

        System.out.println("Результат равен исходному массиву: " + Arrays.equals(inputArray, decompressedArray));
    }

    public static int[] compressArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                sb.append(arr[i - 1]).append(count);
                count = 1;
            }
        }

        sb.append(arr[arr.length - 1]).append(count);

        String compressedString = sb.toString();
        int[] compressedArray = new int[compressedString.length()];

        for (int i = 0; i < compressedString.length(); i++) {
            compressedArray[i] = Character.getNumericValue(compressedString.charAt(i));
        }

        return compressedArray;
    }

    public static int[] decompressArray(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i += 2) {
            int num = arr[i];
            int count = arr[i + 1];
            for (int j = 0; j < count; j++) {
                sb.append(num);
            }
        }

        String decompressedString = sb.toString();
        int[] decompressedArray = new int[decompressedString.length()];

        for (int i = 0; i < decompressedString.length(); i++) {
            decompressedArray[i] = Character.getNumericValue(decompressedString.charAt(i));
        }

        return decompressedArray;
    }
}