package student_sergej_pereligin.lesson_4.level_1;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.*/
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Число отрицательное");
        }
        if (number==0) {
            System.out.println("Число равно 0"); }
        else{
            System.out.println("Число положительное");
}}}
