package student_einars_marhilevics.lesson_8.level_4;

public class CircleTest{
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.circleArea();
        circleTest.circlePerimeter();
    }
    void circleArea() {
        Circle circle = new Circle("Circle",5);
        double result = circle.calculateArea();
        check(result == 78.5, "circleArea");
    }
    void circlePerimeter() {
        Circle circle = new Circle("Circle",5);
        double result = Math.round(circle.calculatePerimeter());
        check(result == 31, "circlePerimeter");
    }
    void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
