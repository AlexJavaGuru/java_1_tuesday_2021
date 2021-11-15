package student_julija_kuzmicova.lesson_8.level_4;

//Task_17
class SquareTest {

    Square square = new Square("Square", 3);

    public static void main(String[] args) {

        SquareTest squareTest = new SquareTest();
        squareTest.calculateAreaTest();
        squareTest.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        checkResult(9, square.calculateArea(), "calculateAreaTest");
    }

    void calculatePerimeterTest() {
        checkResult(12, square.calculatePerimeter(), "calculatePerimeterTest");
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
