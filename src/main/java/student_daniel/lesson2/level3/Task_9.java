package student_daniel.lesson2.level3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите целое число и нажмите клавишу \"Enter\" ");

        int number = myScanner.nextInt();

        int calcTwo = number * 2;
        int calcThree = number * 3;
        int calcFour = number * 4;
        int calcFive = number * 5;
        int calcSix = number * 6;
        int calcSeven = number * 7;
        int calcEight = number * 8;
        int calcNine = number * 9;
        int calcTen = number * 10;

        System.out.println(number + " x 1 = " + number);
        System.out.println(number + " x 2 = " + calcTwo);
        System.out.println(number + " x 3 = " + calcThree);
        System.out.println(number + " x 4 = " + calcFour);
        System.out.println(number + " x 5 = " + calcFive);
        System.out.println(number + " x 6 = " + calcSix);
        System.out.println(number + " x 7 = " + calcSeven);
        System.out.println(number + " x 8 = " + calcEight);
        System.out.println(number + " x 9 = " + calcNine);
        System.out.println(number + " x 10 = " + calcTen);

        //Multiplication table (found in google)
        System.out.println(""); //break line
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d x %d = %d \n", number, i, number * i);
        }
    }
}
