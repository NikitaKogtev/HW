package day4;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        int[] arr = new int[value];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        int eight = 0;
        int one = 0;
        int chet = 0;
        int unchet = 0;
        int sum = 0;

        System.out.println("Введено число " + value + ". Сгенерирован массив:");
        System.out.print("[");
        for (int x : arr) {
            if (x > 8) {
                eight++;
            }
            if (x == 1) {
                one++;
            }
            if (x % 2 == 0) {
                chet++;
            } else {
                unchet++;
            }
            sum += x;
            System.out.print(x + ", ");
        }
        System.out.println("]");

        System.out.println("Информация о массиве");
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество числе больше 8: " + eight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных числе: " + chet);
        System.out.println("Количество нечетных числе: " + unchet);
        System.out.println("Сумма всех элементов в массиве: " + sum);

    }
}
