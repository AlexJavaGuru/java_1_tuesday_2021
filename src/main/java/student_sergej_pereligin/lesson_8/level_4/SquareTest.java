package student_sergej_pereligin.lesson_8.level_4;


public class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.calculateAreaTest();
        squareTest.calculatePerimeterTest();

    }

    public void calculateAreaTest(){
        Square square = new Square("Square", 5);
        double expectedResult = 25;
        double actualResult = square.calculateArea();
        checkResults(actualResult, expectedResult, "calculateAreaTest");
    }


    public void calculatePerimeterTest(){
        Square square = new Square("Square", 5);
        double expectedResult = 20;
        double actualResult = square.calculatePerimeter();
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
