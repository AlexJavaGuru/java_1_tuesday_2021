package student_sergej_pereligin.lesson_6.level_5;



import java.util.Random;
import java.util.Scanner;


public class TicTacToe {

    public static Scanner scanner = new Scanner(System.in);


    public int[][] createField() {  // 27
        int[][] field = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = -1;

            }
        }
        return field;
    }


    public void printFieldToConsole(int[][] field) {  // 29
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(field[i][j] + " | ");
            }

        }
        System.out.println(" ");
    }

    public static Move getNextMove() {  // 28
        System.out.println("Enter your coordinates");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Move(x, y);

    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
          if (isDraw(field)) {
              System.out.println("DRAW!");
              break;
           }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }


    public static boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) { // 22
        boolean isWin = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == playerToCheck) {
                    isWin = true;
                } else {
                    isWin = false;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        return isWin;
    }

//    public static boolean isWinPositionForHorizontalsV2(int[][] field, int playerToCheck) { // 22
//        for (int i = 0; i < field.length; i++) {
//            if (field[i][0] == playerToCheck &&
//                    field[i][1] == playerToCheck &&
//                    field[i][2] == playerToCheck) {
//                return true;
//            }
//        }
//        return false;
//    }

    // 0 |-1 | 0
    //-1 | 0 |-1
    // 0 | 0 | 0

    public static boolean isWinPositionForVertical(int[][] field, int playerToCheck) { // 22
        boolean isWin = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] != playerToCheck) {
                    isWin = false;
                    break;
                } else {
                    isWin = true;
                }
            }
            if (isWin) {
                break;
            }
        }
        return isWin;
    }

    public boolean isWinPositionForDiagonals(int [][]field, int playerToCheck){
        return checkTopToBottom(field, playerToCheck) || checkBottomToTop(field, playerToCheck);
    }

    private boolean checkTopToBottom(int[][] field, int playerToCheck){
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck){
            }
        }
        return false;
    }

    private boolean checkBottomToTop(int[][]field, int playerToCheck){
        for (int i = 0; i < field.length; i++) {
            if(field[field.length -i -1][i] != playerToCheck){

            }
        }
        return false;
    }

    public void requestFiledStateFromUser(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = scanner.nextInt();
            }
        }
    }


    public boolean isWin(int[][] field, int playerToCheck) {  // 25
        //System.out.println("checking win for true");
        if (isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVertical(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    // 0 |0 | 0
    //-1 | 0 |-1
    // 0 | 0 | 0

    public boolean isDraw(int[][] field) { // 24
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) {
                   return false;
                }
            }
        }
        return true;
    }
}






