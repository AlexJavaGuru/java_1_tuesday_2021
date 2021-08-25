package student_josifs_makarenko.lesson_4.level3;

public class ProgramForThreeNumbera {

    int numberOne;
    int numberTwo;
    int numberThree;

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(int numberThree) {
        this.numberThree = numberThree;
    }

    void equalOrDifferent(){
        if (getNumberOne() == getNumberTwo() && getNumberOne() == getNumberThree() && getNumberTwo() == getNumberThree()) {
            System.out.println("All numbers are equal");
        } else if (getNumberOne() != getNumberTwo() && getNumberOne() != getNumberThree() && getNumberTwo() != getNumberThree()) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    void increasingOrDecreasing(){
        if (getNumberOne() < getNumberTwo() && getNumberTwo() < getNumberThree()) {
            System.out.println("increasing");
        } else if (getNumberOne() > getNumberTwo() && getNumberTwo() > getNumberThree()){
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    void lagerNumber(){
        if (getNumberOne() > getNumberThree() && getNumberOne() > getNumberThree()) {
            System.out.println(getNumberOne() + " the largest");
        } else if (getNumberTwo() > getNumberOne() && getNumberTwo() > getNumberThree()) {
            System.out.println(getNumberTwo() + " the largest");
        } else if (getNumberThree() > getNumberOne() && getNumberThree() > getNumberTwo()) {
            System.out.println(getNumberThree() + " the largest");
        } else if (getNumberTwo() == getNumberThree() && getNumberTwo() < getNumberOne()) {
            System.out.println(getNumberOne() + " the largest");
        } else if (getNumberOne() == getNumberThree() && getNumberOne() < getNumberTwo()) {
            System.out.println(getNumberTwo() + " the largest");
        } else if (getNumberThree() == getNumberOne() && getNumberThree() < getNumberTwo()) {
            System.out.println(getNumberTwo() + " the largest");
        } else if (getNumberThree() == getNumberTwo() && getNumberThree() == getNumberOne()){
            System.out.println("Numbers are equal");
        }
    }

    void leastNumber(){
        if (getNumberOne() < getNumberThree() && getNumberOne() < getNumberThree()) {
            System.out.println(getNumberOne() + " the least");
        } else if (getNumberTwo() < getNumberOne() && getNumberTwo() < getNumberThree()) {
            System.out.println(getNumberTwo() + " the least");
        } else if (getNumberThree() < getNumberOne() && getNumberThree() < getNumberTwo()) {
            System.out.println(getNumberThree() + " the least");
        } else if (getNumberTwo() == getNumberThree() && getNumberTwo() > getNumberOne()) {
            System.out.println(getNumberOne() + " the least");
        } else if (getNumberOne() == getNumberThree() && getNumberOne() > getNumberTwo()) {
            System.out.println(getNumberTwo() + " the least");
        } else if (getNumberThree() == getNumberOne() && getNumberThree() > getNumberTwo()) {
            System.out.println(getNumberTwo() + " the least");
        } else if (getNumberThree() == getNumberTwo() && getNumberThree() == getNumberOne()){
            System.out.println("Numbers are equal");
        }
    }
}
