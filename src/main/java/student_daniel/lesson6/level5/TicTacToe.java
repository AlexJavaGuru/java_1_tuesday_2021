package student_daniel.lesson6.level5;

import java.util.Scanner;

public class TicTacToe {
    //Task 22 23 24 25 26 27 28 29 30 33
    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean winState = false;
        for (int i = 0; i < field.length; i++) {
            winState = true;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != playerToCheck) {
                    winState = false;
                    break;
                }
            }
            if (winState == true) {
                break;
            }
        }
        return winState;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean winState = false;
        for (int j = 0; j < field.length; j++) {
            winState = true;
            for (int i = 0; i < field.length; i++) {
                if (field[i][j] != playerToCheck) {
                    winState = false;
                    break;
                }
            }
            if (winState == true) {
                break;
            }
        }
        return winState;
    }

    public boolean isWinPositionForDiagonalsOne(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonalsTwo(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[0].length - i - 1] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean winState = isWinPositionForDiagonalsOne(field, playerToCheck) ||
                isWinPositionForDiagonalsTwo(field, playerToCheck);
        return winState;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean winState = isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);
        return winState;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int[][] fieldArray = new int[3][3];
        for (int i = 0; i < fieldArray.length; i++) {
            for (int j = 0; j < fieldArray[i].length; j++) {
                fieldArray[i][j] = -1;
            }
        }
        return fieldArray;
    }

    public Move getNextMove(int[][] field, int playerToCheck) {
        Scanner myScanner = new Scanner(System.in);
        do {
            if (playerToCheck == 0) {
                System.out.println(resetColor + "=====================================================");
                System.out.println("PLAYER 1");
            } else {
                System.out.println(resetColor + "=====================================================");
                System.out.println("PLAYER 2");
            }
            System.out.println(greenColor + "Please input coordinates X (Horizontal): ");
            int coordinateX = myScanner.nextInt();
            while ((coordinateX < 0 || coordinateX > 2)) {
                System.out.println(redColor + "X = " + coordinateX + " >>> Incorrect value, please use 0, 1 or 2");
                System.out.println();
                System.out.println(greenColor + "Please re-enter coordinates X (Horizontal): ");
                coordinateX = myScanner.nextInt();
            }

            System.out.println(greenColor + "Please input coordinate Y (Vertical): ");
            int coordinateY = myScanner.nextInt();
            while ((coordinateY < 0 || coordinateY > 2)) {
                System.out.println(redColor + "Y = " + coordinateY + " >>> Incorrect value, please use 0, 1 or 2");
                System.out.println(greenColor + "Please re-enter coordinates Y (Vertical): ");
                coordinateY = myScanner.nextInt();

            }
            if (!(field[coordinateX][coordinateY] == -1)) {
                System.out.println(resetColor + "=====================================================");
                System.out.println(redColor + "Cell already taken, use other X and Y coordinates");
                System.out.println(resetColor + "=====================================================");
                printFieldToConsole(field);
                continue;
            }

            Move myMove = new Move(coordinateX, coordinateY);
            return myMove;
        } while (true);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(blueColor + field[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            //PLAYER 1
            printFieldToConsole(field);
            if (!isDrawPosition(field) && !isWinPosition(field, 0) && !isWinPosition(field, 1)) {
                Move move0 = getNextMove(field, 0);
                if (field[move0.getX()][move0.getY()] == -1) {
                    field[move0.getX()][move0.getY()] = 0;
                }
            }

            if (isWinPosition(field, 0)) {
                printFieldToConsole(field);
                System.out.println(resetColor + "=====================================================");
                System.out.println(blueColor + "PLAYER 1 WINS!");
                System.out.println(resetColor + "=====================================================");
                break;
            }

            //PLAYER 2
            printFieldToConsole(field);
            if (!isDrawPosition(field) && !isWinPosition(field, 0) && !isWinPosition(field, 1)) {
                Move move1 = getNextMove(field, 1);
                if (field[move1.getX()][move1.getY()] == -1) {
                    field[move1.getX()][move1.getY()] = 1;
                }
            }

            if (isWinPosition(field, 1)) {
                printFieldToConsole(field);
                System.out.println(resetColor + "=====================================================");
                System.out.println(blueColor + "PLAYER 2 WINS!");
                System.out.println(resetColor + "=====================================================");
                break;
            }

            if (isDrawPosition(field)) {
                System.out.println(resetColor + "=====================================================");
                System.out.println(blueColor + "DRAW!");
                System.out.println(resetColor + "=====================================================");
                break;
            }
        }
    }
}