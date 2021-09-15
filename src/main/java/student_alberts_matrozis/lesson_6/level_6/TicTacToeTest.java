package student_alberts_matrozis.lesson_6.level_6;

import student_alberts_matrozis.albertsUtils.Utils;

import java.util.Arrays;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest testRunner = new TicTacToeTest();
        testRunner.verticalWinPositionTest();
        testRunner.horizontalWinPositionTest();
        testRunner.diagonalWinPositionTest();
        testRunner.winPositionTest();
        testRunner.drawPositionTest();
        testRunner.createFieldTest();
    }

    public void verticalWinPositionTest() {
        TicTacToe subject = new TicTacToe();
        Utils utils = new Utils();
        int[][] field = {
                {-1, -1, 1}, // 0
                {-1, -1, 1}, // 1
                {-1, -1, 1}  // 2
        };
        boolean receivedResult = subject.isWinPositionForVerticals(field, 1);
        boolean exceptedResult = true;
        utils.check(exceptedResult, receivedResult);
    }

    public void horizontalWinPositionTest() {
        TicTacToe subject = new TicTacToe();
        Utils utils = new Utils();
        int[][] field = {
                {-1, -1, -1}, // 0
                {1, 1, 1}, // 1
                {-1, -1, -1}  // 2
        };
        boolean receivedResult = subject.isWinPositionForHorizontals(field, 1);
        boolean exceptedResult = true;
        utils.check(exceptedResult, receivedResult);
    }
    public void diagonalWinPositionTest() {
        TicTacToe subject = new TicTacToe();
        Utils utils = new Utils();
        int[][] field = {
                {1, -1, -1},
                {-1, 1, -1},
                {-1, -1, 1}
        };
        boolean receivedResult = subject.isWinPositionForDiagonals(field, 1);
        boolean exceptedResult = true;
        utils.check(exceptedResult, receivedResult);
    }

    public void winPositionTest() {
        TicTacToe subject = new TicTacToe();
        Utils utils = new Utils();
        int[][] field = {
                {1, -1, -1},
                {-1, 1, -1},
                {-1, -1, 1}
        };
        boolean receivedResult = subject.isWinPosition(field, 1);
        boolean exceptedResult = true;
        utils.check(exceptedResult, receivedResult);
    }

    public void drawPositionTest() {
        TicTacToe subject = new TicTacToe();
        Utils utils = new Utils();
        int[][] field = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 1, 0}
        };
        boolean receivedResult = subject.isDrawPosition(field);
        boolean exceptedResult = true;
        utils.check(exceptedResult, receivedResult);
    }

    public void createFieldTest() {
        TicTacToe subject = new TicTacToe();
        Utils utils = new Utils();
        int[][] exceptedField = {
                {-1, -1, 1}, // 0
                {-1, -1, 1}, // 1
                {-1, -1, 1}  // 2
        };
        int[][] receivedField = subject.createField();
        utils.check(true, exceptedField.equals(receivedField));
    }
}
