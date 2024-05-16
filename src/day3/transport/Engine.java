package day3.transport;

public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public String getCompany() {
        return company;
    }
}
