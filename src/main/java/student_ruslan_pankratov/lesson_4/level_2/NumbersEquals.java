package student_ruslan_pankratov.lesson_4.level_2;

import java.util.Scanner;

//Task_7
class NumbersEquals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write two integer");
        int result = scanner.nextInt();
        int result2 = scanner.nextInt();
        if (result == result2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
