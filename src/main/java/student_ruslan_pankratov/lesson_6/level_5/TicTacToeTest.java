package student_ruslan_pankratov.lesson_6.level_5;

import java.lang.reflect.Array;
import java.util.Arrays;

//Task_22-26
class TicTacToeTest {
  public static void main(String[] args) {
     TicTacToeTest ticTacToeTest = new TicTacToeTest();
     ticTacToeTest.isWinPositionForHorizontalsTestFalse();
     ticTacToeTest.isWinPositionForHorizontalsTestTrue();
     ticTacToeTest.isWinPositionForVerticalsTestTrue();
     ticTacToeTest.isWinPositionForVerticalsTestFalse();
     ticTacToeTest.isWinPositionForDiagonalsTestTrue();
     ticTacToeTest.isWinPositionForDiagonalsTestFalse();
     ticTacToeTest.isWinPositionTestTrue();
     ticTacToeTest.isWinPositionTestFalse();
     ticTacToeTest.isDrawPositionTestTrue();
     ticTacToeTest.isDrawPositionTestFalse();
     ticTacToeTest.createFieldTest();
  }

  void isWinPositionForHorizontalsTestFalse(){
        TicTacToe ticTacToe = new TicTacToe();

      int[][] field = {
              {1,1,1},
              {-1,-1,-1},
              {-1,0,0}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForHorizontals(field, firstPlayer);
        boolean expectedResult = false;

        isWinPositionTestMethod(result, expectedResult, "isWinPositionForHorizontalsTestFalse");

  }

    void isWinPositionForHorizontalsTestTrue(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1,1,1},
                {-1,-1,-1},
                {-1,0,0}};
        int firstPlayer = 1;
        boolean result = ticTacToe.isWinPositionForHorizontals(field, firstPlayer);
        boolean expectedResult = true;

        isWinPositionTestMethod(result, expectedResult, "isWinPositionForHorizontalsTestTrue");

    }
    void isWinPositionForVerticalsTestTrue(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1,0,-1},
                {1,-1,-1},
                {1,0,0}};

        int firstPlayer = 1;
        boolean result = ticTacToe.isWinPositionForVerticals(field, firstPlayer);
        boolean expectedResult = true;
        isWinPositionTestMethod(result, expectedResult, "isWinPositionForVerticalsTestTrue");

    }

    void isWinPositionForVerticalsTestFalse(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1,0,-1},
                {1,-1,-1},
                {1,0,0}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForVerticals(field, firstPlayer);
        boolean expectedResult = false;
        isWinPositionTestMethod(result, expectedResult, "isWinPositionForVerticalsTestFalse");

    }






    void isWinPositionForDiagonalsTestTrue(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1,0,0},
                {1,0,-1},
                {0,1,-1}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, firstPlayer);
        boolean expectedResult = true;

        isWinPositionTestMethod(result, expectedResult, "isWinPositionForDiagonalsTestTrue");

    }


    void isWinPositionForDiagonalsTestFalse(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1,0,-1},
                {1,0,-1},
                {0,1,-1}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, firstPlayer);
        boolean expectedResult = false;

        isWinPositionTestMethod(result, expectedResult, "isWinPositionForDiagonalsTestFalse");

    }

    void isWinPositionTestTrue(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1,0,0},
                {1,0,-1},
                {0,1,-1}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPosition(field, firstPlayer);
        boolean expectedResult = true;

        isWinPositionTestMethod(result, expectedResult, "isWinPositionTrue");
    }



    void isWinPositionTestFalse(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1,1,-1},
                {1,1,-1},
                {1,1,-1}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPosition(field, firstPlayer);
        boolean expectedResult = false;

        isWinPositionTestMethod(result, expectedResult, "isWinPositionFalse");
    }


    void isDrawPositionTestTrue(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1,0,1},
                {0,1,1},
                {0,1,0}};

        boolean result = ticTacToe.isDrawPosition(field);
        boolean expectedResult = true;

        isWinPositionTestMethod(result, expectedResult, "isDrawPositionTestTrue");

    }


    void isDrawPositionTestFalse(){
        TicTacToe ticTacToe = new TicTacToe();


        int[][] field = {
                {1,-1,1},
                {0,1,1},
                {0,1,0}};

        boolean result = ticTacToe.isDrawPosition(field);
        boolean expectedResult = false;

        isWinPositionTestMethod(result, expectedResult, "isDrawPositionTestFalse");

    }

    void createFieldTest(){
        TicTacToe ticTacToe = new TicTacToe();

        int[][] expectedResult = {
                {-1,-1,-1},
                {-1,-1,-1},
                {-1,-1,-1}};

        int[][] result = ticTacToe.createField();

        arrMethod(result, expectedResult, "createFieldTest");

    }

    public static void isWinPositionTestMethod(boolean result, boolean expectedResult, String name){
           if(result == expectedResult){
               System.out.println(name + " Test = OK");
           } else {
               System.out.println(name + " Test = FAIL");
           }
    }

    public static void arrMethod(int[][] result, int[][] expectedResult, String name){

        if(Arrays.deepEquals(result, expectedResult)){
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }



}
