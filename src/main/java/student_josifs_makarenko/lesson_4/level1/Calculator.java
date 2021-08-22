package student_josifs_makarenko.lesson_4.level1;

public class Calculator {

    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    Calculator() {
        this.number = getNumber();
    }
        void showWhatIsYourNumber(){
            if (number >= 0) {
                System.out.println("Your number is positive");
            } else if (number < 0) {
                System.out.println("Your number is negative");
            } else if (number == 0) {
                System.out.println("Your number = 0");
            }
        }
        void evenOdd(){
            if (getNumber() % 2 == 0){
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
            }
        }

    }
