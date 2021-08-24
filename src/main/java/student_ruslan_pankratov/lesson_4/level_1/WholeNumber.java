package student_ruslan_pankratov.lesson_4.level_1;

import java.util.Scanner;

//Task_1
//Task_2
class WholeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write integers");
        int numder = scanner.nextInt();
        if (numder > 0) {
            System.out.println("This is a positive number: " + numder);
        } else if (numder < 0) {
            System.out.println("This is a negative number: " + numder);
        } else {
            System.out.println("This number is zero" + numder);
        }

    }
}
