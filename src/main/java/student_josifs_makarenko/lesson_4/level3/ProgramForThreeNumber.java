package student_josifs_makarenko.lesson_4.level3;

public class ProgramForThreeNumber {

    void equalOrDifferent(int numberOne, int numberTwo, int numberThree) {
        if (numberOne == numberTwo && numberOne == numberThree && numberTwo == numberThree) {
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    void increasingOrDecreasing(int numberOne, int numberTwo, int numberThree) {
        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("increasing");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    void lagerNumber(int numberOne, int numberTwo, int numberThree) {
        if (numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.println("The largest number: " + numberOne);
        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.println("The largest number: " + numberTwo);
        } else {
            System.out.println("The largest number: " + numberThree);
        }
    }

    void leastNumber(int numberOne, int numberTwo, int numberThree) {
        if (numberOne <= numberTwo && numberOne <= numberThree) {
            System.out.println("The least number: " + numberOne);
        } else if (numberTwo <= numberOne && numberTwo <= numberThree) {
            System.out.println("The least number: " + numberTwo);
        } else {
            System.out.println("The least number: " + numberThree);
        }
    }
}
