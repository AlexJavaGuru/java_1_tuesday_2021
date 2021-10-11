package student_daniel.lesson6.level4;

import java.util.Random;

class TwoDimensionalArray {
    //Task 21
    void setDoubleArrayString() {
        int[][] doubleArray = new int[3][3];
        int arrNumSum = 0;
        Random arrayRandomNumbers = new Random();
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = arrayRandomNumbers.nextInt(10);
                System.out.print(doubleArray[i][j] + " | ");
                arrNumSum += doubleArray[i][j];
            }
        }
        System.out.println("Sum equals to " + arrNumSum);
    }
}