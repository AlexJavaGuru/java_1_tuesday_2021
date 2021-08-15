package student_olga_urek.lesson_2.level_5;

import teacher.annotations.CodeReview;

import java.util.Scanner;

//я не уверена, что правильно поняла задание. Может, нужно было придумать программу, где печать без переноса курсора на новую строку имеет практический смысл?

@CodeReview(approved = true)
public class Task_15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String name = myScanner.nextLine();

        System.out.println("Please enter your second/nick name:");
        String nickName = myScanner.nextLine();

        System.out.println("Please enter your family name:");
        String familyName = myScanner.nextLine();

        System.out.println(name);
        System.out.println(nickName);
        System.out.println(familyName);

        System.out.print(name);
        System.out.print(nickName);
        System.out.print(familyName);


    }
}