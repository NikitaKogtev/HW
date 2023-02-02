package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        try {
            PrintWriter writer = new PrintWriter("file1.txt", StandardCharsets.UTF_8);

            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                writer.print(random.nextInt(100) + " ");
            }
            writer.close();


            File file = new File("file1.txt");
            PrintWriter writer1 = new PrintWriter("file2.txt", StandardCharsets.UTF_8);

            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strNum = line.split(" ");

            int sum = 0;

            for (int i = 0; i < 1000; i++) {
                sum += Integer.parseInt(strNum[i]);
                if (i % 20 == 0) {
                    writer1.print((double) sum / 20 + " ");
                    sum = 0;
                }
            }
            writer1.close();
        } catch (IOException e) {
            System.out.println("Возники проблемы при чтении/создании файла");
        }

        printResult(new File("file2.txt"));

    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strDouble = line.split(" ");
            double sum = 0.0;

            for (String s : strDouble) {
                sum += Double.parseDouble(s);
            }

            System.out.println((int) sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
