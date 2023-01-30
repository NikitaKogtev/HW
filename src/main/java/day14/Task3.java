package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        List<Person> personList = parseFileToObjList(file);
        System.out.println(personList);
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(" ");
                int year = Integer.parseInt(splitLine[1]);
                if (year < 0) {
                    throw new IllegalArgumentException();
                }
                Person person = new Person(splitLine[0], year);

                list.add(person);
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
