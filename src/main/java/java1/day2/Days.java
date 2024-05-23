package java1.day2;

public enum Days {
    MO(1), TU(2), WE(3), TH(4), FR(5), SAT(6), SU(7);
    private int day;

    Days(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}
