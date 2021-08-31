package student_daniel.lesson4.level1;

import java.util.Scanner;

class One {
    public static void main(String[] args) {
        Scanner needNumber = new Scanner(System.in);

        int num = needNumber.nextInt();

        //Task 1
        if (num > 0) {
            System.out.println("Task 1 Positive number");
        } else {
            System.out.println("Task 1 Negative number");
        }

        //Task2
        if (num > 0) {
            System.out.println("Task 2 Positive number");
        } else if (num == 0) {
            System.out.println("Task 2 Zero");
        } else {
            System.out.println("Task 2 Negative number");
        }

        //Task 3
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Out of space!");
        }

        //Task4
        if (num % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
