package day2;

import java.util.Arrays;

public class KettleShop {
    public static void main(String[] args) {
        Kettle kettle1 = new Kettle();
        kettle1.boil();
        kettle1.boil(3.0);
        kettle1.setVolume(3.0);
        Kettle kettle2 = new Kettle(1.0);
        System.out.println(kettle2.getVolume());
        kettle1.someMethod("fasd", "asdasd", "asdasda", "asdasdad");
        int count = Kettle.count;
        System.out.println(count);

        Toaster toaster = new Toaster();

    }
}
