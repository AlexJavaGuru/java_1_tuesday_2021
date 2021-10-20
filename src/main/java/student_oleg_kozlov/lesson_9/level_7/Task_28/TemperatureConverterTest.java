package student_oleg_kozlov.lesson_9.level_7.Task_28;

// Task_28
class TemperatureConverterTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    public static void main(String[] args) {
        shouldConvertCelsiusToCelsiusTest();
        shouldConvertCelsiusToFahrenheitTest();
        shouldConvertCelsiusToKelvinTest();
        shouldConvertFahrenheitToCelsiusTest();
        shouldConvertFahrenheitToFahrenheitTest();
        shouldConvertFahrenheitToKelvinTest();
        shouldConvertKelvinToCelsiusTest();
        shouldConvertKelvinToFahrenheitTest();
        shouldConvertKelvinToKelvinTest();
        printFooter();
    }

    private static void shouldConvertCelsiusToCelsiusTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.CELSIUS_TO_CELSIUS);
        checkResult(10, conversion.runConversion(10),"shouldConvertCelsiusToCelsiusTest");
    }

    private static void shouldConvertCelsiusToFahrenheitTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.CELSIUS_TO_FAHRENHEIT);
        checkResult(50, conversion.runConversion(10),"shouldConvertCelsiusToFahrenheitTest");
    }

    private static void shouldConvertCelsiusToKelvinTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.CELSIUS_TO_KELVIN);
        checkResult(283.15, conversion.runConversion(10),"shouldConvertCelsiusToKelvinTest");
    }

    private static void shouldConvertFahrenheitToCelsiusTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.FAHRENHEIT_TO_CELSIUS);
        checkResult(-12.222222222222223, conversion.runConversion(10),"shouldConvertFahrenheitToCelsiusTest");
    }

    private static void shouldConvertFahrenheitToFahrenheitTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.FAHRENHEIT_TO_FAHRENHEIT);
        checkResult(10, conversion.runConversion(10),"shouldConvertFahrenheitToFahrenheitTest");
    }

    private static void shouldConvertFahrenheitToKelvinTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.FAHRENHEIT_TO_KELVIN);
        checkResult(260.92777777777775, conversion.runConversion(10),"shouldConvertFahrenheitToKelvinTest");
    }

    private static void shouldConvertKelvinToCelsiusTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.KELVIN_TO_CELSIUS);
        checkResult(-263.15, conversion.runConversion(10),"shouldConvertKelvinToCelsiusTest");
    }

    private static void shouldConvertKelvinToFahrenheitTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.KELVIN_TO_FAHRENHEIT);
        checkResult(-441.66999999999996, conversion.runConversion(10),"shouldConvertKelvinToFahrenheitTest");
    }

    private static void shouldConvertKelvinToKelvinTest() {
        totalRun++;
        ConversionContext conversion = new ConversionContext(ConversionStrategy.KELVIN_TO_KELVIN);
        checkResult(10, conversion.runConversion(10),"shouldConvertKelvinToKelvinTest");
    }

    private static void checkResult(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual:   " + actual + TEXT_RESET);
            totalFailed++;
        }
    }

    private static void printFooter() {
        System.out.println("********************************************");
        if (totalFailed > 0) {
            System.out.println(TEXT_RED + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        } else {
            System.out.println(TEXT_GREEN + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        }
        System.out.println("********************************************");
    }
}
