package student_josifs_makarenko.lesson_4.level1;

public class Calculator {

        void showWhatIsYourNumber(int number){
            if (number >= 0) {
                System.out.println("Your number is positive");
            } else if (number < 0) {
                System.out.println("Your number is negative");
            } else if (number == 0) {
                System.out.println("Your number = 0");
            }
        }
        void evenOdd(int number){
            if (number % 2 == 0){
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
            }
        }

    }
