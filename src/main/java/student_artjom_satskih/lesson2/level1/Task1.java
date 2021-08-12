package student_artjom_satskih.lesson2.level1;

import teacher.annotations.CodeReview;

import java.io.InputStream;
import java.util.Scanner;
@CodeReview(approved = true)
public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int firstNumber = myScanner.nextInt();
        int secondNumber = myScanner.nextInt();
        System.out.println(firstNumber + secondNumber);

        int number3 = myScanner.nextInt();
        int number4 = myScanner.nextInt();
        System.out.println(number3 - number4);

        int number5 = myScanner.nextInt();
        int number6 = myScanner.nextInt();
        System.out.println(number5 * number6);

        int number7 = myScanner.nextInt();
        int number8 = myScanner.nextInt();
        System.out.println(number7 / number8);









    }
}
