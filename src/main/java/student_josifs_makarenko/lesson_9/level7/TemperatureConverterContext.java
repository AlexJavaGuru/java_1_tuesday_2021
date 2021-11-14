package student_josifs_makarenko.lesson_9.level7;

public class TemperatureConverterContext {
    private final TemperatureConverter temperatureConverter;

    public TemperatureConverterContext (TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    public double executeContext (Temperature temperature, double temperatureValue) {
        return temperatureConverter.convert(temperatureValue, temperature);
    }
}
