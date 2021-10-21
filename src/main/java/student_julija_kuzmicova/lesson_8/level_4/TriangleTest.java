package student_julija_kuzmicova.lesson_8.level_4;

//Task_19
class TriangleTest {

    Triangle triangle = new Triangle("Triangle", 4);

    public static void main(String[] args) {

        TriangleTest triangleTest = new TriangleTest();
        triangleTest.calculateAreaTest();
        triangleTest.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        checkResult(6.928203230275509, triangle.calculateArea(), "calculateAreaTest");
    }

    void calculatePerimeterTest() {
        checkResult(12, triangle.calculatePerimeter(), "calculatePerimeterTest");
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
