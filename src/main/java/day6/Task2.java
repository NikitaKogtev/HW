package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2015, 8543, 150);
        airplane.setYear(2017);
        airplane.setLength(10324);
        airplane.fillUp(211);
        airplane.fillUp(120);
        airplane.info();
    }
}
