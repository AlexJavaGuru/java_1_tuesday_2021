package student_ruslan_pankratov.lesson_6.level_5;

import java.util.Scanner;

//Task 22-31
class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean win = false;
        for (int i = 0; i < field.length; i++) {
            if (playerToCheck == field[i][0] && playerToCheck == field[i][1] && playerToCheck == field[i][2]) {
                win = true;
            }
        }
        return win;
    }


    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean win = false;
        for (int i = 0; i < field.length; i++) {

            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                win = true;
            }
        }
        return win;

    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (isWinPositionForDiagonalsOne(field, playerToCheck) || isWinPositionForDiagonalsTwo(field, playerToCheck)) {
            return true;
        }
        return false;
    }

    boolean isWinPositionForDiagonalsOne(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    boolean isWinPositionForDiagonalsTwo(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - i - 1] != playerToCheck) {
                return false;
            }

        }
        return true;
    }


//    public boolean isWinPositionForDiagonalsTw2o(int[][] field, int playerToCheck) {
//
//        int number = field.length - 1;
//        for (int i = 0; i < field.length; i++) {
//            if (field[i][number] != playerToCheck) {//второй вариант решения, пробегания по диагонали
//                return false;
//            }
//            number--;
//        }
//        return true;
//
//    }


    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean win = false;

        if (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck)) {
            win = true;
        }
        return win;

    }


    public boolean isDrawPosition(int[][] field) {
        boolean draw = true;
//        if (isWinPosition(field, 0)) {
//            draw = false;
//        } else if (isWinPosition(field, 1)) {
//            draw = false;
//        } else {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                    draw = false;
                }
            }
        }


        return draw;
    }


    public int[][] createField() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = -1;
            }
        }
        return arr;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        int playerOne = scanner.nextInt();
        int playerTwo = scanner.nextInt();
        Move move = new Move(playerOne, playerTwo);
        return move;
    }

    public void printFieldToConsole(int[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + "|");
                if (field.length - 1 == j) {
                    System.out.println();
                }
            }
        }
    }


    public void play() {
        int[][] field = createField();
        while (true) {

            printFieldToConsole(field);
            Move move0 = getNextMove();
            System.out.println("Play 0");
            field[move0.getX() - 1][move0.getY() - 1] = 0;

            if (isWinPosition(field, 0)) {
                printFieldToConsole(field);
                System.out.println("Player 0 WIN!");
                break;
            } else if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                printFieldToConsole(field);
                break;
            }


            printFieldToConsole(field);
            RobotAI robotAI = new RobotAI();
            int[][] computer = robotAI.copy(field);
            System.out.println("Play 1");
            if (isWinPosition(computer, 1)) {
                System.out.println("Player 1 WIN!");
                printFieldToConsole(field);
                break;
            } else if (isDrawPosition(computer)) {
                System.out.println("DRAW!");
                printFieldToConsole(field);
                break;
            }
        }
    }
}

