package student_daniel.lesson5.level2;

import java.util.Random;

class Task15 {
    //Task 15
    public static void main(String[] args) {
        Random myRandom = new Random();
        int bounds = 100;

        int[] numbers = new int[3];

        numbers[0] = myRandom.nextInt(bounds);
        numbers[1] = myRandom.nextInt(bounds);
        numbers[2] = myRandom.nextInt(bounds);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int numOne = numbers[0] * 2;
        int numTwo = numbers[1] * 2;
        int numThree = numbers[2] * 2;

        System.out.println();
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(numThree);
    }
}
