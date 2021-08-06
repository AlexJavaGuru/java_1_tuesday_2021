package student_josifs_makarenko.lesson_2.level1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first real number");
        double num1 = scanner.nextDouble();
        System.out.println("Input second real number");
        double num2 = scanner.nextDouble();
        double sum =  num1 + num2;
        System.out.println("sum of that numbers =" +sum);
        double diff = num1 -num2;
        System.out.println("difference of that numbers =" +diff);
        System.out.println("multiplication of that numbers =" +num1*num2);
        System.out.println("division of that numbers =" +num1/num2);

    }
}
