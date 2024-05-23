package java1.day2;



public class Kettle {
    private double volume;
    public static int count;

    public Kettle(double volume) {
        this.volume = volume;
        count++;
    }

    public Kettle() {
        this(0.5);
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPrice() {
        System.out.println("Цена за чайник = " + volume * 5);
    }

    public void boil() {
        System.out.println("br-br-br");
    }

    public void boil(double volume) {
        try {
            Thread.sleep((long)volume * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("br-br-br");
    }

    public String someMethod(String ... s) {
        return s[0];
    }

}
