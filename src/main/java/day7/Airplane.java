package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public int getLength() {
        return length;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.manufacturer + ", год выпуска: " + this.year +
                ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Самолет " + airplane1.getManufacturer() + " длинее, чем самолет "
                    + airplane2.getManufacturer());
        } else if (airplane2.getLength() > airplane1.getLength()) {
            System.out.println("Самолет " + airplane2.getManufacturer() + " длинее, чем самолет "
                    + airplane1.getManufacturer());
        } else System.out.println("Длины самолетов равны");

    }

}
