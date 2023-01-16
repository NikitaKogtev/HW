package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Hyundai");
        car.setColor("White");
        car.setYear(2020);

        System.out.println("Car model: " + car.getModel() + " , " + "Car color: " + car.getColor() + " , " +
                "Car year: " + car.getYear());
    }
}
