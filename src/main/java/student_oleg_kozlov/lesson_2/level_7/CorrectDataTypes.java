package student_oleg_kozlov.lesson_2.level_7;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CorrectDataTypes {

    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

//        float sum = numberOne + numberTwo;
        double sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}
