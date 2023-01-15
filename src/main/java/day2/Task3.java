package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Ошибка вводы");
        }

        while (a <= b) {
            if (a % 10 == 0) {
                a++;
                continue;
            }
            if (a % 5 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
