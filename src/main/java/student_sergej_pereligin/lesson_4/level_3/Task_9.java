package student_sergej_pereligin.lesson_4.level_3;

import java.util.Scanner;

/*Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.*/
public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Введите число первое:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите число второе:");
        int numberTwo = scanner.nextInt();
        System.out.println("Введите число третье:");
        int numberThree = scanner.nextInt();
        if (number > numberTwo && numberTwo > numberThree) {
            System.out.println("increasing");
        }
        else if (number < numberTwo && numberTwo < numberThree) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
