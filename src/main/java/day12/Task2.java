package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        addNumber(0, 30, list);
        addNumber(300, 350, list);

        System.out.println(list);

    }

    public static void addNumber(int first, int second, List<Integer> list) {
        for (int i = first; i <= second; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }


    }

}
