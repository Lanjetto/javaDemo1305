package java1.day2;

public class UchastnikPalindrome {
    static public void main(String[] args) {
        if (args.length < 1) {
            System.err.println("exit");
            return;
        }

        String target = args[0];

        target = target.replaceAll("([\s?!:;,.])", "");

        System.out.println(target);
        System.out.printf("isPalindrome: %b\n", isPalindrome(target.toString()));
    }

    static Boolean isPalindrome(String seq) {
        if (seq.length() == 0) {
            return true;
        }

        for (int i = 0, j = seq.length() - 1; i <= j; i++, j--) {
            if (seq.charAt(i) != seq.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}