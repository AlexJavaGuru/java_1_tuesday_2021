package student_oleg_kozlov.lesson_9.level_4;

// Task_11
class TemperatureConverterFromCelsiusTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    public static void main(String[] args) {
        shouldConvertToKelvinTest();
        shouldConvertToFahrenheitTest();
        printFooter();
    }

    private static void shouldConvertToKelvinTest() {
        totalRun++;
        KelvinTemperatureImpl kelvin = new KelvinTemperatureImpl();
        checkResult(283.15, kelvin.convertFromCelsius(10), "shouldConvertToKelvinTest");
    }

    private static void shouldConvertToFahrenheitTest() {
        totalRun++;
        FahrenheitTemperatureImpl fahrenheit = new FahrenheitTemperatureImpl();
        checkResult(50, fahrenheit.convertFromCelsius(10), "shouldConvertToFahrenheitTest");
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
