package student_josifs_makarenko.lesson_6.level4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        Scanner scanner = new Scanner(System.in);
        int[][] myFirsArray = twoDimensionalArray.create2DArray(scanner.nextInt(), scanner.nextInt());
        twoDimensionalArray.fillWithRandomNumbers(myFirsArray);
        System.out.println(Arrays.deepToString(myFirsArray).replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));

        System.out.println(twoDimensionalArray.sum(myFirsArray));

    }

    public int[][] create2DArray(int y, int x){
        return new int[y][x];
    }

    public void fillWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = random.nextInt(10);
            }
        }
    }

    public double sum(int[][] array) {
        double sum = 0;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                sum += array[x][y];
            }
        }
        return sum;
    }

}
