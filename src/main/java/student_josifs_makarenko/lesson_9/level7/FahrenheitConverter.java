package student_josifs_makarenko.lesson_9.level7;

public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double temperatureValue, Temperature temperature) {
        if (temperature == Temperature.CELSIUS) {
            return temperatureValue * 1.8 + 32;
        } else if (temperature == Temperature.KELVIN) {
            return (temperatureValue - 273.15) * 9 / 5 + 32;
        }
        return temperatureValue;
    }
}
