package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();

        Player p1 = playerCreate(r.nextInt(Player.MAX_STAMINA - Player.MIN_STAMINA) + Player.MIN_STAMINA);
        Player p2 = playerCreate(r.nextInt(Player.MAX_STAMINA - Player.MIN_STAMINA) + Player.MIN_STAMINA);
        Player p3 = playerCreate(r.nextInt(Player.MAX_STAMINA - Player.MIN_STAMINA) + Player.MIN_STAMINA);

        Player.info();

        Player p4 = playerCreate(r.nextInt(Player.MAX_STAMINA - Player.MIN_STAMINA) + Player.MIN_STAMINA);
        Player p5 = playerCreate(r.nextInt(Player.MAX_STAMINA - Player.MIN_STAMINA) + Player.MIN_STAMINA);
        Player p6 = playerCreate(r.nextInt(Player.MAX_STAMINA - Player.MIN_STAMINA) + Player.MIN_STAMINA);

        Player.info();

        Player p7 = playerCreate(r.nextInt(Player.MAX_STAMINA - Player.MIN_STAMINA) + Player.MIN_STAMINA);
        Player p8 = playerCreate(r.nextInt(Player.MAX_STAMINA - Player.MIN_STAMINA) + Player.MIN_STAMINA);

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
