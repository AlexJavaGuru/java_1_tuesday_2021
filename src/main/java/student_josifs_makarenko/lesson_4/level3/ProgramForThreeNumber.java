package student_josifs_makarenko.lesson_4.level3;

public class ProgramForThreeNumber {

    void equalOrDifferent(int numberOne, int numberTwo, int numberThree){
        if (numberOne == numberTwo && numberOne == numberThree && numberTwo == numberThree) {
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    void increasingOrDecreasing(int numberOne, int numberTwo, int numberThree){
        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("increasing");
        } else if (numberOne > numberTwo && numberTwo > numberThree){
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    void lagerNumber(int numberOne, int numberTwo, int numberThree){
        if (numberOne > numberThree && numberOne > numberThree) {
            System.out.println(numberOne + " the largest");
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo + " the largest");
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println(numberThree + " the largest");
        } else if (numberTwo == numberThree && numberTwo < numberOne) {
            System.out.println(numberOne + " the largest");
        } else if (numberOne == numberThree && numberOne < numberTwo) {
            System.out.println(numberTwo + " the largest");
        } else if (numberThree == numberOne && numberThree < numberTwo) {
            System.out.println(numberTwo + " the largest");
        } else if (numberThree == numberTwo && numberThree == numberOne){
            System.out.println("Numbers are equal");
        }
    }

    void leastNumber(int numberOne, int numberTwo, int numberThree){
        if (numberOne < numberThree && numberOne < numberThree) {
            System.out.println(numberOne + " the least");
        } else if (numberTwo < numberOne && numberTwo < numberThree) {
            System.out.println(numberTwo + " the least");
        } else if (numberThree < numberOne && numberThree < numberTwo) {
            System.out.println(numberThree + " the least");
        } else if (numberTwo == numberThree && numberTwo > numberOne) {
            System.out.println(numberOne + " the least");
        } else if (numberOne == numberThree && numberOne > numberTwo) {
            System.out.println(numberTwo + " the least");
        } else if (numberThree == numberOne && numberThree > numberTwo) {
            System.out.println(numberTwo + " the least");
        } else if (numberThree == numberTwo && numberThree == numberOne){
            System.out.println("Numbers are equal");
        }
    }
}
