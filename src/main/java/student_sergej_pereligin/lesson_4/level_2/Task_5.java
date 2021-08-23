package student_sergej_pereligin.lesson_4.level_2;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.*/
public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите число первое:");
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите число второе:");
        int numberTwo= scanner.nextInt();
        if(number>numberTwo){
            System.out.println("Число "+number+ " наибольшое");
    }
        else{
            System.out.println("Число "+numberTwo+" наибольшое");
        }
}}
