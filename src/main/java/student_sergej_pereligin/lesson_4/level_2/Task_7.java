package student_sergej_pereligin.lesson_4.level_2;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны*/
public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Введите число первое:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите число второе:");
        int numberTwo = scanner.nextInt();
        if (number == numberTwo) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
