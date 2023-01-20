package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        String s = "";

        for (int i = 0; i <= 20_000; i++) {
            s += i + " ";
        }
        //       System.out.println(s);
        long stopTime = System.currentTimeMillis();

        System.out.println("Время работы программы 1: " + (stopTime - startTime));

        long startTime2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20_000; i++) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        //       System.out.println(stringBuilder.toString());
        long stopTime2 = System.currentTimeMillis();

        System.out.println("Время работы программы 2: " + (stopTime2 - startTime2));
    }
}
