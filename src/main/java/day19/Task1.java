package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\NikitaKogtev\\IdeaProjects\\" +
                "JavaMarathon2021\\src\\main\\resources\\dushi.txt");

        HashMap<String, Integer> map = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            List<String> list = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String[] text = scanner.nextLine().split(" ");
                list.addAll(Arrays.asList(text));
            }

            for (String s : list) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }

            List<Integer> top = new ArrayList<>(map.values());
            Collections.sort(top);
            Collections.reverse(top);

            List<String> topWords = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == top.get(i)) {
                        topWords.add(entry.getKey());
                    }
                }
            }

            System.out.println(topWords);

            System.out.println(map.get("Чичиков")); // Чичиков - 315

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
