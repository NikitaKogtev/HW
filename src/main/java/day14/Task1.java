package day14;

import java.io.File;
import java.io.FileNotFoundException;
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
                throw new IllegalArgumentException("Неккоректный входной файл");
            }

            int sum = 0;

            for (String s : num) {
                sum += Integer.parseInt(s);
            }

            System.out.println(sum);
        } catch (FileNotFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
