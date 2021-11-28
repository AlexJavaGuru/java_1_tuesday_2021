package student_sergej_pereligin.lesson_8.level_4;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.calculateAreaTest();
        circleTest.calculatePerimeterTest();
    }


    public void calculateAreaTest() {
        Circle circle = new Circle("RoundyRound", 3);
        double actualResult = circle.calculateArea();
        double expectedResult = 28.26;
        checkResults(actualResult, expectedResult, "calculateAreaTest");


    }

    public void calculatePerimeterTest(){
        Circle circle = new Circle("RoundyRound", 3);
        double actualResult = circle.calculatePerimeter();
        double expectedResult = 18.84;
        checkResults(expectedResult, actualResult, "calculatePerimeterTest");
    }

    public void checkResults(double actualResult, double expectedResult, String testName){
        if (actualResult == expectedResult){
            System.out.println("Test " + testName + " passed!");
        }
        else{
            System.out.println("Test " + testName + " failed!");
        }
    }

}
