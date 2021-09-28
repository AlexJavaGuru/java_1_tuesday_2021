package student_daniel.lesson5.level4;

import java.util.Scanner;

class Task25 {
    //Task 25
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input array length");

        int[] numbers = new int[myScanner.nextInt()];

        System.out.println("Please input " + numbers.length + " different numeric values");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = myScanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array value - " + numbers[i]);
        }
    }
}
