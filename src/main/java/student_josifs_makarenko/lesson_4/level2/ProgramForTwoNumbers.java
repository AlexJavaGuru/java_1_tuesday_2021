package student_josifs_makarenko.lesson_4.level2;

public class ProgramForTwoNumbers {

    double numberOne;
    double numberTwo;

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    void largerNumber(){
        if (getNumberOne() < getNumberTwo()) {
            System.out.println(getNumberTwo() + " the largest number");
        } else if (getNumberOne() > getNumberTwo()) {
            System.out.println(getNumberOne() + " the largest number");
        }
    }

    void lesserNumber(){
        if (getNumberOne() < getNumberTwo()) {
            System.out.println(getNumberOne() + " the least number");
        } else if (getNumberOne() > getNumberTwo()) {
            System.out.println(getNumberTwo() + " the least number");
        }
    }

    void equalOrDifferent(){
        if (getNumberOne() == getNumberTwo()){
            System.out.println("Numbers are equals");
        } else if (getNumberOne() != getNumberTwo()){
            System.out.println("Numbers are different");
        }
    }

}
