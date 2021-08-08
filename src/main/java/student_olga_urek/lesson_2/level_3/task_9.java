package student_olga_urek.lesson_2.level_3;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
//это можно сделать красивее, например, создав переменную с рядом чисел от 1 до 10, и последевательно умножая введенное число на числа этого ряда
        //но я пока не знаю, как это реализовать на джаве
        System.out.println("This program prints out the multiplication table for any integer. Please enter any integer:");
        int inputInteger = myScanner.nextInt();

        int resultTwo = inputInteger * 2;
        int resultThree = inputInteger * 3;
        int resultFour = inputInteger * 4;
        int resultFive = inputInteger * 5;
        int resultSix = inputInteger * 6;
        int resultSeven = inputInteger * 7;
        int resultEight = inputInteger * 8;
        int resultNine = inputInteger * 9;
        int resultTen = inputInteger * 10;

        System.out.println(inputInteger + "x"+ 1 + "=" + inputInteger);
        System.out.println(inputInteger + "x"+ 2 + "=" + resultTwo);
        System.out.println(inputInteger + "x"+ 3 + "=" + resultThree);
        System.out.println(inputInteger + "x"+ 4 + "=" + resultFour);
        System.out.println(inputInteger + "x"+ 5 + "=" + resultFive);
        System.out.println(inputInteger + "x"+ 6 + "=" + resultSix);
        System.out.println(inputInteger + "x"+ 7 + "=" + resultSeven);
        System.out.println(inputInteger + "x"+ 8 + "=" + resultEight);
        System.out.println(inputInteger + "x"+ 9 + "=" + resultNine);
        System.out.println(inputInteger + "x"+ 10 + "=" + resultTen);

    }
}
