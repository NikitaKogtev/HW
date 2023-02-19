package finalday;

public class Main {
    public static void main(String[] args) {
        GameField firstPlayer = new GameField("Player1");
        firstPlayer.arrangePlayerField();
        firstPlayer.printField();

        GameField secondPlayer = new GameField("Player2");
        secondPlayer.arrangePlayerField();
        secondPlayer.printField();

        Battleship battleship = new Battleship(firstPlayer, secondPlayer);
        battleship.play();
    }
}
