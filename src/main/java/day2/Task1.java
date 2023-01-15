package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value < 1) {
            System.out.println("Ошибка ввода");
        } else if (value < 4 && value > 1) {
            System.out.println("Малоэтажный дом");
        } else if (value < 8 && value > 5) {
            System.out.println("Среднеэтажный дом");
        } else if (value >= 9) {
            System.out.println("Многоэтажный дом");
        }
    }
}
