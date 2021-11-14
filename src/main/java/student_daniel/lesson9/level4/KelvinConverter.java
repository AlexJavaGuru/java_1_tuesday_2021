package student_daniel.lesson9.level4;

public class KelvinConverter implements TemperatureConverter {
    //Task 11 12
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
