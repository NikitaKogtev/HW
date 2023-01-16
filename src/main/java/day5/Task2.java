package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("Yamaha", "White", 2015);

        System.out.println("Bike model: " + motorbike.getModel() + " , " + "Bike color: " + motorbike.getColor() + " , " +
                "Bike year: " + motorbike.getYear());
    }
}
