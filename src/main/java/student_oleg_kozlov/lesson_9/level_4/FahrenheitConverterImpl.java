package student_oleg_kozlov.lesson_9.level_4;

// Task_12
public class FahrenheitConverterImpl implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
