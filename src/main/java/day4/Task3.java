package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] arr = new int[m][n];

        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }

        int sum = 0;
        int index = 0;

        for (int i = 0; i < m; i++) {
            int fsum = 0;
            for (int j = 0; j < n; j++) {
                fsum += arr[i][j];
            }
            if (fsum >= sum) {
                sum = fsum;
                index = i;
            }
        }

        System.out.println(sum);
        System.out.println(index);

    }
}
