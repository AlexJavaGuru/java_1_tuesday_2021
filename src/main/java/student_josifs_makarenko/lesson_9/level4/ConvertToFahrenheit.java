package student_josifs_makarenko.lesson_9.level4;
//task 11,12
public class ConvertToFahrenheit implements TemperatureConverter {
    @Override
    public double convert(double temperatureInCelsius) {
        return temperatureInCelsius * 1.8 + 32;
    }
}
