package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[100];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_000);
        }

        int sum = 0;
        int index = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int sumThree = arr[i] + arr[i + 1] + arr[i + 2];
            if (sumThree > sum) {
                sum = sumThree;
                index = i;
            }
        }
        System.out.println(sum);
        System.out.println(index);

    }
}
