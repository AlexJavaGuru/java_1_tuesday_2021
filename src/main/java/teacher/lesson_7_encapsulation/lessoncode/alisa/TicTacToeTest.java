package teacher.lesson_7_encapsulation.lessoncode.alisa;

//task22-26-31
public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.checkTestHorizon();
        test.checkTestPositionVert();
        test.checkTestPositionDiagonal();
        test.checkTestDrawPosition();
        test.checkTestWinPosition();
        test.checkMove();
        test.print();
    }


    public void checkTestHorizon() {
        TicTacToe test = new TicTacToe();
        boolean condition = test.isWinPositionHorizon(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 0, 1}}, 0);
        if (condition) {
            System.out.println("The player is : Win");
        } else {
            System.out.println("The player is : Lose");
        }
    }

    public void checkTestPositionVert() {
        TicTacToe test = new TicTacToe();
        boolean condition = test.isWinPositionVert(new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 1}}, 0);
        if (condition) {
            System.out.println("The player is: Win");
        } else {
            System.out.println("The player is : Lose");
        }
    }

    public void checkTestPositionDiagonal() {
        TicTacToe test = new TicTacToe();
        boolean condition = test.isWinPositionDiagonal(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, 1);
        if (condition) {
            System.out.println("The player is : Win");
        } else {
            System.out.println("The player is : Lose");
        }
    }

    public void checkTestDrawPosition() {
        TicTacToe test = new TicTacToe();
        boolean condition = test.isDrawPosition(new int[][]{{0, -1, 0}, {1, 1, -1}, {0, 1, 0}});
        if (condition) {
            System.out.println(" is draw");
        } else {
            System.out.println("false");
        }
    }

    public void checkTestWinPosition() {
        TicTacToe test = new TicTacToe();
        boolean condition = test.isWinPosition(new int[][]{{0, 0, 1}, {0, 0, 1}, {0, 0, 1}}, 0);
        if (condition) {
            System.out.println("You win");
        } else {
            System.out.println("lose");
        }
    }

    public void checkMove() {
        TicTacToe test = new TicTacToe();
        int[][] field = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        Move move = new Move(2, 2);
        test.makeMove(field, move, 1);
        if (field[2][2] == 1) {
            System.out.println("Move is correct");
        } else {
            System.out.println("Move is not correct");
        }
    }

    public void print() {
        TicTacToe test = new TicTacToe();
        test.printFieldToConsole(new int[][]{{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}});
    }
}