package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\NikitaKogtev\\IdeaProjects\\" +
                "JavaMarathon2021\\src\\main\\resources\\shoes.csv");

        File file1 = new File("C:\\Users\\NikitaKogtev\\IdeaProjects\\" +
                "JavaMarathon2021\\src\\main\\resources\\data.txt");

        file.getParentFile().mkdirs();

        List<String> shoesList = new ArrayList<>();
        List<String> shoesListZero = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            if (file.length() < 5) {
                throw new IllegalArgumentException();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                shoesList.add(line);

            }

            for (String s : shoesList) {
                String[] splitList = s.split(";");
                if (splitList.length > 3) {
                    throw new IllegalArgumentException();
                }
                if (Integer.parseInt(splitList[2]) == 0) {
                    shoesListZero.add(s);
                }
            }

            PrintWriter writer = new PrintWriter(file1);
            for (String s : shoesListZero) {
                writer.println(s);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
