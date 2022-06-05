package student_daniel.lesson8.level4;

import java.util.Objects;

public class ShapeTest {
    //Task 16
    public static void main(String[] args) {
        ShapeTest myShapeTest = new ShapeTest();
        myShapeTest.circleTestArea();
        myShapeTest.circleTestPerimeter();
        myShapeTest.squareTestArea();
        myShapeTest.squareTestPerimeter();
        myShapeTest.rectangleTestArea();
        myShapeTest.rectangleTestPerimeter();
        myShapeTest.triangleTestArea();
        myShapeTest.triangleTestPerimeter();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    //Tests
    void circleTestArea() {
        Circle myCircle = new Circle(5,"Circle");
        double expectedResult = 78.53981633974483;
        double actualResult = myCircle.calculateArea();
        check(expectedResult, actualResult, "Circle Area = " + actualResult);
    }

    void circleTestPerimeter() {
        Circle myCircle = new Circle(5,"Circle");
        double expectedResult = 31.41592653589793;
        double actualResult = myCircle.calculatePerimeter();
        check(expectedResult, actualResult, "Circle Perimeter = " + actualResult);
    }

    void squareTestArea() {
        Square mySquare = new Square(5,"Square");
        double expectedResult = 25;
        double actualResult = mySquare.calculateArea();
        check(expectedResult, actualResult, "Square Area = " + actualResult);
    }

    void squareTestPerimeter() {
        Square mySquare = new Square(5,"Square");
        double expectedResult = 20;
        double actualResult = mySquare.calculatePerimeter();
        check(expectedResult, actualResult, "Square Perimeter = " + actualResult);
    }

    void rectangleTestArea() {
        Rectangle myRectangle = new Rectangle(5, 10,"Rectangle");
        double expectedResult = 50;
        double actualResult = myRectangle.calculateArea();
        check(expectedResult, actualResult, "Rectangle Area = " + actualResult);
    }

    void rectangleTestPerimeter() {
        Rectangle myRectangle = new Rectangle(5, 10,"Rectangle");
        double expectedResult = 30;
        double actualResult = myRectangle.calculatePerimeter();
        check(expectedResult, actualResult, "Rectangle Perimeter = " + actualResult);
    }

    void triangleTestArea() {
        Triangle myTriangle = new Triangle(5, 10,5,5,5,"Triangle");
        double expectedResult = 25;
        double actualResult = myTriangle.calculateArea();
        check(expectedResult, actualResult, "Triangle Area = " + actualResult);
    }

    void triangleTestPerimeter() {
        Triangle myTriangle = new Triangle(5, 10,5,5,5,"Triangle");
        double expectedResult = 15;
        double actualResult = myTriangle.calculatePerimeter();
        check(expectedResult, actualResult, "Triangle Perimeter = " + actualResult);
    }

    void check(double expectedResult, double actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
