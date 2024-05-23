package java1.day3.transport;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Helicopter implements Movable{
    private double speed;

    @Override
    public void move() {
        System.out.println("FLY");
    }

    @Override
    public void move(int speed) {
        System.out.println("FLY FAST");
    }
}
