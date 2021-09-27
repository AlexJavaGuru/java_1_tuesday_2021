package student_daniel.lesson5.level4;

import java.util.Random;

class Task28 {
    //Task 28
    public static void main(String[] args) {
        Random myRandom = new Random();
        int numBounds = 10;

        int[] numbers = new int[myRandom.nextInt(numBounds)];
        int theSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = myRandom.nextInt(numBounds);
            if (theSmallest > numbers[i]) {
                theSmallest = numbers[i];
            }
        }
        System.out.println("Array length = " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array value = " + numbers[i]);
        }
        System.out.println("Minimum value in the array is: " + theSmallest);
    }
}