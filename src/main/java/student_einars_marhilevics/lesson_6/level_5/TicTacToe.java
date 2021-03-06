package student_einars_marhilevics.lesson_6.level_5;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean win = false;
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2]
                    && field[i][0] == playerToCheck) {
                win = true;
            }
        }
        return win;
    }

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean win = false;
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == field[1][i] && field[1][i] == field[2][i]
                    && field[0][i] == playerToCheck) {
                win = true;
            }
        }
        return win;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return diagonalPositionFromTopToBottom(field, playerToCheck) ||
                diagonalPositionFromBottomToTop(field, playerToCheck);
    }

    private boolean diagonalPositionFromTopToBottom(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    private boolean diagonalPositionFromBottomToTop(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - i - 1] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean win = isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
        return win;
    }

    boolean isDrawPosition(int[][] field) {
        boolean draw = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    draw = false;
                }
            }
        }
        return draw;
    }

    int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter horizontal cell");
        int x = scanner.nextInt();
        System.out.println("please enter vertical cell");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    Move compMove(int[][] field) {
        Random random = new Random();
        int x;
        int y;

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
            if (field[x][y] == -1) {
                return new Move(x, y);
            }
        } while (true);
    }

    Move getCompMove(int[][] field, int player) {
        return compMove(field);
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            Move move1 = getCompMove(field, 1);
            field[move1.getX()][move1.getY()] = 1;
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
        printFieldToConsole(field);
    }
}


