package student_daniel.lesson9.level4;

import java.util.Objects;

public class TempConverterTest {
    //Task 11 12
    public static void main(String[] args) {
        TempConverterTest myTest = new TempConverterTest();
        myTest.testCelsius();
        myTest.testKelvin();
        myTest.testFahrenheit();
    }

    //Color Theme
    String resetColor = "\u001B[0m";
    String redColor = "\u001B[31m";
    String blueColor = "\u001B[36m";
    String greenColor = "\u001B[32m";

    //Tests
    void testCelsius() {
        CelsiusConverter myCelsius = new CelsiusConverter();
        double expectedResult = 1.0;
        double actualResult = myCelsius.convert(1.0);
        check(expectedResult, actualResult, "Celsius Temperature: " + actualResult);
    }

    void testKelvin() {
        KelvinConverter myKelvin = new KelvinConverter();
        double expectedResult = 173.15;
        double actualResult = Math.round(myKelvin.convert(-100.0) * 100.0) / 100.0;
        check(expectedResult, actualResult, "Kelvin Temperature: " + actualResult);
    }

    void testFahrenheit() {
        FahrenheitConverter myFahrenheit = new FahrenheitConverter();
        double expectedResult = 122.0;
        double actualResult = myFahrenheit.convert(50.0);
        check(expectedResult, actualResult, "Fahrenheit Temperature: " + actualResult);
    }

    void check(double expectedResult, double actualResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(greenColor + "Test PASSED: " + blueColor + testName + resetColor);
        } else {
            System.out.println(redColor + "Test FAILED: " + blueColor + testName + resetColor);
        }
    }
}
