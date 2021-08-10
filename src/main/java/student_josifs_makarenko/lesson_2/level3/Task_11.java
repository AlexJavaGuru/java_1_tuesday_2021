package student_josifs_makarenko.lesson_2.level3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("average arithmetic numbers =" +(double) sum / 3);
    }
}
