package student_sergej_pereligin.lesson_8.level_4;


public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.calculateAreaTest();
        rectangleTest.calculatePerimeterTest();
    }

    void calculateAreaTest(){
        Rectangle rectangle = new Rectangle("Rectangle", 2, 3);
        double actualResult = rectangle.calculateArea();
        double expectedResult = 6;
        checkResults(actualResult, expectedResult, "calculateAreaTest");
    }

    void calculatePerimeterTest(){
        Rectangle rectangle = new Rectangle("Rectangle", 2, 3);
        double actualResult = rectangle.calculatePerimeter();
        double expectedResult = 10;
        checkResults(actualResult, expectedResult, "calculatePerimeterTest");
    }



    public void checkResults(double expectedResult, double actualResult, String testName){
        if (expectedResult == actualResult){
            System.out.println("Test " + testName + " passed!");
        }
        else {
            System.out.println("Test " + testName + " failed!");
        }
    }
}
