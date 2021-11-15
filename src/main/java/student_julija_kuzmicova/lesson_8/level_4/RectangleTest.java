package student_julija_kuzmicova.lesson_8.level_4;

//Task_18
class RectangleTest {

    Rectangle rectangle = new Rectangle("Rectangle", 4, 3);

    public static void main(String[] args) {

        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.calculateAreaTest();
        rectangleTest.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        checkResult(12, rectangle.calculateArea(), "calculateAreaTest");
    }

    void calculatePerimeterTest() {
        checkResult(14, rectangle.calculatePerimeter(), "calculatePerimeterTest");
    }

    void checkResult(double expectedResult, double actualResult, String testName){
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
