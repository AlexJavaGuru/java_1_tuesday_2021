package student_julija_kuzmicova.lesson_6.level_5;

import java.util.Arrays;

//Task_22, Task_23, Task_24, Task_25, Task_26, Task_27
class TicTacToeTest {

    TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionForHorizontalsLine1Player1Test();
        ticTacToeTest.isWinPositionForHorizontalsLine1Player2Test();
        ticTacToeTest.isWinPositionForHorizontalsLine2Player1Test();
        ticTacToeTest.isWinPositionForHorizontalsLine2Player2Test();
        ticTacToeTest.isWinPositionForHorizontalsLine3Player1Test();
        ticTacToeTest.isWinPositionForHorizontalsLine3Player2Test();
        ticTacToeTest.isWinPositionForHorizontalsPlayer1DoNotWinTest();
        ticTacToeTest.isWinPositionForHorizontalsPlayer2DoNotWinTest();

        ticTacToeTest.isWinPositionForVerticalsLine1Player1Test();
        ticTacToeTest.isWinPositionForVerticalsLine1Player2Test();
        ticTacToeTest.isWinPositionForVerticalsLine2Player1Test();
        ticTacToeTest.isWinPositionForVerticalsLine2Player2Test();
        ticTacToeTest.isWinPositionForVerticalsLine3Player1Test();
        ticTacToeTest.isWinPositionForVerticalsLine3Player2Test();
        ticTacToeTest.isWinPositionForVerticalsPlayer1DoNotWinTest();
        ticTacToeTest.isWinPositionForVerticalsPlayer2DoNotWinTest();

        ticTacToeTest.isWinPositionForDiagonalsLine1Player1WinTest();
        ticTacToeTest.isWinPositionForDiagonalsLine1Player2WinTest();
        ticTacToeTest.isWinPositionForDiagonalsLine2Player1WinTest();
        ticTacToeTest.isWinPositionForDiagonalsLine2Player2WinTest();
        ticTacToeTest.isWinPositionForDiagonalsPlayer1DoNotWinTest();
        ticTacToeTest.isWinPositionForDiagonalsPlayer2DoNotWinTest();

        ticTacToeTest.isWinPositionHorizontalPlayer1WinTest();
        ticTacToeTest.isWinPositionHorizontalPlayer2WinTest();
        ticTacToeTest.isWinPositionVerticalPlayer1WinTest();
        ticTacToeTest.isWinPositionVerticalPlayer2WinTest();
        ticTacToeTest.isWinPositionDiagonalPlayer1WinTest();
        ticTacToeTest.isWinPositionDiagonalPlayer2WinTest();
        ticTacToeTest.isWinPositionPlayer1DoNotWinTest();
        ticTacToeTest.isWinPositionPlayer2DoNotWinTest();

        ticTacToeTest.isDrawPositionPlayer1WinTest();
        ticTacToeTest.isDrawPositionPlayer2WinTest();
        ticTacToeTest.isDrawPositionWithEmptyCellsTest();
        ticTacToeTest.isDrawPositionWithoutEmptyCellsTest();

        ticTacToeTest.createFieldTest();

    }

    void isWinPositionForHorizontalsLine1Player1Test() {
        int[][] field = {{0, 0, 0},
                        {1, 0, 1},
                        {-1, -1, 1}};
        checkResult(true, ticTacToe.isWinPositionForHorizontals(field, 0), "isWinPositionForHorizontalsLine1Player1Test");
    }

    void isWinPositionForHorizontalsLine1Player2Test() {
        int[][] field = {{1, 1, 1},
                        {0, 1, 0},
                        {-1, -1, 0}};
        checkResult(true, ticTacToe.isWinPositionForHorizontals(field, 1), "isWinPositionForHorizontalsLine1Player2Test");
    }

    void isWinPositionForHorizontalsLine2Player1Test() {
        int[][] field = {{1, 0, 1},
                        {0, 0, 0},
                        {-1, -1, 1}};
        checkResult(true, ticTacToe.isWinPositionForHorizontals(field, 0), "isWinPositionForHorizontalsLine2Player1Test");
    }

    void isWinPositionForHorizontalsLine2Player2Test() {
        int[][] field = {{0, 1, 0},
                        {1, 1, 1},
                        {-1, -1, 0}};
        checkResult(true, ticTacToe.isWinPositionForHorizontals(field, 1), "isWinPositionForHorizontalsLine2Player2Test");
    }

    void isWinPositionForHorizontalsLine3Player1Test() {
        int[][] field = {{1, 0, 1},
                        {-1, -1, 1},
                        {0, 0, 0}};
        checkResult(true, ticTacToe.isWinPositionForHorizontals(field, 0), "isWinPositionForHorizontalsLine3Player1Test");
    }

    void isWinPositionForHorizontalsLine3Player2Test() {
        int[][] field = {{0, 1, 0},
                        {-1, -1, 0},
                        {1, 1, 1}};
        checkResult(true, ticTacToe.isWinPositionForHorizontals(field, 1), "isWinPositionForHorizontalsLine3Player2Test");
    }

    void isWinPositionForHorizontalsPlayer1DoNotWinTest() {
        int[][] field = {{0, 1, 0},
                        {-1, -1, 0},
                        {1, 0, 1}};
        checkResult(false, ticTacToe.isWinPositionForHorizontals(field, 0), "isWinPositionForHorizontalsPlayer1DoNotWinTest");
    }

    void isWinPositionForHorizontalsPlayer2DoNotWinTest() {
        int[][] field = {{0, 1, 0},
                        {-1, -1, 0},
                        {1, 0, 1}};
        checkResult(false, ticTacToe.isWinPositionForHorizontals(field, 1), "isWinPositionForHorizontalsPlayer2DoNotWinTest");
    }

    void isWinPositionForVerticalsLine1Player1Test() {
        int[][] field = {{0, 1, -1},
                        {0, 0, 1},
                        {0, -1, 1}};
        checkResult(true, ticTacToe.isWinPositionForVerticals(field, 0), "isWinPositionForVerticalsLine1Player1Test");
    }

    void isWinPositionForVerticalsLine1Player2Test() {
        int[][] field = {{1, 0, -1},
                        {1, 1, 0},
                        {1, -1, 0}};
        checkResult(true, ticTacToe.isWinPositionForVerticals(field, 1), "isWinPositionForVerticalsLine1Player2Test");
    }

    void isWinPositionForVerticalsLine2Player1Test() {
        int[][] field = {{1, 0, -1},
                        {0, 0, 1},
                        {-1, 0, 1}};
        checkResult(true, ticTacToe.isWinPositionForVerticals(field, 0), "isWinPositionForVerticalsLine2Player1Test");
    }

    void isWinPositionForVerticalsLine2Player2Test() {
        int[][] field = {{0, 1, -1},
                        {1, 1, 0},
                        {-1, 1, 0}};
        checkResult(true, ticTacToe.isWinPositionForVerticals(field, 1), "isWinPositionForVerticalsLine2Player2Test");
    }

    void isWinPositionForVerticalsLine3Player1Test() {
        int[][] field = {{1, -1, 0},
                        {0, 1, 0},
                        {-1, 1, 0}};
        checkResult(true, ticTacToe.isWinPositionForVerticals(field, 0), "isWinPositionForVerticalsLine3Player1Test");
    }

    void isWinPositionForVerticalsLine3Player2Test() {
        int[][] field = {{0, -1, 1},
                        {1, 0, 1},
                        {-1, 0, 1}};
        checkResult(true, ticTacToe.isWinPositionForVerticals(field, 1), "isWinPositionForVerticalsLine3Player2Test");
    }

    void isWinPositionForVerticalsPlayer1DoNotWinTest() {
        int[][] field = {{0, 1, 0},
                        {-1, -1, 0},
                        {1, 0, 1}};
        checkResult(false, ticTacToe.isWinPositionForVerticals(field, 0), "isWinPositionForVerticalsPlayer1DoNotWinTest");
    }

    void isWinPositionForVerticalsPlayer2DoNotWinTest() {
        int[][] field = {{0, 1, 0},
                        {-1, -1, 0},
                        {1, 0, 1}};
        checkResult(false, ticTacToe.isWinPositionForVerticals(field, 1), "isWinPositionForVerticalsPlayer1DoNotWinTest");
    }

    void isWinPositionForDiagonalsLine1Player1WinTest() {
        int[][] field = {{0, 1, -1},
                        {0, 0, 1},
                        {1, -1, 0}};
        checkResult(true, ticTacToe.isWinPositionForDiagonals(field, 0), "isWinPositionForDiagonalsLine1Player1WinTest");
    }

    void isWinPositionForDiagonalsLine2Player1WinTest() {
        int[][] field = {{-1, 1, 0},
                        {0, 0, 1},
                        {0, -1, 1}};
        checkResult(true, ticTacToe.isWinPositionForDiagonals(field, 0), "isWinPositionForDiagonalsLine2Player1WinTest");
    }

    void isWinPositionForDiagonalsLine1Player2WinTest() {
        int[][] field = {{1, 0, -1},
                        {0, 1, 0},
                        {0, -1, 1}};
        checkResult(true, ticTacToe.isWinPositionForDiagonals(field, 1), "isWinPositionForDiagonalsLine1Player2WinTest");
    }

    void isWinPositionForDiagonalsLine2Player2WinTest() {
        int[][] field = {{-1, 0, 1},
                        {0, 1, 0},
                        {1, -1, 0}};
        checkResult(true, ticTacToe.isWinPositionForDiagonals(field, 1), "isWinPositionForDiagonalsLine2Player2WinTest");
    }

    void isWinPositionForDiagonalsPlayer1DoNotWinTest() {
        int[][] field = {{-1, 0, 1},
                        {0, 0, 1},
                        {1, -1, 0}};
        checkResult(false, ticTacToe.isWinPositionForDiagonals(field, 0), "isWinPositionForDiagonalsLine2Player2WinTest");
    }

    void isWinPositionForDiagonalsPlayer2DoNotWinTest() {
        int[][] field = {{-1, 0, 1},
                        {0, 0, 1},
                        {1, -1, 0}};
        checkResult(false, ticTacToe.isWinPositionForDiagonals(field, 1), "isWinPositionForDiagonalsLine2Player2WinTest");
    }

    void isWinPositionHorizontalPlayer1WinTest() {
        int[][] field = {{0, 1, 1},
                        {0, 0, 0},
                        {1, -1, -1}};
        checkResult(true, ticTacToe.isWinPosition(field, 0), "isWinPositionHorizontalPlayer1WinTest");
    }

    void isWinPositionVerticalPlayer1WinTest() {
        int[][] field = {{1, 0, 0},
                        {1, 0, 1},
                        {-1, 0, -1}};
        checkResult(true, ticTacToe.isWinPosition(field, 0), "isWinPositionVerticalPlayer1WinTest");
    }

    void isWinPositionDiagonalPlayer1WinTest() {
        int[][] field = {{0, 1, -1},
                        {0, 0, 1},
                        {1, -1, 0}};
        checkResult(true, ticTacToe.isWinPosition(field, 0), "isWinPositionDiagonalPlayer1WinTest");
    }

    void isWinPositionPlayer1DoNotWinTest() {
        int[][] field = {{0, 0, -1},
                        {0, 1, 1},
                        {1, -1, 0}};
        checkResult(false, ticTacToe.isWinPosition(field, 0), "isWinPositionPlayer1DoNotWinTest");
    }

    void isWinPositionHorizontalPlayer2WinTest() {
        int[][] field = {{0, 1, 0},
                        {1, 1, 1},
                        {0, -1, -1}};
        checkResult(true, ticTacToe.isWinPosition(field, 1), "isWinPositionHorizontalPlayer2WinTest");
    }

    void isWinPositionVerticalPlayer2WinTest() {
        int[][] field = {{0, 1, 0},
                        {0, 1, 1},
                        {-1, 1, -1}};
        checkResult(true, ticTacToe.isWinPosition(field, 1), "isWinPositionVerticalPlayer2WinTest");
    }

    void isWinPositionDiagonalPlayer2WinTest() {
        int[][] field = {{0, -1, 1},
                        {0, 1, 1},
                        {1, -1, 0}};
        checkResult(true, ticTacToe.isWinPosition(field, 1), "isWinPositionDiagonalPlayer2WinTest");
    }

    void isWinPositionPlayer2DoNotWinTest() {
        int[][] field = {{0, 0, -1},
                        {0, 1, 1},
                        {1, -1, 0}};
        checkResult(false, ticTacToe.isWinPosition(field, 1), "isWinPositionPlayer2DoNotWinTest");
    }

    void isDrawPositionWithoutEmptyCellsTest() {
        int[][] field = {{0, 1, 0},
                        {0, 1, 1},
                        {1, 0, 0}};
        checkResult(true, ticTacToe.isDrawPosition(field), "isDrawPositionWithoutEmptyCellsTest");
    }

    void isDrawPositionWithEmptyCellsTest() {
        int[][] field = {{0, 1, 0},
                        {0, 1, 1},
                        {1, 0, -1}};
        checkResult(false, ticTacToe.isDrawPosition(field), "isDrawPositionWithEmptyCellsTest");
    }

    void isDrawPositionPlayer1WinTest() {
        int[][] field = {{0, 1, 1},
                        {0, 0, 1},
                        {1, 0, 0}};
        checkResult(false, ticTacToe.isDrawPosition(field), "isDrawPositionPlayer1WinTest");
    }

    void isDrawPositionPlayer2WinTest() {
        int[][] field = {{0, 0, 1},
                        {1, 1, 1},
                        {0, 1, 0}};
        checkResult(false, ticTacToe.isDrawPosition(field), "isDrawPositionPlayer2WinTest");
    }

    void createFieldTest() {
        int[][] expectedResult = {{-1, -1, -1},
                                 {-1, -1, -1},
                                 {-1, -1, -1}};
        checkResult(expectedResult, ticTacToe.createField(), "createFieldTest");
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void checkResult(int[][] expectedResult, int[][] actualResult, String testName){
        if(twoDimensionalArraysAreEqual(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + Arrays.toString(expectedResult) + " but actual: " + Arrays.toString(actualResult));
        }
    }

    boolean twoDimensionalArraysAreEqual(int[][] arrayOne, int[][] arrayTwo) {
        if(arrayOne.length != arrayTwo.length) {
            return false;
        }
        for(int i = 0; i < arrayOne.length; i++) {
            for(int j = 0; j < arrayOne[i].length; j++) {
                if (arrayOne[i][j] != arrayTwo[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
