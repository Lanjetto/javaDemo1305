package day3;

public class Driver extends Person {
    private int experience;

    public Driver(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void loud() {
        System.out.println("!@#&@#&");
    }
}
