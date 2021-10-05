package student_daniel.lesson6;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {

//        int[][] doubleArray = new int[4][5];
//
//        for (int i = 0; i < doubleArray.length; i++) {
//            for (int j = 0; j < doubleArray[i].length; j++) {
//                System.out.print(doubleArray[i][j] + "|");
//            }
//            System.out.println();
//        }

        int[][] doubleArrayString = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < doubleArrayString.length; i++) {
            for (int j = 0; j < doubleArrayString[i].length; j++) {
                System.out.print(doubleArrayString[i][j] + "|");
            }
            System.out.println();
        }
    }
}
