package student_josifs_makarenko.lesson_9.level7;

public class CelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double temperatureValue, Temperature temperature) {
        if (temperature == Temperature.CELSIUS) {
            return temperatureValue;
        } else if (temperature == Temperature.KELVIN) {
            return temperatureValue - 273.15;
        }
        return (temperatureValue - 32) / 1.8;
    }
}
