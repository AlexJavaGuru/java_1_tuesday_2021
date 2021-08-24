package student_einars_marhilevics.lesson_4.level_3;

import java.util.Scanner;

class TASK_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter second number");
        int numberTwo = scanner.nextInt();
        System.out.println("Please enter third number");
        int numberThree = scanner.nextInt();
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println(numberOne + " is biggest number");
        } else if (numberOne < numberTwo && numberTwo > numberThree) {
            System.out.println(numberTwo + " is biggest number");
        } else if (numberThree > numberTwo && numberThree > numberOne){
            System.out.println(numberThree + " is biggest number");
        } else {
            System.out.println("numbers are equals");
        }
    }
}
