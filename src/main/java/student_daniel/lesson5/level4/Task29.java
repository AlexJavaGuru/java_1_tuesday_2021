package student_daniel.lesson5.level4;

import java.util.Random;

class Task29 {
    //Task 29
    public static void main(String[] args) {
        Random myRandom = new Random();
        int numBounds = 10;

        int[] numbers = new int[myRandom.nextInt(numBounds)];
        System.out.println("Array length = " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = myRandom.nextInt(numBounds);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array value = " + numbers[i]);
        }

        int isEven;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                isEven = numbers[i];
                System.out.println("Even numbers: " + isEven);
            }
        }
    }
}
