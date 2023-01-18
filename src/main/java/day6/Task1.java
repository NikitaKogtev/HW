package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYear(2011);
        System.out.println(car.yearDifference(2020));

        Motorbike motorbike = new Motorbike("Suzuki", "White", 2017);

        motorbike.info();
        System.out.println(motorbike.yearDifference(2011));
    }
}
