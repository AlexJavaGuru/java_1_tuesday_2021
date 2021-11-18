package student_julija_kuzmicova.lesson_9.level_4;

//Task_12
class TemperatureConverterTest {

    KelvinConverterImpl kelvin = new KelvinConverterImpl();
    FahrenheitConverterImpl fahrenheit = new FahrenheitConverterImpl();

    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.convertToKelvinTest();
        test.convertToFahrenheitTest();
    }

    void convertToKelvinTest() {
        checkResult(293.15, kelvin.convert(20), "convertToKelvinTest");
    }

    void convertToFahrenheitTest() {
        checkResult(68, fahrenheit.convert(20), "convertToFahrenheitTest");
    }

    void checkResult(double expectedResult, double actualResult, String testName){
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }


}
