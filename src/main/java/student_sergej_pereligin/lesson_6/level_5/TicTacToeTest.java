package student_sergej_pereligin.lesson_6.level_5;


public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.testForZero();
        ticTacToeTest.testForOne();
        ticTacToeTest.testDraw();
    }

    public void testForZero() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{ 0, 1, 1},
                         { 0, 0, 0},
                         {-1, 0, 0}};
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWin(field, 0);
        checkRes(actualResult, expectedResult, "Player 0");

    }

    public void testForOne() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{ 1, 1, 1},
                        { 1, 0, 0},
                        {-1, 0, 0}};
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWin(field, 1);
        checkRes(actualResult, expectedResult, "Player 1");

    }

    public void testDraw() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{ 1, 0, 0},
                        { 0, 1, 0},
                        {1, 0, 1}};
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isDraw(field);
        checkRes(actualResult, expectedResult, "Draw");

    }

    public void checkRes(boolean expectedResult, boolean actualResult, String name){
        if (expectedResult == actualResult){
            System.out.println("Test " + name + " passed!");
        }
        else{
            System.out.println("Test " + name + " failed!");
        }
    }
}
