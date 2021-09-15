package student_alberts_matrozis.lesson_6.level_6;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.AIplay();
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        } else if (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck) {
            return true;
        } else if (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck) {
            return true;
        } else if (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForHorizontals(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFieldFull(int[][] field) {
        boolean isFieldFull = true;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == -1) {
                    isFieldFull = false;
                    break;
                }
            }
        }
        return isFieldFull;
    }

    public boolean isDrawPosition(int[][] field) {
        if (isFieldFull(field)) {
            return !isWinPosition(field, 0) && !isWinPosition(field, 1);
        } else {
            return false;
        }
    }

    public int[][] createField() {
        int[][] field = new int[3][3];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x coordinate!");
        int x = s.nextInt();
        System.out.println("Enter y coordinate!");
        int y = s.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    public void AIplay() {
        SimpleAI AIrobot = new SimpleAI();
        int[][] field = createField();
        int[][] completedField = AIrobot.AIplay(field);
        if (isWinPosition(completedField, 0)) {
            printFieldToConsole(completedField);
            System.out.println("Player 0 WIN!");
        } else if (isWinPosition(completedField, 1)) {
            printFieldToConsole(completedField);
            System.out.println("Player 1 WIN!");
        } else if (isDrawPosition(completedField)) {
            printFieldToConsole(completedField);
            System.out.println("DRAW!");
        }
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getY() - 1][move0.getX() - 1] = 0;
            if (isWinPosition(field, 0)) {
                printFieldToConsole(field);
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getY() - 1][move1.getX() - 1] = 1;
            if (isWinPosition(field, 1)) {
                printFieldToConsole(field);
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
