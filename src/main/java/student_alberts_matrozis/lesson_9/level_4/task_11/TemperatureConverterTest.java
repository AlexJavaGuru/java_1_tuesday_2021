package student_alberts_matrozis.lesson_9.level_4.task_11;

import static student_alberts_matrozis.albertsUtils.Utils.check;

public class TemperatureConverterTest {

    public static void main(String[] args) {
        fahrenheitTest();
        kelvinTest();
    }

    static void fahrenheitTest() {
        CelsiumToFahrenheit converter = new CelsiumToFahrenheit();
        double receivedResult = converter.temperatureConverter(0);
        double excepterResult = 32.0;
        check(receivedResult, excepterResult);
    }

    static void kelvinTest() {
        CelsiumToKelvin converter = new CelsiumToKelvin();
        double receivedResult = converter.temperatureConverter(11);
        double exceptedResult = 284.15;
        check(receivedResult, exceptedResult);
    }
}
