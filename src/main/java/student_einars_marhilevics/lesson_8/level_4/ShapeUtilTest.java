package student_einars_marhilevics.lesson_8.level_4;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateArea();
        shapeUtilTest.calculatePerimeter();
    }
    void calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
    }

    void calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
    }

    void check (boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
