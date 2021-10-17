package student_julija_kuzmicova.lesson_6.level_5;

import java.util.Random;
import java.util.Scanner;

//Task_22, Task_23, Task_24, Task_25, Task_26, Task_27, Task_28, Task_29, Task_30, Task_33
class TicTacToe {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            //printFieldToConsole(field);
            System.out.println("Computer move:");
            Move move0 = computerMove(field);
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            //printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            System.out.println("Player move:");
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

    public int[][] createField() {
        int[][] field = new int[3][3];
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++) {
                if(field[i][0] == playerToCheck && field[i][1] == playerToCheck && field[i][2] == playerToCheck) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++) {
                if(field[0][j] == playerToCheck && field[1][j] == playerToCheck && field[2][j] == playerToCheck) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++) {
                if(field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
                    return true;
                } else if(field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++) {
                if(isWinPositionForHorizontals(field,playerToCheck)) {
                    return true;
                } else if(isWinPositionForVerticals(field,playerToCheck)) {
                    return true;
                } else if(isWinPositionForDiagonals(field,playerToCheck)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++) {
                if(field[i][j] == -1) {
                    return false;
                } else if(isWinPosition(field, 0) || isWinPosition(field, 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Move getNextMove() {
        do{
            System.out.println("Please enter an X coordinate in the range from 1 till 3...");
            int coordinateX = scanner.nextInt();
            if(coordinateX < 0 || coordinateX > 4) {
                System.out.println("You entered an invalid number. Please try again.");
                continue;
            }
            System.out.println("Please enter an Y coordinate in the range from 1 till 3...");
            int coordinateY = scanner.nextInt();
            if(coordinateY < 0 || coordinateY > 4) {
                System.out.println("You entered an invalid number. Please try again.");
                continue;
            }

            Move move = new Move(coordinateX-1, coordinateY-1);
            return move;
        } while(true);
    }

    public Move computerMove(int[][] field) {
        do{
            int coordinateX = random.nextInt(3);
            int coordinateY = random.nextInt(3);
            if(field[coordinateX][coordinateY] == -1) {
                return new Move(coordinateX, coordinateY);
            }
        }while(true);
    }

    public void printFieldToConsole(int[][] field) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }
}
