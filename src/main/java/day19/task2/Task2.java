package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, Point> map = new HashMap<>();

        File file = new File("C:\\Users\\NikitaKogtev\\IdeaProjects\\" +
                "JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(" ");
                map.put(Integer.parseInt(str[0]), new Point(Integer.parseInt(str[1]), Integer.parseInt(str[2])));

            }

            Scanner scanner1 = new Scanner(System.in);
            String line = scanner1.nextLine();
            String[] str = line.split(" ");

            int[] num = new int[str.length];
            int counter = 0;
            for (String s : str) {
                num[counter++] = Integer.parseInt(s);
            }

            Point firstSquare = new Point(num[0], num[1]);
            Point secondSquare = new Point(num[2], num[3]);

            List<Integer> listCar = new ArrayList<>();

            for (Map.Entry<Integer, Point> entry : map.entrySet()) {
                if (entry.getValue().getX() > firstSquare.getX() && entry.getValue().getX() < secondSquare.getX()
                        && entry.getValue().getY() > secondSquare.getY() && entry.getValue().getY() < firstSquare.getY()) {

                    listCar.add(entry.getKey());
                }
            }

            System.out.println(listCar);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}

