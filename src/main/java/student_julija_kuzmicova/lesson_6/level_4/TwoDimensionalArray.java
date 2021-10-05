package student_julija_kuzmicova.lesson_6.level_4;

import java.util.Random;

//Task_21
class TwoDimensionalArray {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = twoDimensionalArray.createArray(2,3);
        twoDimensionalArray.fillArrayWithRandomNumbers(array);
        twoDimensionalArray.sumAllNumbersInArray(array);

    }

    int[][] createArray(int firstLength, int secondLength) {
        int[][] resultArray = new int[firstLength][secondLength];
        return resultArray;
    }

    void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "|");
            }
        }
        System.out.println();
    }

    int sumAllNumbersInArray(int[][] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.print("Sum of all numbers in array is " + sum);
        return sum;
    }
}
