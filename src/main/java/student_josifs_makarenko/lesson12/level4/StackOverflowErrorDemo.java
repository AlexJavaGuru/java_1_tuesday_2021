package student_josifs_makarenko.lesson12.level4;

public class StackOverflowErrorDemo {
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
