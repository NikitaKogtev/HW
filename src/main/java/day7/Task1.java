package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air = new Airplane("Airbus", 2015, 7000, 150);
        Airplane air1 = new Airplane("Boeing", 2014, 6000, 150);
        Airplane.compareAirplanes(air, air1);
    }
}