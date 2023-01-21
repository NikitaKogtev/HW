package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();

        Player p1 = playerCreate(r.nextInt(100 - 90) + 90);
        Player p2 = playerCreate(r.nextInt(100 - 90) + 90);
        Player p3 = playerCreate(r.nextInt(100 - 90) + 90);

        Player.info();

        Player p4 = playerCreate(r.nextInt(100 - 90) + 90);
        Player p5 = playerCreate(r.nextInt(100 - 90) + 90);
        Player p6 = playerCreate(r.nextInt(100 - 90) + 90);

        Player.info();

        Player p7 = playerCreate(r.nextInt(100 - 90) + 90);
        Player p8 = playerCreate(r.nextInt(100 - 90) + 90);

        Player.info();

        for (int i = 0; i < 100; i++) {
            p3.run();
        }

        Player.info();
    }

    public static Player playerCreate(int stamina) {
        return new Player(stamina);
    }
}
