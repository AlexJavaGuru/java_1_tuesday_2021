package student_ruslan_pankratov.leson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите 3 числа, чтобы узнать их среднее число:");

        double oneNumber = scanner.nextDouble();
        double twoNumber = scanner.nextDouble();
        double threeNumber = scanner.nextDouble();

        double sumNumber = (oneNumber + twoNumber + threeNumber) / 3;
        System.out.println("Cреднее арифметическое число = " + sumNumber);

    }
}
