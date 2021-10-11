package student_daniel.lesson6.level5;

import student_daniel.lesson6.level3.ArrayService;

import java.util.Arrays;

public class TicTacToeTest {
    //Task 22 23 24 25 26 27 28 29 30
    public static void main(String[] args) {
        TicTacToeTest myTest = new TicTacToeTest();

        //Player 1
        //P1 - Horizontal
        myTest.isWinPositionForHorizontalFirstRowPlayerOneTest();
        myTest.isWinPositionForHorizontalSecondRowPlayerOneTest();
        myTest.isWinPositionForHorizontalThirdRowPlayerOneTest();
        //P1 - Vertical
        myTest.isWinPositionForVerticalFirstColPlayerOneTest();
        myTest.isWinPositionForVerticalSecondColPlayerOneTest();
        myTest.isWinPositionForVerticalThirdColPlayerOneTest();
        //P1 - Diagonal
        myTest.isWinPositionForDiagonalOnePlayerOneTest();
        myTest.isWinPositionForDiagonalTwoPlayerOneTest();

        //Player 2
        //P2 - Horizontal
        myTest.isWinPositionForHorizontalFirstRowPlayerTwoTest();
        myTest.isWinPositionForHorizontalSecondRowPlayerTwoTest();
        myTest.isWinPositionForHorizontalThirdRowPlayerTwoTest();
        //P2 - Vertical
        myTest.isWinPositionForVerticalFirstColPlayerTwoTest();
        myTest.isWinPositionForVerticalSecondColPlayerTwoTest();
        myTest.isWinPositionForVerticalThirdColPlayerTwoTest();
        //P2 - Diagonal
        myTest.isWinPositionForDiagonalOnePlayerTwoTest();
        myTest.isWinPositionForDiagonalTwoPlayerTwoTest();

        myTest.isWinPositionTest1();
        myTest.isWinPositionTest2();
        myTest.isWinPositionTest3();

        myTest.isDrawPositionTest1();
        myTest.isDrawPositionTest2();

        myTest.createField();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    TicTacToe myTicTacToe = new TicTacToe();

    //Player 1
    //P1 - Horizontal
    void isWinPositionForHorizontalFirstRowPlayerOneTest() {
        int[][] fieldArray = {{0, 0, 0},
                              {-1, -1, -1},
                              {-1, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForHorizontals(fieldArray, 0);
        check(expectedResult, actualResult, "First Row >>> Player 1 >>> Win: " + actualResult);
    }

    void isWinPositionForHorizontalSecondRowPlayerOneTest() {
        int[][] fieldArray = {{-1, -1, -1},
                              {0, 0, 0},
                              {-1, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForHorizontals(fieldArray, 0);
        check(expectedResult, actualResult, "Second Row >>> Player 1 >>> Win: " + actualResult);
    }

    void isWinPositionForHorizontalThirdRowPlayerOneTest() {
        int[][] fieldArray = {{-1, -1, -1},
                              {-1, -1, -1},
                              {0, 0, 0}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForHorizontals(fieldArray, 0);
        check(expectedResult, actualResult, "Third Row >>> Player 1 >>> Win: " + actualResult);
    }

    //P1 - Vertical
    void isWinPositionForVerticalFirstColPlayerOneTest() {
        int[][] fieldArray = {{0, -1, -1},
                              {0, -1, -1},
                              {0, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForVerticals(fieldArray, 0);
        check(expectedResult, actualResult, "First Col >>> Player 1 >>> Win: " + actualResult);
    }

    void isWinPositionForVerticalSecondColPlayerOneTest() {
        int[][] fieldArray = {{-1, 0, -1},
                              {-1, 0, -1},
                              {-1, 0, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForVerticals(fieldArray, 0);
        check(expectedResult, actualResult, "Second Col >>> Player 1 >>> Win: " + actualResult);
    }

    void isWinPositionForVerticalThirdColPlayerOneTest() {
        int[][] fieldArray = {{-1, -1, 0},
                              {-1, -1, 0},
                              {-1, -1, 0}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForVerticals(fieldArray, 0);
        check(expectedResult, actualResult, "Third Col >>> Player 1 >>> Win: " + actualResult);
    }

    //P1 - Diagonal
    void isWinPositionForDiagonalOnePlayerOneTest() {
        int[][] fieldArray = {{0, -1, -1},
                              {-1, 0, -1},
                              {-1, -1, 0}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForDiagonals(fieldArray, 0);
        check(expectedResult, actualResult, "First Diagonal >>> Player 1 >>> Win: " + actualResult);
    }

    void isWinPositionForDiagonalTwoPlayerOneTest() {
        int[][] fieldArray = {{-1, -1, 0},
                              {-1, 0, -1},
                              {0, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForDiagonals(fieldArray, 0);
        check(expectedResult, actualResult, "Second Diagonal >>> Player 1 >>> Win: " + actualResult);
    }

    //Player 2
    //P2 - Horizontal
    void isWinPositionForHorizontalFirstRowPlayerTwoTest() {
        int[][] fieldArray = {{1, 1, 1},
                              {-1, -1, -1},
                              {-1, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForHorizontals(fieldArray, 1);
        check(expectedResult, actualResult, "First Row >>> Player 2 >>> Win: " + actualResult);
    }

    void isWinPositionForHorizontalSecondRowPlayerTwoTest() {
        int[][] fieldArray = {{-1, -1, -1},
                              {1, 1, 1},
                              {-1, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForHorizontals(fieldArray, 1);
        check(expectedResult, actualResult, "Second Row >>> Player 2 >>> Win: " + actualResult);
    }

    void isWinPositionForHorizontalThirdRowPlayerTwoTest() {
        int[][] fieldArray = {{-1, -1, -1},
                              {-1, -1, -1},
                              {1, 1, 1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForHorizontals(fieldArray, 1);
        check(expectedResult, actualResult, "Third Row >>> Player 2 >>> Win: " + actualResult);
    }

    //P2 - Vertical
    void isWinPositionForVerticalFirstColPlayerTwoTest() {
        int[][] fieldArray = {{1, -1, -1},
                              {1, -1, -1},
                              {1, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForVerticals(fieldArray, 1);
        check(expectedResult, actualResult, "First Col >>> Player 2 >>> Win: " + actualResult);
    }

    void isWinPositionForVerticalSecondColPlayerTwoTest() {
        int[][] fieldArray = {{-1, 1, -1},
                              {-1, 1, -1},
                              {-1, 1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForVerticals(fieldArray, 1);
        check(expectedResult, actualResult, "Second Col >>> Player 2 >>> Win: " + actualResult);
    }

    void isWinPositionForVerticalThirdColPlayerTwoTest() {
        int[][] fieldArray = {{-1, -1, 1},
                              {-1, -1, 1},
                              {-1, -1, 1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForVerticals(fieldArray, 1);
        check(expectedResult, actualResult, "Third Col >>> Player 2 >>> Win: " + actualResult);
    }

    //P2 - Diagonal
    void isWinPositionForDiagonalOnePlayerTwoTest() {
        int[][] fieldArray = {{1, -1, -1},
                              {-1, 1, -1},
                              {-1, -1, 1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForDiagonals(fieldArray, 1);
        check(expectedResult, actualResult, "First Diagonal >>> Player 2 >>> Win: " + actualResult);
    }

    void isWinPositionForDiagonalTwoPlayerTwoTest() {
        int[][] fieldArray = {{-1, -1, 1},
                              {-1, 1, -1},
                              {1, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPositionForDiagonals(fieldArray, 1);
        check(expectedResult, actualResult, "Second Diagonal >>> Player 2 >>> Win: " + actualResult);
    }

    //Diagonal Player 2
    void isWinPositionTest1() {
        int[][] fieldArray = {{-1, -1, 1},
                              {-1, 1, -1},
                              {1, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPosition(fieldArray, 1);
        check(expectedResult, actualResult, "Using Combined Method >>> Second Diagonal >>> Player 2 >>> Win: " + actualResult);
    }

    //Vertical Player 1
    void isWinPositionTest2() {
        int[][] fieldArray = {{-1, -1, 0},
                              {-1, -1, 0},
                              {-1, -1, 0}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPosition(fieldArray, 0);
        check(expectedResult, actualResult, "Using Combined Method >>> Third Col >>> Player 1 >>> Win: " + actualResult);
    }

    //Horizontal Player 1
    void isWinPositionTest3() {
        int[][] fieldArray = {{-1, -1, -1},
                              {0, 0, 0},
                              {-1, -1, -1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isWinPosition(fieldArray, 0);
        check(expectedResult, actualResult, "Using Combined Method >>> Second Row >>> Player 1 >>> Win: " + actualResult);
    }

    //Draw Player 1
    void isDrawPositionTest1() {
        int[][] fieldArray = {{1, 0, 1},
                              {1, 1, 0},
                              {0, 1, 0}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isDrawPosition(fieldArray);
        check(expectedResult, actualResult, "Draw Position Method >>> Draw 1: " + actualResult);
    }

    //Draw Player 2
    void isDrawPositionTest2() {
        int[][] fieldArray = {{0, 1, 0},
                              {0, 0, 1},
                              {1, 0, 1}};
        boolean expectedResult = true;
        boolean actualResult = myTicTacToe.isDrawPosition(fieldArray);
        check(expectedResult, actualResult, "Draw Position Method >>> Draw 2: " + actualResult);
    }

    //Create Field
    void createField() {
        int[][] expectedResult = {{-1, -1, -1},
                                  {-1, -1, -1},
                                  {-1, -1, -1}};
        int[][] actualResult = myTicTacToe.createField();
        check(expectedResult, actualResult, "Field is created >>> Field: " + Arrays.deepToString(actualResult));
    }

    void check(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName);
        }
    }

    void check(int[][] expectedResult, int[][] realResult, String testName) {
        if(Arrays.deepEquals(expectedResult, realResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName);
        }
    }

}



