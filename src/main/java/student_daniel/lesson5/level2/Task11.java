package student_daniel.lesson5.level2;

import java.util.Scanner;

public class Task11 {
    //Task 11
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input number");
        System.out.println();

        int[] numbers = new int[3];
        int inputNum = myScanner.nextInt();
        numbers[0] = inputNum;
        numbers[1] = inputNum;
        numbers[2] = inputNum;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
