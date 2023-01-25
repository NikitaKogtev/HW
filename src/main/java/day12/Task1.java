package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> autoList = new ArrayList<>();

        autoList.add("Hyundai");
        autoList.add("BMW");
        autoList.add("Porsche");
        autoList.add("Audi");
        autoList.add("Lada");

        autoList.add(2, "Mercedes");

        autoList.remove(0);

        System.out.println(autoList);
    }
}
