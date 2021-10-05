package student_einars_marhilevics.lesson_8.level_4;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.rectangleArea();
        rectangleTest.rectanglePerimeter();
    }
    void rectangleArea() {
        Rectangle rectangle = new Rectangle("Rectangle",5, 4);
        double result = rectangle.calculateArea();
        check(result == 20, "rectangleArea");
    }
    void rectanglePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle",5, 4);
        double result = rectangle.calculatePerimeter();
        check(result == 18, "rectanglePerimeter");
    }
    void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
