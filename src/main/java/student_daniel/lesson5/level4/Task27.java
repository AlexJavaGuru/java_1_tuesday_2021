package student_daniel.lesson5.level4;

import java.util.Random;
import java.util.Scanner;

class Task27 {
    //Task 27
    public static void main(String[] args) {
        Random myRandom = new Random();
        int numBounds = 10;

        int[] numbers = new int[myRandom.nextInt(numBounds)];
        int theHighest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = myRandom.nextInt(numBounds);
            if (theHighest < numbers[i]) {
                theHighest = numbers[i];
            }
        }
        System.out.println("Array length = " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array value = " + numbers[i]);
        }
        System.out.println("Maximum value in the array is: " + theHighest);
    }
}