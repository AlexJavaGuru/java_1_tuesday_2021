package student_einars_marhilevics.lesson_9.level_5;

public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
