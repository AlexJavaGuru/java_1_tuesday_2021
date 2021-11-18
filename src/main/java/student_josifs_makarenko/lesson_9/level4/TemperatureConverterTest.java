package student_josifs_makarenko.lesson_9.level4;
//task11,12
public class TemperatureConverterTest {

    public static void main(String[] args) {
        convertToKelvinTest();
        convertToFahrenheit();
    }

    static void convertToKelvinTest() {
        TemperatureConverter temperatureConverter = new ConvertToKelvin();
        check(temperatureConverter.convert(15) == 288.15, "KelvinTest");
    }

    static void convertToFahrenheit() {
        TemperatureConverter temperatureConverter = new ConvertToFahrenheit();
        check(temperatureConverter.convert(10) == 50, "FahrenheitTest");
    }

    public static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }
}
