package student_sergej_pereligin.lesson_6.level_4;


import java.util.Random;

public class TwoDimensionalArrayUtil {

    int[][] createTwoDimArray(int arrayOneLength, int arrayTwoLength) {
        return new int[arrayOneLength][arrayTwoLength];
    }

    void fillTwoDimArrayWithRandoms(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
    }

    void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("|" + array[i][j] + "|");
            }
            System.out.println();
        }

    }
    void sumOfAllElements(int[][]array){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                sum = sum+array[i][j];
            }
        System.out.println("Sum of all elements is " + sum);
    }
}
