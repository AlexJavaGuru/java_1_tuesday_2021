package student_einars_marhilevics.lesson_8.level_4;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.triangleArea();
        triangleTest.trianglePerimeter();
    }
    void triangleArea() {
        Triangle triangle = new Triangle("Triangle",5);
        double result = Math.round(triangle.calculateArea());
        check(result == 11, "triangleArea");
    }
    void trianglePerimeter() {
        Triangle triangle = new Triangle("Triangle",5);
        double result = triangle.calculatePerimeter();
        check(result == 15, "trianglePerimeter");
    }
    void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
