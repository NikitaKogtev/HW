package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayer = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayer < 6) {
            countPlayer++;
        }
    }

    public static int getCountPlayers() {
        return countPlayer;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }

        stamina--;

        if (stamina == 0) {
            countPlayer--;
            System.out.println("Игрок устал ему нужен отдых");
        }
    }

    public static void info() {
        if (getCountPlayers() < 6) {
            System.out.println("Команды не полные на поле еще " +
                    (6 - countPlayer) + " свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }

}
