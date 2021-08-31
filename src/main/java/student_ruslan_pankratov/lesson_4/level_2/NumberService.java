package student_ruslan_pankratov.lesson_4.level_2;

import java.util.Scanner;

//Task_5
class NumberService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write two integers");
        int result = scanner.nextInt();
        int result2 = scanner.nextInt();
        if (result > result2) {
            System.out.println("This number is greater: " + result);
        } else if (result < result2) {
            System.out.println("This number is greater: " + result2);
        } else {
            System.out.println("These numbers are equal: " + result + ", " + result2);
        }
    }

}
