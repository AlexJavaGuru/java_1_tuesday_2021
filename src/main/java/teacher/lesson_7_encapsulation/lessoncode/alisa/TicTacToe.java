package teacher.lesson_7_encapsulation.lessoncode.alisa;

import java.util.Random;
import java.util.Scanner;

//task22-26-31
public class TicTacToe {

    public boolean isWinPositionHorizon(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == playerToCheck && field[i][1] == playerToCheck && field[i][2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionVert(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionDiagonal(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck)
                    || (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck)) {
                return true;
            }
        }
        return false;
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

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (isWinPositionDiagonal(field, playerToCheck) ||
                    isWinPositionVert(field, playerToCheck) ||
                    isWinPositionHorizon(field, playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public int[][] createField() {
        int empty = -1;
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = empty;
            }
        }
        return array;
    }

    public Move getNextMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press which row and column do you choose: ");
        int rowOne = scanner.nextInt();
        int columnTwo = scanner.nextInt();

        Move move = new Move(rowOne, columnTwo);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        System.out.println("game:");
        for (int i = 0; i < field.length; i++) {
            System.out.println();
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + "|");
            }
        }
        System.out.println();
    }


    public void play() {
        int[][] field = createField();

        while (true) {

            printFieldToConsole(field);
            Move moveOne = makeAlisaMove(field);
            makeMove(field, moveOne, 0);

            printFieldToConsole(field);

            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);

            Move moveTwo = getNextMove();
            makeMove(field, moveTwo, 1);
            printFieldToConsole(field);

            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    void makeMove(int[][] field, Move move, int player) {
//        if (checkIfMovePossible(field, move)) {
            field[move.getX()][move.getY()] = player;
//        }
    }
//
//    private boolean checkIfMovePossible(int[][] field, Move move) {
//        return field[move.getX()][move.getY()] == -1;
//    }


    //Alisa
    public Move makeAlisaMove(int[][] field) {
        //scan field
        return scanForWinPosition(field);
    }

    // -1 |  0 | -1
    //  1 |  1 | -1
    // -1 | -1 | -1
    private Move scanForWinPosition(int[][] field) {
        int[][] fakeField = copyArray(field);

        int count = countPossibleOptionsForMove(fakeField);
        while (count != 0) {
            Move fakeMove = generateMove(fakeField);
            if (fakeMove != null) {
                makeMove(fakeField, fakeMove, 1);
                if (isWinPosition(fakeField, 1)) {
                    return fakeMove;
                }
            }
            count--;
        }
        return getRandomMove();
    }

    private int countPossibleOptionsForMove(int[][] fakeField) {
        int count = 0;
        for (int i = 0; i < fakeField.length; i++) {
            for (int j = 0; j < fakeField.length; j++) {
                count++;
            }
        }
        return count;
    }

    private Move getRandomMove() {
        Random random = new Random();
        return new Move(random.nextInt(3), random.nextInt(3));
    }

    private Move generateMove(int[][] fakeField) {
        for (int i = 0; i < fakeField.length; i++) {
            for (int j = 0; j < fakeField.length; j++) {
                if (fakeField[i][j] == -1) {
                    fakeField[i][j] = 5;
                    return new Move(i, j);
                }
            }
        }
        return null;
    }

    private int[][] copyArray(int[][] field) {
        int[][] fakeField = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                fakeField[i][j] = field[i][j];
            }
        }
        return fakeField;
    }


}

