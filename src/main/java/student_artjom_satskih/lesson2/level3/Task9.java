package student_artjom_satskih.lesson2.level3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args){
        System.out.print("Input number  ");
        int number=new Scanner(System.in).nextInt();

        multiplicationTable(number);

    }
    static void multiplicationTable(int number){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(number + " * "+ i +" = "+number*i);
        }


    }
}
