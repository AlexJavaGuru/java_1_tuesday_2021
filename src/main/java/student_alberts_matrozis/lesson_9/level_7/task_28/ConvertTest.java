package student_alberts_matrozis.lesson_9.level_7.task_28;

import static student_alberts_matrozis.albertsUtils.Utils.*;

public class ConvertTest {
    public static void main(String[] args) {
        ConvertTest test = new ConvertTest();
        test.CelsiumToFahrenheitTest();
        test.CelsiumToKelvinTest();
        test.KelvinToCelsiumTest();
        test.KelvinToFahrenheit();
        test.FahrenheitToCelsium();
        test.FahrenheitToKelvin();
    }

    public void CelsiumToFahrenheitTest() {
        ConvertStrategy converter = new CelsiumToFahrenheitConverter();
        double receivedResult = converter.convert(15);
        double exceptedResult = 59;
        check(receivedResult, exceptedResult);
    }

    public void CelsiumToKelvinTest() {
        ConvertStrategy converter = new CelsiumToKelvinConverter();
        double receivedResult = converter.convert(15);
        double exceptedResult = 288.15;
        check(receivedResult, exceptedResult);
    }

    public void KelvinToCelsiumTest() {
        ConvertStrategy converter = new KelvinToCelsiumConverter();
        double receivedResult = converter.convert(288);
        double exceptedResult = 14.85;
        check(receivedResult, exceptedResult);
    }

    public void KelvinToFahrenheit() {
        ConvertStrategy converter = new KelvinToFahrenheitConverter();
        double receivedResult = converter.convert(300);
        double exceptedResult = 80.33;

        check(receivedResult, exceptedResult);
    }

    public void FahrenheitToCelsium() {
        ConvertStrategy converter = new FahrenheitToCelsiumConverter();
        double receivedResult = converter.convert(200);
        double exceptedResult = 93.33;
        check(receivedResult, exceptedResult);
    }

    public void FahrenheitToKelvin() {
        ConvertStrategy converter = new FahrenheitToKelvinConverter();
        double receivedResult = converter.convert(22);
        double exceptedResult = 267.59;
        check(receivedResult, exceptedResult);
    }
}
