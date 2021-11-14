package student_oleg_kozlov.lesson_12.level_4;

// Task_26
class StackOverflowErrorDemo {
    public static void main(String[] args) {
        try {
            method();
        } catch (StackOverflowError e) {
            e.printStackTrace();
        }
    }

    private static void method() {
        method();
    }
}
