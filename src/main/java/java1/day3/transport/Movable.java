package java1.day3.transport;

public interface Movable {
    int speed = 20;
    void move();
    void move(int speed);
    default void moveFast() {
         move(200);
    }
}
