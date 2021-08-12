package student_daniel.lesson2.level3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "А если результат будет не целый?")
public class Task_11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите три целых числа, после каждого введенного числа нажмите клавишу \"Enter\" ");
        int numOne = myScanner.nextInt();
        int numTwo = myScanner.nextInt();
        int numThree = myScanner.nextInt();

        int calc = (numOne + numTwo + numThree) / 3;


        System.out.println("Среднее арифметическое = " + calc);
    }
}