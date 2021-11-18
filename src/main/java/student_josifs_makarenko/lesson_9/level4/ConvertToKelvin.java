package student_josifs_makarenko.lesson_9.level4;
//task11,12
public class ConvertToKelvin implements TemperatureConverter {
    @Override
    public double convert(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15;
    }
}
