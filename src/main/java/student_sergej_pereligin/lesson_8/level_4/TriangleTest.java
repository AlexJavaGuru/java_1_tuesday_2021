package student_sergej_pereligin.lesson_8.level_4;


public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.calculateAreaTest();
        triangleTest.calculatePerimeterTest();
    }

    public void calculateAreaTest(){
        Triangle triangle = new Triangle("Triangle", 4);
        double actualResult = triangle.calculateArea();
        //System.out.println(actualResult);
        double expectedResult = 7;
        checkResults(actualResult, expectedResult, "calculateAreaTest");

    }

    public void calculatePerimeterTest(){
        Triangle triangle = new Triangle("Triangle", 5);
        double actualResult = triangle.calculatePerimeter();
        double expectedResult = 15;
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
