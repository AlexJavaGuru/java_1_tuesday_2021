package student_daniel.lesson4.level3;

import java.util.Scanner;

class Three {
    public static void main(String[] args) {
        //Task 8
        System.out.println("Enter three numbers, press Enter key after each: ");
        Scanner myScanner = new Scanner(System.in);

        int numOne = myScanner.nextInt();
        int numTwo = myScanner.nextInt();
        int numThree = myScanner.nextInt();

        if (numOne == numTwo && numTwo == numThree) {
            System.out.println("All numbers are equal");
        }
        else if (numOne != numTwo && numTwo != numThree && numThree != numOne) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }

        //Task 9
        if (numOne < numTwo && numTwo < numThree) {
            System.out.println("Increasing");
        }
        else if (numOne > numTwo && numTwo > numThree) {
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }

        //Task10
        if (numOne > numTwo && numOne > numThree) {
            System.out.println(numOne + " is greater");
        } else if (numOne == numTwo && numOne > numThree) {
            System.out.println(numOne + " is greater, and it's equal to one of other two numbers");
        } else if (numOne < numTwo && numTwo > numThree) {
            System.out.println(numTwo + " is greater");
        } else if (numOne < numTwo && numTwo == numThree) {
            System.out.println(numTwo + " is greater, and it's equal to one of other two numbers");
        } else if (numOne < numTwo && numTwo < numThree) {
            System.out.println(numThree + " is greater");
        } else if (numOne > numTwo && numTwo < numThree) {
            System.out.println(numThree + " is greater, and it's equal to one of other two numbers");
        } else {
            System.out.println("All numbers are equal");
        }
    }
}
