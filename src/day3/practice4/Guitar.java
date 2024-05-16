package day3.practice4;

public class Guitar implements Instrument {

    private int stringCount;

    public Guitar(int stringCount) {
        this.stringCount = stringCount;

    }

    public int getStringCount() {
        return stringCount;
    }

    @Override
    public void play() {
        System.out.println("Играю на " +
                stringCount + " струнной гитаре");
    }
}
