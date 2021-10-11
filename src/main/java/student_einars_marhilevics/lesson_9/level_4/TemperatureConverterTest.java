package student_einars_marhilevics.lesson_9.level_4;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.fahrenheitConverter();
        temperatureConverterTest.kelvinConverter();
    }

    void fahrenheitConverter() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double result = fahrenheitConverter.convert(10);
        check(result == 50, "Test fahrenheitConverter");
    }

    void kelvinConverter() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double result = kelvinConverter.convert(10);
        check(result == 283.15, "Test kelvinConverter");
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
