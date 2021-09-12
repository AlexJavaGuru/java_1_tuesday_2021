package student_einars_marhilevics.lesson_6.level_5;

import java.util.Arrays;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionForHorizontalsTrue();
        ticTacToeTest.isWinPositionForHorizontalsFalse();
        ticTacToeTest.isWinPositionForVerticalsTrue();
        ticTacToeTest.isWinPositionForVerticalsFalse();
        ticTacToeTest.isWinPositionForDiagonalsTrue();
        ticTacToeTest.isWinPositionForDiagonalsFalse();
        ticTacToeTest.isWinPositionTrue();
        ticTacToeTest.isWinPositionFalse();
        ticTacToeTest.isDrawPositionTrue();
        ticTacToeTest.isDrawPositionFalse();
        ticTacToeTest.createField();
    }

    void isWinPositionForHorizontalsTrue() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, -1},
                         {0, 0, 0},
                         {1, -1, 1}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        check(result, "isWinPositionForHorizontalsTrue");
    }
    void isWinPositionForHorizontalsFalse() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0},
                         {0, 0, 1},
                         {1, 0, 1}};
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        check(!result, "isWinPositionForHorizontalsFalse");
    }
    void isWinPositionForVerticalsTrue() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 1},
                         {0, 0, 1},
                         {0, 0, 1}};
        boolean result = ticTacToe.isWinPositionForVerticals(field, 0);
        check(result, "isWinPositionForVerticalsTrue");
    }
    void isWinPositionForVerticalsFalse() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0},
                         {0, 0, 1},
                         {1, 0, 1}};
        boolean result = ticTacToe.isWinPositionForVerticals(field, 0);
        check(!result, "isWinPositionForVerticalsFalse");
    }
    void isWinPositionForDiagonalsTrue() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, -1},
                         {0, 0, 1},
                         {1, -1, 0}};
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 0);
        check(result, "isWinPositionForDiagonalsTrue");
    }
    void isWinPositionForDiagonalsFalse() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0},
                         {0, 0, 1},
                         {1, 0, 1}};
        boolean result = ticTacToe.isWinPositionForDiagonals(field, 0);
        check(!result, "isWinPositionForDiagonalsFalse");
    }
    void isWinPositionTrue() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 1},
                         {0, 1, 0},
                         {0, 0, 1}};
        boolean result = ticTacToe.isWinPosition(field, 0);
        check(result, "isWinPositionTrue");
    }
    void isWinPositionFalse() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0},
                         {0, 0, 1},
                         {1, 0, 1}};
        boolean result = ticTacToe.isWinPosition(field, 0);
        check(!result, "isWinPositionTrue");
    }
    void isDrawPositionTrue() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0},
                         {0, 0, 1},
                         {1, 0, 1}};
        boolean result = ticTacToe.isDrawPosition(field);
        check(result, "isDrawPositionTrue");
    }
    void isDrawPositionFalse() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 1},
                         {0, 1, 0},
                         {0, 0, 1}};
        boolean result = ticTacToe.isDrawPosition(field);
        check(!result, "isDrawPositionFalse");
    }
    void createField() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{-1,-1,-1},
                         {-1,-1,-1},
                         {-1,-1,-1}};
        int[][] result = ticTacToe.createField();
        check(Arrays.deepEquals(field, result), "createField");
    }
    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
