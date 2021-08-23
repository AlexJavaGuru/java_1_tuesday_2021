package student_sergej_pereligin.lesson_4.level_3;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.*/
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Введите число первое:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите число второе:");
        int numberTwo = scanner.nextInt();
        System.out.println("Введите число третье:");
        int numberThree = scanner.nextInt();
        if (number > numberTwo && numberTwo > numberThree) {
            System.out.println(number);
        }
        if (number < numberTwo && numberTwo < numberThree) {
            System.out.println(numberThree);
        } else {
            System.out.println(numberTwo);
        }
    }
}
