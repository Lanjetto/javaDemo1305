package java1.day3.practice4;

public class MusicShop {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Drum(5.3),
                new Reed(4.0),
                new Guitar(6)
        };
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
