package student_josifs_makarenko.lesson_9.level7;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
        temperatureConverterTest.celsiusConverterTest1();
        temperatureConverterTest.celsiusConverterTest2();
        temperatureConverterTest.celsiusConverterTest3();

        temperatureConverterTest.fahrenheitConverterTest1();
        temperatureConverterTest.fahrenheitConverterTest2();
        temperatureConverterTest.fahrenheitConverterTest3();

        temperatureConverterTest.kelvinConverterTest1();
        temperatureConverterTest.kelvinConverterTest2();
        temperatureConverterTest.kelvinConverterTest3();

    }

    void celsiusConverterTest1() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        check(temperatureConverter.convert(1, Temperature.CELSIUS) == 1, "CelsiusConverter TEST");
    }

    void celsiusConverterTest2() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        check(temperatureConverter.convert(5, Temperature.FAHRENHEIT) == -15, "CelsiusConverter TEST");
    }

    void celsiusConverterTest3() {
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        check(temperatureConverter.convert(15, Temperature.KELVIN) == -258.15, "CelsiusConverter TEST");
    }

    void fahrenheitConverterTest1() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        check(temperatureConverter.convert(1, Temperature.FAHRENHEIT) == 1, "FahrenheitConverter TEST");
    }

    void fahrenheitConverterTest2() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        check(temperatureConverter.convert(1, Temperature.CELSIUS) == 33.8, "FahrenheitConverter TEST");
    }

    void fahrenheitConverterTest3() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        check(temperatureConverter.convert(5, Temperature.KELVIN) == -450.66999999999996, "FahrenheitConverter TEST");
    }

    void kelvinConverterTest1() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        check(temperatureConverter.convert(1, Temperature.KELVIN) == 1, "KelvinConverter TEST") ;
    }

    void kelvinConverterTest2() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        check(temperatureConverter.convert(1, Temperature.FAHRENHEIT) == 255.92777777777775, "KelvinConverter TEST") ;
    }

    void kelvinConverterTest3() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        check(temperatureConverter.convert(1, Temperature.CELSIUS) == 274.15, "KelvinConverter TEST") ;
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is not OK! WORK HARDER! ");
        }
    }
}
