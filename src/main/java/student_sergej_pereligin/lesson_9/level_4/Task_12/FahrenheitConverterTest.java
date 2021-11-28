package student_sergej_pereligin.lesson_9.level_4.Task_12;


public class FahrenheitConverterTest {
    public static void main(String[] args) {

        FahrenheitConverterTest fahrenheitConverterTest = new FahrenheitConverterTest();
        fahrenheitConverterTest.converterTest();

    }

    public void converterTest() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double actualRes = fahrenheitConverter.convert(24);
        double expectedRes = 75.2;
        checkRes(actualRes, expectedRes, "converterTest");

    }


    public void checkRes(double expectedRes, double actualRes, String testName) {
        if (expectedRes == actualRes) {
            System.out.println("Test " + testName + " passed.");
        } else {
            System.out.println("Test " + testName + " failed");
        }
    }

}
