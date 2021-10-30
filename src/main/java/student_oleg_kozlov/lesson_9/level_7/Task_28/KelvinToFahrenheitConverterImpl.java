package student_oleg_kozlov.lesson_9.level_7.Task_28;

// Task_28
class KelvinToFahrenheitConverterImpl implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return (9.0 / 5.0) * (temperature - 273.15 ) + 32;
    }
}
