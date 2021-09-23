package student_einars_marhilevics.lesson_8.level_4;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateArea();
        shapeUtilTest.calculatePerimeter();
    }
    void calculateArea(Shape[] shapes) {
        ShapeUtil shapeUtil = new ShapeUtil();
        double result = shapeUtil.calculateArea(shapes);
        check (result == 0, "calculateArea ");
    }

    void calculatePerimeter(Shape[] shapes) {
        ShapeUtil shapeUtil = new ShapeUtil();
        double result = shapeUtil.calculatePerimeter(shapes);
        check (result == 0, "calculatePerimeter ");
    }

    void check (boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
