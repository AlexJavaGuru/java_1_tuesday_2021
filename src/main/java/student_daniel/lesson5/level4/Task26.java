package student_daniel.lesson5.level4;

import java.util.Random;
import java.util.Scanner;

class Task26 {
    //Task 26
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input array length");

        Random myRandom = new Random();
        int numBounds = 100;

        int[] numbers = new int[myScanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = myRandom.nextInt(numBounds);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array value - " + numbers[i]);
        }
    }
}
