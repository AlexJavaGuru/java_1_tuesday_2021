package student_daniel.lesson4;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        //if and switch
        int x = 10;

        if (x < 10) {
            System.out.println("X is less then 10");
        } else if (x > 10) {
            System.out.println("X is greater then 10");
        } else if (x == 0) {
            System.out.println("X is equal to 0");
        } else {
            System.out.println("X is equal to 10");
        }

        // Math Operators:
        // == equal
        // != not equal
        // > more than
        // < less than
        // >= more or equal
        // <= less or equal

        // Logic Operators:
        // && and
        // || or
        // ! not

        // && (and) works as multiplier (*) (tablica istinnosti)
        // x1 x2 = res
        // 0  0 = 0
        // 0  1 = 0
        // 1  0 = 0
        // 1  1 = 1

        // || (or) works as plus (+) (tablica istinnosti)
        // x1 x2 = res
        // 0  0 = 0
        // 0  1 = 1
        // 1  0 = 1
        // 1  1 = 1

        // ! (not) works as inverter (to opposite side) (tablica istinnosti)
        // x1 = res
        // 0    1
        // 1    0

        if (x > 5 && x < 15) {
            System.out.println("Within bounds!");
        }

        boolean rain = false;
        //if (rain != true) {   <--- same as !rain
        if (!rain) {
            System.out.println("Go outside!");
        }


        //Switch
        Scanner myScanner = new Scanner(System.in);
        int userInput = myScanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("love coffee");
                //break is needed to stop code execution
                break;
            //multiple values can be applied
            case 2, 4:
                System.out.println("love tea");
                break;
            case 3:
                System.out.println("love water");
                break;
            //default for all other values that are not highlighted in switch
            default:
                System.out.println("Nothing");
        }

        //Code Testing (Unit Test)

        //Overloading methods
    }
}
