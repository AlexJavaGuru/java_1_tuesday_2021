package teacher.lesson_7_encapsulation.lessoncode;

public class BasicCounter {

    private int count;

    BasicCounter() {
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    void clear() {
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
