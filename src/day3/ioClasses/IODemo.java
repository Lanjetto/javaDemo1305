package day3.ioClasses;

import java.io.*;

public class IODemo {
    public static void main(String[] args) {
        String s = null;
        try {
            s = readFromFile("1.txt");
        } catch (IOException e) {
            System.out.println("ОЙ!");
        }
        System.out.println(s);
    }

    public static String readFromFile(String fileName) throws IOException {
        StringBuilder sb;
        try (InputStream is = new FileInputStream(fileName);
             PrintStream ps = new PrintStream("2")) {
            int i = is.read();
            sb = new StringBuilder();
            sb.append((char) i);
            while (i > 0) {
                i = is.read();
                if (i > 0) { sb.append((char)i); }
            }
            ps.println(sb);
        }

        return "Все ок";
    }

}
