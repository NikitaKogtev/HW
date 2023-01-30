package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
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
                list.add(line);
            }

            for (String s : list) {
                String[] str = s.split(" ");
                if (Integer.parseInt(str[1]) < 0) {
                    throw new IllegalArgumentException();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return list;
    }

}
