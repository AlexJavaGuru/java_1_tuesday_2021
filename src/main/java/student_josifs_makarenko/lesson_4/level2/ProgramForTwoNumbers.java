package student_josifs_makarenko.lesson_4.level2;

public class ProgramForTwoNumbers {

    void largerNumber(int numberOne, int numberTwo){
        if (numberOne < numberTwo) {
            System.out.println(numberTwo + " the largest number");
        } else if (numberOne > numberTwo) {
            System.out.println(numberOne + " the largest number");
        }
    }

    void lesserNumber(int numberOne, int numberTwo){
        if (numberOne < numberTwo) {
            System.out.println(numberOne + " the least number");
        } else if (numberOne > numberTwo) {
            System.out.println(numberTwo + " the least number");
        }
    }

    void equalOrDifferent(int numberOne, int numberTwo){
        if (numberOne == numberTwo){
            System.out.println("Numbers are equals");
        } else if (numberOne != numberTwo){
            System.out.println("Numbers are different");
        }
    }

}
