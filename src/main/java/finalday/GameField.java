package finalday;

import day7.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameField {
    private String name;
    private int[][] playerField;
    private boolean playerFieldArranged;

    public GameField(String name) {
        this.name = name;
        playerField = new int[][]{
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
    }

    public String getName() {
        return name;
    }

    public int[][] getPlayerField() {
        return playerField;
    }

    public boolean isPlayerFieldArranged() {
        return playerFieldArranged;
    }

    private void getUserInput(String message, int shipSize) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String text = scanner.nextLine();
        while (!arrangeShip(text, shipSize)) {
            System.out.println(message);
            text = scanner.nextLine();
        }
    }

    public void arrangePlayerField() {
        System.out.println("Начнем расставлять корбали на поле " + getName() + ". Другой игрок не смотри");

        getUserInput("Введите кординаты четырехпалубного корабля (формат x,y;x,y;x,y;x,y)", 4);
        getUserInput("Введите кординаты первого трехпалубного корабля (формат x,y;x,y;x,y)", 3);
        getUserInput("Введите кординаты второго трехпалубного корабля (формат x,y;x,y;x,y)", 3);
        getUserInput("Введите кординаты первого двухпалубного корабля (формат x,y;x,y)", 2);
        getUserInput("Введите кординаты второго двухпалубного корабля (формат x,y;x,y)", 2);
        getUserInput("Введите кординаты третьего двухпалубного корабля (формат x,y;x,y)", 2);
        getUserInput("Введите кординаты первого однопалубного корабля (формат x,y)", 1);
        getUserInput("Введите кординаты второго однопалубного корабля (формат x,y)", 1);
        getUserInput("Введите кординаты третьего однопалубного корабля (формат x,y)", 1);
        getUserInput("Введите кординаты четвертого однопалубного корабля (формат x,y)", 1);

        playerFieldArranged = true;

    }

    // Выводит поле на экран
    public void printField() {
        for (int i = 0; i < playerField.length; i++) {
            for (int j = 0; j < playerField.length; j++) {
                System.out.print(playerField[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private boolean arrangeShip(String userInput, int shipSize) {
        boolean accept;

        String[] arrCoordinates;

        if (shipSize > 1) {
            arrCoordinates = userInput.split(";");
        } else {
            arrCoordinates = new String[]{userInput};
        }

        for (String s : arrCoordinates) {
            if (s.charAt(1) == ',') {
                String[] singleCoordinates = s.split(",");
                if (singleCoordinates.length != 2) {
                    System.out.println("Неверно введены координаты, x и y нужно вводить через запятую (,)");
                    return false;
                } else {
                    int x = Integer.parseInt(singleCoordinates[0]);
                    int y = Integer.parseInt(singleCoordinates[1]);
                    if (!(x >= 0 && x <= 9 && y >= 0 && y <= 9)) {
                        System.out.println("Неверно введены координаты, x и y не могут быть меньше 0 или больше 9");
                        return false;
                    }
                }
            }
        }

        if (arrCoordinates.length != shipSize) {
            System.out.println("Неверно введено количество кооридант для данного типа коробля");
            return false;
        }

        int[][] valueCoordinates = new int[shipSize][2];
        int counter = 0;

        for (String s : arrCoordinates) {
            String[] parseCoordinates = s.split(",");
            valueCoordinates[counter][0] = Integer.parseInt(parseCoordinates[0]);
            valueCoordinates[counter][1] = Integer.parseInt(parseCoordinates[1]);
            counter++;
        }

        for (int i = 0; i < valueCoordinates.length - 1; i++) {
            if (!(Math.abs(valueCoordinates[i][0] - valueCoordinates[i + 1][0]) == 1 &&
                    valueCoordinates[i][1] == valueCoordinates[i + 1][1] ||
                    Math.abs(valueCoordinates[i][1] - valueCoordinates[i + 1][1]) == 1 &&
                            valueCoordinates[i][0] == valueCoordinates[i + 1][0])) {
                System.out.println("Неверно введены координаы, значения координат не последовательны");
                return false;
            }
        }

        accept = arrangementPossible(valueCoordinates, shipSize);

        if (accept) {
            arrangeShip(valueCoordinates, shipSize);
        }

        return accept;
    }

    private void arrangeShip(int[][] shipCoordinates, int shipSize) {
        for (int i = 0; i < shipCoordinates.length; i++) {
            playerField[shipCoordinates[i][0]][shipCoordinates[i][1]] = 1;
        }

        List<Integer[]> aureoles = getShipAureole(shipCoordinates, shipSize);

        for (Integer[] aureole : aureoles) {
            playerField[aureole[0]][aureole[1]] = 0;
        }
    }

    private boolean arrangementPossible(int[][] shipCoordinates, int shipSize) {

        for (int i = 0; i < shipCoordinates.length; i++) {
            if (playerField[shipCoordinates[i][0]][shipCoordinates[i][1]] == 1) {
                System.out.println("Невозможно поставить корабль, это место занято");
                return false;
            }
        }

        for (int i = 0; i < shipCoordinates.length; i++) {
            if (playerField[shipCoordinates[i][0]][shipCoordinates[i][1]] == 0) {
                System.out.println("Невозможно поставить корабль, это зона ореала другого корабля");
                return false;
            }
        }
        return true;
    }

    private boolean containsArray(List<Integer[]> aureole, Integer[] xy) {
        for (Integer[] aureoles : aureole) {
            if (aureoles[0] == xy[0] && aureoles[1] == xy[1]) {
                return true;
            }
        }
        return false;
    }

    private boolean containArray(List<int[]> aureole, Integer[] xy) {
        for (int[] aureoles : aureole) {
            if (aureoles[0] == xy[0] && aureoles[1] == xy[1]) {
                return true;
            }
        }
        return false;
    }

    private List<Integer[]> getShipAureole(int[][] shipCoordinates, int shipSize) {
        List<Integer[]> aureole = new ArrayList<>();
        List<int[]> deleteCoordinates = new ArrayList<>(Arrays.asList(shipCoordinates));

        for (int i = 0; i < shipCoordinates.length; i++) {
            int x = shipCoordinates[i][0];
            int y = shipCoordinates[i][1];


            if (!containsArray(aureole, new Integer[]{x + 1, y + 1}) && x + 1 < 10 && y + 1 < 10
                    && !containArray(deleteCoordinates, new Integer[]{x + 1, y + 1})) {
                aureole.add(new Integer[]{x + 1, y + 1});
            }
            if (!containsArray(aureole, new Integer[]{x + 1, y}) && x + 1 < 10
                    && !containArray(deleteCoordinates, new Integer[]{x + 1, y})) {
                aureole.add(new Integer[]{x + 1, y});
            }
            if (!containsArray(aureole, new Integer[]{x + 1, y - 1}) && x + 1 < 10 && y - 1 >= 0
                    && !containArray(deleteCoordinates, new Integer[]{x + 1, y - 1})) {
                aureole.add(new Integer[]{x + 1, y - 1});
            }

            if (!containsArray(aureole, new Integer[]{x - 1, y + 1}) && x - 1 >= 0 && y + 1 < 10
                    && !containArray(deleteCoordinates, new Integer[]{x - 1, y + 1})) {
                aureole.add(new Integer[]{x - 1, y + 1});
            }
            if (!containsArray(aureole, new Integer[]{x - 1, y}) && x - 1 >= 0
                    && !containArray(deleteCoordinates, new Integer[]{x - 1, y})) {
                aureole.add(new Integer[]{x - 1, y});
            }
            if (!containsArray(aureole, new Integer[]{x - 1, y - 1}) && x - 1 >= 0 && y - 1 >= 0
                    && !containArray(deleteCoordinates, new Integer[]{x - 1, y - 1})) {
                aureole.add(new Integer[]{x - 1, y - 1});
            }

            if (!containsArray(aureole, new Integer[]{x, y + 1}) && y + 1 < 10
                    && !containArray(deleteCoordinates, new Integer[]{x, y + 1})) {
                aureole.add(new Integer[]{x, y + 1});
            }

            if (!containsArray(aureole, new Integer[]{x, y - 1}) && y - 1 >= 0
                    && !containArray(deleteCoordinates, new Integer[]{x, y - 1})) {
                aureole.add(new Integer[]{x, y - 1});
            }

        }
        return aureole;
    }
}
