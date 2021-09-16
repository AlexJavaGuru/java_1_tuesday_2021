package student_alberts_matrozis.lesson_6.level_5;

import static student_alberts_matrozis.albertsUtils.Utils.*;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest testRunner = new TicTacToeTest();
        testRunner.verticalWinPositionTest();
        testRunner.horizontalWinPositionTest();
        testRunner.diagonalWinPositionTest();
        testRunner.winPositionTest();
        testRunner.drawPositionTest();
    }

    public void verticalWinPositionTest() {
        TicTacToe subject = new TicTacToe();
        int[][] field = {
                {-1, -1, 1}, // 0
                {-1, -1, 1}, // 1
                {-1, -1, 1}  // 2
        };
        boolean receivedResult = subject.isWinPositionForVerticals(field, 1);
        boolean exceptedResult = true;
        check(exceptedResult, receivedResult);
    }

    public void horizontalWinPositionTest() {
        TicTacToe subject = new TicTacToe();
        int[][] field = {
                {-1, -1, -1}, // 0
                {1, 1, 1}, // 1
                {-1, -1, -1}  // 2
        };
        boolean receivedResult = subject.isWinPositionForHorizontals(field, 1);
        boolean exceptedResult = true;
        check(exceptedResult, receivedResult);
    }
    public void diagonalWinPositionTest() {
        TicTacToe subject = new TicTacToe();
        int[][] field = {
                {1, -1, -1},
                {-1, 1, -1},
                {-1, -1, 1}
        };
        boolean receivedResult = subject.isWinPositionForDiagonals(field, 1);
        boolean exceptedResult = true;
        check(exceptedResult, receivedResult);
    }

    public void winPositionTest() {
        TicTacToe subject = new TicTacToe();
        int[][] field = {
                {1, -1, -1},
                {-1, 1, -1},
                {-1, -1, 1}
        };
        boolean receivedResult = subject.isWinPosition(field, 1);
        boolean exceptedResult = true;
        check(exceptedResult, receivedResult);
    }

    public void drawPositionTest() {
        TicTacToe subject = new TicTacToe();
        int[][] field = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 1, 0}
        };
        boolean receivedResult = subject.isDrawPosition(field);
        boolean exceptedResult = true;
        check(exceptedResult, receivedResult);
    }
}
