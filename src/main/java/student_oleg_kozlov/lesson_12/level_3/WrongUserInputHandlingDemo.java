package student_oleg_kozlov.lesson_12.level_3;

import java.util.Scanner;

// Task_19
class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        System.out.print("Please provide an integer: ");
        Scanner scanner = new Scanner( System.in );
        do {
            try {
                Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Invalid integer! Please try again: ");
            }
        } while (true);
    }
}
