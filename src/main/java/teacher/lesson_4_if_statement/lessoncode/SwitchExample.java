package teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select menu item...");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Please fill product name...");
                String productName = scanner.next();
                break;
            case 2:
                System.out.println("Type search parameter...");
                break;
            case 3:
                System.out.println("Here is the case number 3");
                break;
//            default:

        }

//        if (userInput == 1) {
//            System.out.println("Please fill product name...");
//            String productName = scanner.next();
//        } else if (userInput == 2) {
//            System.out.println("Type search parameter...");
//        } else if (userInput == 3) {
//            System.out.println("Here is the case number 3");
//        } else {
//
//        }

    }
}
