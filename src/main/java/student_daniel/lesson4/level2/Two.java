package student_daniel.lesson4.level2;

import java.util.Scanner;

class Two {
    public static void main(String[] args) {
        //Task 5
        System.out.println("Enter two numbers, press Enter key after each: ");
        Scanner myScanner = new Scanner(System.in);
        int numOne = myScanner.nextInt();
        int numTwo = myScanner.nextInt();

        System.out.println("This number is greater: ");
        if (numOne > numTwo) {
            System.out.println(numOne);
        }
        else {
            System.out.println(numTwo);
        }

        //Test 6
        System.out.println("This number is lesser: ");
        if (numOne < numTwo) {
            System.out.println(numOne);
        }
        else {
            System.out.println(numTwo);
        }

        //Task 7
        if (numOne == numTwo) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
