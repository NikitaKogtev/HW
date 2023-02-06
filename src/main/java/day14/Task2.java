package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        List<String> listFile = parseFileToStringList(file);
        System.out.println(listFile);
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();

        try {

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                list.add(line);
            }

            return list;

        } catch (FileNotFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
