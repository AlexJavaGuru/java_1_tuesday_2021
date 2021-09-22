package student_daniel.lesson7;

public class Encapsulation {
    // private access modifier(highest)
    // can be set on fields / constructors / methods

    // package private access modifier (default)
    // allow access to everything inside package

    // public access modifier
    // allow access to everything from anywhere

    // examples below

    private int count;

    Encapsulation() {
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void clear() {
        count = 0;
    }

    public void setCount(int count) {
        if (isPositive(count)) {
            this.count = count;
        } else {
            clear();
        }
    }

    private boolean isPositive(int value) {
        return value > 0;
    }

    public int getCount() {
        return count;
    }
}
