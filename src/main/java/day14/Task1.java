package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String text = scanner.nextLine();
            String[] num = text.split(" ");

            if (num.length != 10) {
                throw new IllegalArgumentException();
            }
            int[] numbers = new int[num.length];
            int counter = 0;

            for (String s : num) {
                numbers[counter++] = Integer.parseInt(s);
            }

            int sum = 0;

            for (int x : numbers) {
                sum += x;
            }

            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
