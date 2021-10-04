package student_einars_marhilevics.lesson_8.level_4;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.squareArea();
        squareTest.squarePerimeter();
    }
    void squareArea() {
        Square square = new Square("Square",5);
        double result = square.calculateArea();
        check(result == 25, "squareArea");
    }
    void squarePerimeter() {
        Square square = new Square("Square",5);
        double result = square.calculatePerimeter();
        check(result == 20, "squarePerimeter");
    }
    void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
