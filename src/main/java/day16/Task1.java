package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test2");
        printResult(file);
    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strNum = line.split(" ");
            int sum = 0;

            for (String s : strNum) {
                sum += Integer.parseInt(s);
            }

            double value = (double) sum / strNum.length;

            System.out.printf(value + " --> %.3f", value);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

