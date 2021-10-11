package student_oleg_kozlov.lesson_9.level_7.Task_28;

// Task_28
class FahrenheitToKelvinConverterImpl implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        return (5.0 / 9.0) * (temperature - 32) + 273.15;
    }
}
