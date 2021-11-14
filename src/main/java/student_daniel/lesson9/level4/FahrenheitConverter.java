package student_daniel.lesson9.level4;

public class FahrenheitConverter implements TemperatureConverter {
    //Task 11 12
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
