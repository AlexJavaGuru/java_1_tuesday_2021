package student_sergej_pereligin.lesson_4.level_3;

import java.util.Scanner;

/*Write a Java program that accepts three numbers and prints:
 -"All numbers are equal" if all three numbers are equal,
 - "All numbers are different" if all three numbers are different
 - "Neither all are equal or different" otherwise.*/
public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Введите число первое:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите число второе:");
        int numberTwo = scanner.nextInt();
        System.out.println("Введите число третье:");
        int numberThree = scanner.nextInt();
        if (number == numberTwo && numberTwo == numberThree) {
            System.out.println("All numbers are equal");
        }
        if (number != numberTwo && numberTwo != numberThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}