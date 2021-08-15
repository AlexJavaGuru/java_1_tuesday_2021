package student_artjom_satskih.lesson2.level3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "То, что вы приводите тип хорошо, но деление будет выполнено первым..." +
        "там вы уже потеряете точность, а потом получите double )")
public class Task11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first variable...");
        int variableA = myScanner.nextInt();

        System.out.println("Enter second variable..");
        int variableB = myScanner.nextInt();

        System.out.println("enter therd variable....");
        int variableC =myScanner.nextInt();

        double result = ((double) variableA + variableB + variableC /3);
        System.out.println( result);

    }
}
