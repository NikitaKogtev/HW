package finalday;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Battleship {
    private GameField player1Field;
    private GameField player2Field;
    private boolean gameIsOn;
    private boolean isPlayer1;
    private int player1ShipCount;
    private int player2ShipCount;

    public Battleship(GameField player1Field, GameField player2Field) {
        if (player1Field.isPlayerFieldArranged()) {
            this.player1Field = player1Field;
        }
        if (player2Field.isPlayerFieldArranged()) {
            this.player2Field = player2Field;
        }
        this.gameIsOn = true;
        this.isPlayer1 = true;
        this.player1ShipCount = 10;
        this.player2ShipCount = 10;
    }

    public void play() {
        // TODO
        System.out.println("Да начнется битва!");
        Random random = new Random();
        isPlayer1 = random.nextBoolean();

        while (gameIsOn) {

            if (isPlayer1) {
                System.out.println("Ходит " + player1Field.getName() + " игрок!");
            } else System.out.println("Ходит " + player2Field.getName() + " игрок!");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            while (!makeMove(isPlayer1, userInput)) {
                userInput = scanner.nextLine();
            }

            if (player1ShipCount == 0 || player2ShipCount == 0) {
                if (player1ShipCount == 0) {
                    System.out.println("Победил " + player2Field.getName());
                } else System.out.println("Победил " + player1Field.getName());
                gameIsOn = false;
            }
        }

    }

    private boolean makeMove(boolean isPlayer1, String userInput) {
        // TODO
        String[] singleUserInput;
        if (!userInput.contains(",")) {
            System.out.println("Неверной введены кординаты выстрела, их нужно вводить через запятую");
            return false;
        } else {
            singleUserInput = userInput.split(",");
        }

        int[] hitCoordinate = new int[2];

        if (singleUserInput.length != 2) {
            System.out.println("Неверной введены кординаты выстрела");
            return false;
        } else {
            int x = Integer.parseInt(singleUserInput[0]);
            int y = Integer.parseInt(singleUserInput[1]);
            if (!(x >= 0 && x < 10 && y >= 0 && y < 10)) {
                System.out.println("Неверно введены координаты выстрела, x и y не могут быть меньше 0 или больше 9");
                return false;
            } else {
                hitCoordinate[0] = x;
                hitCoordinate[1] = y;
            }
        }

        if (isPlayer1) {
            hit(player2Field.getPlayerField(), hitCoordinate);
        } else hit(player1Field.getPlayerField(), hitCoordinate);

        return true;
    }

    private void hit(int[][] playerField, int[] hitCoordinate) {
        // TODO
        if (playerField[hitCoordinate[0]][hitCoordinate[1]] == -1 ||
                playerField[hitCoordinate[0]][hitCoordinate[1]] == 0) {
            System.out.println("Мимо");
            this.isPlayer1 = !isPlayer1;
            return;
        }

        if (shipSank(playerField, hitCoordinate)) {
            System.out.println("Утопил");
            if (isPlayer1) {
                player2ShipCount--;
            } else player1ShipCount--;
        } else {
            System.out.println("Попал");
        }

        playerField[hitCoordinate[0]][hitCoordinate[1]] = 2;
    }

    private boolean shipSank(int[][] playerField, int[] hitCoordinate) {
        int x = hitCoordinate[0];
        int y = hitCoordinate[1];

        List<Integer[]> coordinate = new ArrayList<>();
        if (x != 9) {
            coordinate.add(new Integer[]{x + 1, y});
        }
        if (x != 0) {
            coordinate.add(new Integer[]{x - 1, y});
        }
        if (y != 9) {
            coordinate.add(new Integer[]{x, y + 1});
        }
        if (y != 0) {
            coordinate.add(new Integer[]{x, y - 1});
        }

        for (Integer[] coordinates : coordinate) {
            if (playerField[coordinates[0]][coordinates[1]] == 1) {
                return false;
            }
        }
        return true;
    }
}
