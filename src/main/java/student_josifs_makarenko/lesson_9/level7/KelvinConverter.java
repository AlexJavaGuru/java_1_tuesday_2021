package student_josifs_makarenko.lesson_9.level7;

public class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double temperatureValue, Temperature temperature) {
        if (temperature == Temperature.CELSIUS) {
            return temperatureValue + 273.15;
        } else if (temperature == Temperature.FAHRENHEIT) {
            return (temperatureValue - 32) * 5 / 9 + 273.15;
        }
        return temperatureValue;
    }
}
