package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Ошибка вводы");
        }

        for (int i = a; i <= b; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
