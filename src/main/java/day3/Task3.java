package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int value = 0;
        while (value <= 5) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (y == 0) {
                System.out.println("Деление на 0");
                value++;
                continue;
            }
            System.out.println(x / y);
            value++;
        }
    }
}
