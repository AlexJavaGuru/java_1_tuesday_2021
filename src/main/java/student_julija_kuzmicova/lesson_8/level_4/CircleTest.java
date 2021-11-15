package student_julija_kuzmicova.lesson_8.level_4;

//Task_16
class CircleTest {

    Circle circle = new Circle("circle", 4);

    public static void main(String[] args) {

        CircleTest circleTest = new CircleTest();
        circleTest.calculateAreaTest();
        circleTest.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        checkResult(50.26548245743669, circle.calculateArea(), "calculateAreaTest");
    }

    void calculatePerimeterTest() {
        checkResult(25.132741228718345, circle.calculatePerimeter(), "calculatePerimeterTest");
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
