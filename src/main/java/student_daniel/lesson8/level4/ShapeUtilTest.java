package student_daniel.lesson8.level4;

import java.util.Objects;

public class ShapeUtilTest {
    //Task 20 21 22 23 24 25 26 27 28
    public static void main(String[] args) {
        Shape[] shapesArray = new Shape[4];
        shapesArray[0] = myShapes.createRandomCircle();
        shapesArray[1] = myShapes.createRandomSquare();
        shapesArray[2] = myShapes.createRandomRectangle();
        shapesArray[3] = myShapes.createRandomTriangle();

        ShapeUtilTest myTest = new ShapeUtilTest();
        myTest.calculateAreaTest(shapesArray);
        myTest.calculatePerimeterTest(shapesArray);
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    private static final ShapeUtil myShapes = new ShapeUtil();

    //Test
    void calculateAreaTest(Shape[] shapesArray) {
        double expectedResult = myShapes.calculateArea(shapesArray);
        double actualResult = myShapes.calculateArea(shapesArray);
        check(expectedResult, actualResult, "Area = " + actualResult);
    }

    void calculatePerimeterTest(Shape[] shapesArray) {
        double expectedResult = myShapes.calculatePerimeter(shapesArray);
        double actualResult = myShapes.calculatePerimeter(shapesArray);
        check(expectedResult, actualResult, "Perimeter = " + actualResult);
    }

    void check(double expectedResult, double actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
