package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[100];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_000);
        }

        int max = arr[0];
        int min = arr[0];
        int zero = 0;
        int sumZero = 0;

        for (int x : arr) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                zero++;
                sumZero += x;
            }
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(zero);
        System.out.println(sumZero);

    }
}
